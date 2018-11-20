$(document).ready(function (){
	$("#bloodSugar").click(function(){
		openPageBloodSugar();
	});
	
	function openPageBloodSugar(){
		$.ajax({
			url: "http://localhost:8080/HomeApp/maintenance/user.action?action=loadPage",
			success: function (result) {
			}
		});
	}
	
	
});

