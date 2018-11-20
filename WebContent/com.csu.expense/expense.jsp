<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertTemplate template="/layout/menuBody.jsp">
	<tiles:putAttribute name="title" value="Expense Management" />
  	<tiles:putAttribute name="menu" value="/com.csu.utils/menu.jsp"   />
  	<tiles:putAttribute name="body" value="/com.csu.expense/expense_body.jsp"   />
</tiles:insertTemplate>