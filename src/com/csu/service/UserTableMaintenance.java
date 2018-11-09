package com.csu.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import com.csu.utils.CsuServletRequest;
import com.csu.utils.DBConnection;

public class UserTableMaintenance {

	private static final String CLASSNAME = UserTableMaintenance.class.getName();
	
	private HttpServletRequest request;
	
	private String uname;

	private String psw;
	
	public static boolean validateUser(String userName, String password,HttpServletRequest request) throws Exception {

		final String METHOD = "validateUser";

		Connection connection = null;

		ResultSet rsUser = null;

		PreparedStatement psUser = null;

		boolean isUser = false;

		try {
			
			HttpSession session = request.getSession();

			connection = DBConnection.getConnection();

			String str = "SELECT * FROM HOME.USER WHERE USERID=? AND PASSWORD = ?";
			psUser = connection.prepareStatement(str.toString());

			psUser.setString(1, userName);
			psUser.setString(2, password);

			rsUser = psUser.executeQuery();


			if(rsUser.next()) {
				
				session.setAttribute("userId", rsUser.getString("USERID"));

				isUser= true;
				
			}



		}catch(Exception e) {
			System.err.println("Exception while getting User Details ::"+CLASSNAME+"::"+METHOD+" "+e);
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				if (psUser != null)
					psUser.close();
			} catch (Exception e) {
			}

			try {
				if (rsUser != null)
					rsUser.close();
			} catch (Exception e) {
			}
		}



		return isUser;
	}
	
	
	public String getUserData(HttpServletRequest request) throws IOException {
		
		final String METHOD = "getUserData";

		Connection connection = null;

		ResultSet rsUser = null;

		PreparedStatement psUser = null;
		
		JSONArray jaUser = new JSONArray();
		
		try {
			
			connection = DBConnection.getConnection();

			String name="";
			
			StringBuffer selectQueryUser = new StringBuffer();

			selectQueryUser.append("SELECT * FROM HOME.USER  ");
			
			psUser = connection.prepareStatement(selectQueryUser.toString());

			rsUser = psUser.executeQuery();

			
			while(rsUser.next()) {
				
				JSONObject joUser = new JSONObject();
				name = rsUser.getString("FNAME")+" "+rsUser.getString("LNAME");
				
				joUser.put("userId",rsUser.getString("USERID"));
				joUser.put("name",name);
				joUser.put("email",rsUser.getString("EMAIL"));
				joUser.put("phone",rsUser.getString("phone"));
				
				jaUser.put(joUser);
				
			}

		}catch(Exception e) {
			System.err.println("Exception while getting User Details ::"+CLASSNAME+"::"+METHOD+" "+e);
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				if (psUser != null)
					psUser.close();
			} catch (Exception e) {
			}

			try {
				if (rsUser != null)
					rsUser.close();
			} catch (Exception e) {
			}
		}
		return "{\"items\": " + jaUser.toString() + "}";
//		return jaUser.toString();
	}
	public void addUser(HttpServletRequest request) {
		
		final String METHOD = "addUser";

		Connection connection = null;

		ResultSet rsUser = null;

		PreparedStatement insertUser = null;
		
		try {
			
			connection = DBConnection.getConnection();

			StringBuffer insertQuery = new StringBuffer();
			
			insertQuery.append("INSERT INTO USER (FNAME,LNAME,EMAIL,PHONE,USERID,PASSWORD,EMAIL2) VALUES (?,?,?,?,?,?,?)");
			
			insertUser= connection.prepareStatement(insertQuery.toString());
			
			insertUser.setString(1,CsuServletRequest.getStringParameter(request, "fname", ""));
			insertUser.setString(2,CsuServletRequest.getStringParameter(request, "lname", ""));
			insertUser.setString(3,CsuServletRequest.getStringParameter(request, "email", ""));
			insertUser.setString(4,CsuServletRequest.getStringParameter(request, "phone", ""));
			insertUser.setString(5,CsuServletRequest.getStringParameter(request, "userid", ""));
			insertUser.setString(6,CsuServletRequest.getStringParameter(request, "psw", "ABC"));
			insertUser.setString(7,CsuServletRequest.getStringParameter(request, "email2", ""));
			
			insertUser.executeUpdate();
			
			System.err.println("UserAdded Successfully: "+CsuServletRequest.getStringParameter(request, "userid", ""));
			
		}catch(Exception e) {
			System.err.println("Exception while getting User Details ::"+CLASSNAME+"::"+METHOD+" "+e);
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				if (insertUser != null)
					insertUser.close();
			} catch (Exception e) {
			}

			try {
				if (rsUser != null)
					rsUser.close();
			} catch (Exception e) {
			}
		}
	}
	
	
	
	
	
	
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getServletRequest() {
		return this.request;
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
