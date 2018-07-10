/**
 * 
 */

function initAJAX() {
	
	var AJAX = null;
	
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
        AJAX = new XMLHttpRequest();
    }
    else {// code for IE6, IE5
        AJAX = new ActiveXObject("Microsoft.XMLHTTP");
    }
	
	return AJAX;
}


var test = function() {
	
	var elem = document.getElementById("result");
	console.log("1");
	var ajax = initAJAX();
	console.log("2");
	ajax.open("GET", "dateinfo.jsp", true);
	console.log("3");
	ajax.onreadystatechange = process;
	ajax.send();
	
	function process() {
		console.log("Waiting!");
		if(ajax.readyState == 4 && ajax.status == 200) {
			console.log(ajax.responseText);
			elem.innerHTML = ajax.responseText;
		}
	}
}