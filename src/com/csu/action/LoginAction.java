package com.csu.action;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

import com.csu.service.UserTableMaintenance;
import com.csu.utils.CsuServletRequest;
import com.opensymphony.xwork2.ActionSupport;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Result;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -7937237150659497111L;

	private static final String CLASSNAME = LoginAction.class.getName();

	private static final String PKG = LoginAction.class.getPackage().getName();

	private static final Logger LOGGER = Logger.getLogger(PKG);

	private HttpServletRequest request;

	private ServletContext servletContext;

	private String uname;

	private String psw;
	
	private String action = "init";
	
	public void vallidate() {
		if(StringUtils.isEmpty(getUname())) {
			addFieldError("uname", "User Name cannot be blank");
		}
		if(StringUtils.isEmpty(getPsw())) {
			addFieldError("psw", "Password Cannot be blank");
		}
	}
	
	public String execute() {

		final String METHOD = "execute";

		if (LOGGER.isLoggable(Level.FINER)) {
			Object[] parms = { request };
			LOGGER.entering(CLASSNAME, METHOD, parms);
		}

		try {
			
			request = ServletActionContext.getRequest();
			action = CsuServletRequest.getStringParameter(request, "action", "init");

			if(action=="init") {

				UserTableMaintenance user = new UserTableMaintenance();

				boolean isUserValid = user.validateUser(getUname(),getPsw(),request);
				System.err.println("User Valid::"+isUserValid);

				if(isUserValid) {
					return SUCCESS;
				}else {
					return LOGIN;
				}

			}else if(action.equals("getUserId")) {
				System.err.println("action = "+action);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		return "success";
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getServletRequest() {
		return this.request;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public ServletContext getServletContext() {
		return this.servletContext;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
}
