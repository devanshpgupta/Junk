/**
 * 
 */
var test = function() {
	// location.href="success.jsp";

	// var elem=document.getElementById("content");
	// elem.innerHTML+="Hello "+ new Date()+ "<br/>";
	var name=document.getElementById("name").value;
	var password=document.getElementById("password").value;
	console.log(name +":"+ password);
	
	var ajax = new XMLHttpRequest();
	ajax.open("GET", "success.jsp?name="+name+"&password="+password, true);
	ajax.onreadystatechange = function() {
		if(ajax.readyState == 4 && ajax.status == 200){
			console.log("You are here");
			document.getElementById("content").innerHTML = ajax.responseText;
		}
		}
	ajax.send();

}
