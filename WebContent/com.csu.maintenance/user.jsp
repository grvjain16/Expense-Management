<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertTemplate template="/layout/menuBody.jsp">
	<tiles:putAttribute name="title" value="User Maintenance" />
  	<tiles:putAttribute name="menu" value="/com.csu.utils/menu.jsp"   />
  	<tiles:putAttribute name="body" value="/com.csu.maintenance/userMaintenance_body.jsp"   />
</tiles:insertTemplate>