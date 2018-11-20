package com.csu.action;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.csu.utils.CsuServletRequest;
import com.opensymphony.xwork2.ActionSupport;

public class ExpenseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private static final String CLASSNAME = ExpenseAction.class.getName();

	private static final String PKG = ExpenseAction.class.getPackage().getName();

	private static final Logger LOGGER = Logger.getLogger(PKG);

	private HttpServletRequest request;

	private ServletContext servletContext;

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

			if(action.equals("loadPage")) {

				return SUCCESS;

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

}
