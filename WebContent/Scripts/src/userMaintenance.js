$(document).ready(function (){
	
	
	$('#bodyContainer').children('div').each(function () { // Hides all pages except grid page when page is loaded.
		if(this.id=="gridPage" ? $(this).show() : $(this).hide());
	});
	
	
	$("#cancel").click(function(){ // Cancel Button of add form
		$('#bodyContainer').children('div').each(function () {
			if(this.id=="gridPage" ? $(this).show() : $(this).hide());
		});
		fetchGridData(); 
	});
	
	$("#addUserBtn").click(function(){// add Button of toolbar
		$('#bodyContainer').children('div').each(function () {
			if(this.id=="addPage" ? $(this).show() : $(this).hide());
		});
		$("#addPageForm").trigger("reset");
	});

	$("#save").click(function(){
		//addUser();
		$('#bodyContainer').children('div').each(function () {
			if(this.id=="gridPage" ? $(this).css("display", "block"): $(this).css("display", "none"));
		});
		fetchGridData(); 
	});
	
	$('#user').jqGrid({
		colModel: [
			{
				label: 'USERID',
				name: 'userId',
				width: 20
			},
			{
				label: 'Name',
				name: 'name',
				width: 40
			},
			{
				label: 'Email',
				name: 'email',
				width: 50,
			},
			{
				label:'Phone#',
				name:'phone',
				width:30
			}
			],

			viewrecords: true, // show the current page, data rang and total records on the toolbar
			height:'auto',
			rowNum: 15,
			datatype: 'local',
			rowList : [20,30,50],
			pager: "#jqGridPager",
			caption: "User Maintenance"

	});
		$('#user').jqGrid('setGridWidth', parseInt($(window).width()) - 20);    
		
		$(window).resize(function () { 
			$('#user').jqGrid('setGridWidth', parseInt($(window).width()) - 20); 
		});

	fetchGridData();

	function addUser(){
		var data = $("#addPageForm").serialize();
		debugger;
		$.ajax({
			type: "POST",
			url: "http://localhost:8080/HomeApp/maintenance/saveUser.action?action=addUser",
			data: data,
			datatype: "text",
			cache: false,
			success: function (result) {
//				alert(result);
				
			//	fetchGridData();
			}
		});
	}
	
	
	function fetchGridData() {
		var gridArrayData = [];
		$.ajax({
			url: "http://localhost:8080/HomeApp/maintenance/userDetails.action?action=loadUserDetails",
			success: function (result) {
				//alert(result.items);
				debugger;
				for (var i = 0; i < result.items.length; i++) {
					var item = result.items[i];
					gridArrayData.push({
						userId: item.userId,
						name: item.name,
						email: item.email,
						phone: item.phone
					});                            
				}
				$("#user").jqGrid('setGridParam', { data: gridArrayData});
				$("#user").trigger('reloadGrid'); 
			}
		});
	}

	function formatTitle(cellValue, options, rowObject) {
		return cellValue.substring(0, 50) + "...";
	};

	function formatLink(cellValue, options, rowObject) {
		return "<a href='" + cellValue + "'>" + cellValue.substring(0, 25) + "..." + "</a>";
	};

});


