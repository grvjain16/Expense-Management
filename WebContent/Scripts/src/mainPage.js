
function getUserId() {
	alert(1)
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      alert(this.responseText);
	      document.getElementById("UID").value ="grvjain";

	    }
	  };
	  xhttp.open("GET", "login.action?action=getUserId&name=gaurav", true);
	  xhttp.send();
	}


function saveRecord(){
	alert("save");
	
	var form = document.getElementById("userAddForm");
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      alert(this.responseText);
	      document.getElementById("userId").value ="grvjain";

	    }
	  };
	  xhttp.open("POST", "save.action?action=saveRecord", true);
	  xhttp.send();
}