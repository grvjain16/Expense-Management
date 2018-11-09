$(document).ready(function (){
	alert(1)
	$("#bloodSugar").click(function(){
		alert(1)
		openPageBloodSugar();
	});
	
	function openPageBloodSugar(){
		$.ajax({
			url: "http://localhost:8080/HomeApp/maintenance/user.action?action=loadPage",
			success: function (result) {
				alert(2)
			}
		});
	}
	
	
});

