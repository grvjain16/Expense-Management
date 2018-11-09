<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title><tiles:getAsString name="title"/></title>
	
	<style>
		html, body {
		    width: 100%;
		    height: 100%;
		    padding: 0; 
		    border: 0; 
		  	}
		 #bodyPage{
		    width: 100%;
		    height: 100%;
		     margin-top: 40px;
		 }
		 </style>
</head>
	<body>
	
	  	<div class="topnav"><tiles:insertAttribute name="menu"></tiles:insertAttribute></div>
		<div class=" row">
			
			<div class="w3-panel " id="bodyPage"><tiles:insertAttribute name="body"></tiles:insertAttribute></div>
		</div>
	</body>
</html>