<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.Cookie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.csu.utils.CsuServletRequest"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Expense Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="Styles/css/login.css"/>
<script src="<%=request.getContextPath()%>/Scripts/src/login.js"></script>

</head>
<body>

	<h2>Login Form</h2>

	<form action="login">
  		<div class="container">
	    	<label for="uname"><b>User Name</b></label>
	    	<input type="text" placeholder="Enter Username" name="uname" required ="ture">
	
	    	<label for="psw"><b>Password</b></label>
	    	<input type="password" placeholder="Enter Password" name="psw" required ="ture">
	        
	    	<button type="submit" >Login</button>
	    	<label>
	      		<input type="checkbox" checked="checked" name="remember"> Remember me
	    	</label>
  		</div>

	  	<div class="container" style="background-color:#f1f1f1">
	    	<button type="button" class="cancelbtn">Cancel</button>
	    	<span class="psw">Forgot <a href="#">password?</a></span>
	  	</div>
	</form>
	
	<% 
	if(null!=session.getAttribute("userId")){
		String user = session.getAttribute("userId").toString();
		System.err.println("user:"+user);
	}
	session=request.getSession(false);

	if(session!=null){
		if(null!=session.getAttribute("userId")){
			session.removeAttribute("userId");
			System.err.println("removed");
		}
			session.invalidate();
			//String user1 = session.getAttribute("userId").toString();
 	} %>

</body>
</html>