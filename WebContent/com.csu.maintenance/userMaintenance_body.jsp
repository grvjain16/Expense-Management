<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<link rel="stylesheet" href="<%=request.getContextPath()%>/Scripts/jquery-ui-1.12.1.custom 4/jquery-ui.css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/Scripts/jquery.jqGrid-3.8.2/css/ui.jqgrid.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="Styles/css/login.css"/>
<script src="<%=request.getContextPath()%>/Scripts/jquery/jquery-3.3.1.js"></script>
<script src="<%=request.getContextPath()%>/Scripts/jquery.jqGrid-3.8.2/js/jquery-1.4.2.min.js"></script>
<script src="<%=request.getContextPath()%>/Scripts/jquery.jqGrid-3.8.2/js/i18n/grid.locale-en.js"></script>
<script src="<%=request.getContextPath()%>/Scripts/jquery.jqGrid-3.8.2/js/jquery.jqGrid.min.js"></script>
<script src="<%=request.getContextPath()%>/Scripts/src/userMaintenance.js"></script>
<%System.err.println(request.getContextPath());%>

<script>
var contextRoot = <%=request.getContextPath()%>
</script>

<div id="container">
	<div id="toolbar" class="btn-group w3-teal">
		<button type="button" class="btn btn-primary  w3-teal" id="addUserBtn" ><i class="fa fa-plus" "></i>&nbsp;Add</button>
		<button type="button" class="btn btn-primary  w3-teal" id= "editUserBtn" ><i class="fa fa-edit"></i>&nbsp;Edit</button>
		<button type="button" class="btn btn-primary  w3-teal" id= "deleteUserBtn"><i class="fa fa-trash-o"></i>&nbsp;Delete</button>
	</div>
	
	<div id ="bodyContainer">
		<div id="gridPage">
			<table id="user"></table>
			<div id="jqGridPager"></div>
		</div>
		
		<div id="addPage">
			<form id="addPageForm" action="">
				<div id="accordion" class="container">
					<div><br><br></div>
					<div>
						<table  id="maintenanceTable">
							<tr>
								<td><label for="userid">UserID</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your First Name" name="userid" required ="ture"></td>

								<td><label for="lname">Password</label>&nbsp;&nbsp;</td>
								<td><input type="password" placeholder="Enter Your Password" name="psw" required ="ture"></td>
							</tr>
							<tr>
								<td><label for="fname">First Name</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your First Name" name="fname" required ="ture"></td>

								<td><label for="lname">Last Name</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your Last Name" name="lname" required ="ture"></td>
							</tr>
							
							<tr>
								<td><label for="email">Email</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your First Name" name="email" required =""></td>
								
								<td><label for="phone">Phone</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your Phone Number" name="phone" required =""></td>
							</tr>
							
							<tr>
								<td><label for="email2">Email2</label>&nbsp;&nbsp;</td>
								<td><input type="text" placeholder="Enter Your secondary email" name="email2" required =""></td>
								
								<td></td>
								<td></td>
							</tr>
							
							<tr>
								<td align="center" colspan="2" ><button id="save"  class="ui-button ui-widget ui-corner-all">Save</button></td>
								<td align="center" colspan="2" ><button id="cancel"  class="ui-button ui-widget ui-corner-all">Cancel</button></td>
							</tr>
						</table>
					</div>				
				</div>
				<input type="hidden" id="action" name="action" value="addUser">
	
			</form>
		
		
		</div>
		
		<div id="editPage">
		<p>This is edit page</p>
		</div>
	</div>

</div>
<div id="page"></div>