<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertTemplate template="/layout/menuBodyFooter.jsp">
	<tiles:putAttribute name="title" value="Homepage" />
  	<tiles:putAttribute name="menu" value="/com.csu.utils/menu.jsp"  />
  	<tiles:putAttribute name="body" value="/com.csu.home/home_body.jsp"   />
  	<tiles:putAttribute name="footer" value="/com.csu.footer/home_footer.jsp"   />
</tiles:insertTemplate>

