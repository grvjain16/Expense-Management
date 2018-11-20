<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
<script src="<%=request.getContextPath()%>/Scripts/src/menu.js"></script>
<div class="w3-top">
	<div class="w3-bar w3-theme-d2 w3-left-align">
		<a href="/HomeApp/" class="w3-bar-item w3-button w3-teal"><i class="fa fa-sign-out w3-margin-right"></i>Logoff</a>
		<a href="/HomeApp/com.csu.home/home.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white"><i class="fa fa-home w3-margin-right"></i>Home</a>
		<a href="#work" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Expense</a>
		<a href="http://localhost:8080/HomeApp/expense/expense.action?action=loadPage" class="w3-bar-item w3-button" onClick="">Expense</a>
		<div class="w3-dropdown-hover w3-hide-small">
			<button class="w3-button" title="Medical">Medical <i class="fa fa-caret-down"></i></button>  
				<div class="w3-dropdown-content w3-card-4 w3-bar-block">
					<button class="w3-button w3-bar-item" id="bloodSugar" title="Blood Sugar">Blood Sugar </button>  
					<!-- <a href="https://www.facebook.com/"target="_blank" class="w3-bar-item w3-button" >Blood Sugar</a> -->
				</div>
		</div>

		<div class="w3-dropdown-hover w3-hide-small">
			<button class="w3-button" title="Favourite">Fav Links <i class="fa fa-caret-down"></i></button>     
			<div class="w3-dropdown-content w3-card-4 w3-bar-block">
				<a href="https://www.facebook.com/"target="_blank" class="w3-bar-item w3-button" >Facebook</a>
				<a href="https://www.coinbase.com/dashboard"target="_blank" class="w3-bar-item w3-button" >Coinbase</a>
				<a href="https://www.instagram.com/"target="_blank" class="w3-bar-item w3-button" >Instagram</a>
				<a href="https://csumoodle.remote-learner.net"target="_blank" class="w3-bar-item w3-button" >CSU Moodle</a>
				<a href="https://www.khanacademy.org"target="_blank" class="w3-bar-item w3-button" >Khan Academy</a>
				<a href="https://www.udemy.com"target="_blank" class="w3-bar-item w3-button" >Udmey</a>
				<a href="https://www.ultimatix.net/"target="_blank" class="w3-bar-item w3-button" >Ultimatix</a>
			</div>
		</div>
		
		<div class="w3-dropdown-hover w3-hide-small">
			<button class="w3-button" title="Notifications">Maintenance <i class="fa fa-caret-down"></i></button>     
			<div class="w3-dropdown-content w3-card-4 w3-bar-block">
				<a href="http://localhost:8080/HomeApp/maintenance/user.action?action=loadPage" class="w3-bar-item w3-button" onClick="userMaintenance();">User Maintenance</a>
			</div>
		</div>
	</div>
​</div>

