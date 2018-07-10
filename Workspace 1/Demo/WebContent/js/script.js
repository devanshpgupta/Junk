/**
 * 
 */

function validate() {
	
	var flag = true;
	var messages = document.getElementById("messages");
	messages.innerHTML = "";
	
	/*var fname = document.myform.fname.value;
	var lname = document.myform.lname.value;
	var age = document.myform.age.value;
	var email = document.myform.email.value;*/
	var fname = document.getElementById("fname").value;
	var lname = document.getElementById("lname").value;
	var age = document.getElementById("age").value;
	var email = document.getElementById("email").value;
	var regexpEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	
	if(fname == "" || fname.length == 0) {
		messages.innerHTML += "<h4>First name cannot be empty</h4>";
		flag = false;
	}
	
	if(lname == "" || lname.length == 0) {
		messages.innerHTML += "<h4>Last name cannot be empty</h4>";
		flag = false;
	}
	
	if(isNaN(age)) {
		messages.innerHTML += "<h4>Age must have only numbers</h4>";
		flag = false;
	}
	
	if(!regexpEmail.test(email)) {
		messages.innerHTML += "<h4>Invalid email id</h4>";
		flag = false;
	}
	
	
	return flag;
	
}