package com.csu.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.csu.service.UserTableMaintenance;
import com.csu.utils.CsuServletRequest;
import com.opensymphony.xwork2.ActionSupport;

public class UserMaintenanceAction extends ActionSupport{
	

	private static final String CLASSNAME = UserMaintenanceAction.class.getName();

	private static final String PKG = UserMaintenanceAction.class.getPackage().getName();

	private static final Logger LOGGER = Logger.getLogger(PKG);

	private HttpServletRequest request;

	private ServletContext servletContext;

	private String uname;

	private String psw;
	
	private String action = "init";
	
	private static String ack = "ack";
	
	private InputStream inputStream;

	public String execute() {

		final String METHOD = "execute";

		if (LOGGER.isLoggable(Level.FINER)) {
			Object[] parms = { request };
			LOGGER.entering(CLASSNAME, METHOD, parms);
		}

		try {
			
			request = ServletActionContext.getRequest();
			action = CsuServletRequest.getStringParameter(request, "action", "init");
			System.err.println("calling action ::: "+action);
			
			if(action.equals("loadPage")) {

					return SUCCESS;

			}else if(action.equals("loadUserDetails")) {
				
				UserTableMaintenance user = new UserTableMaintenance();
				
				this.inputStream = new ByteArrayInputStream(user.getUserData(request).getBytes());	
				
				return "stream";
				
			}else if(action.equals("addUser")) {
				
				UserTableMaintenance user= new UserTableMaintenance();
				
				user.addUser(request);
				
				this.inputStream = new ByteArrayInputStream(ack.getBytes());
				return "streamText";
				
				
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
	
	public InputStream getInputStream() {
		return inputStream;
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
