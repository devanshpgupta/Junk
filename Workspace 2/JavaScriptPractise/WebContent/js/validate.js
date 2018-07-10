/**
 * 
 */


function validate()
{
	var fname=document.index.fname.value;
	var lname=document.index.lname.value;
	var flag=false;
	var message=document.getElementById("message");
	message.innerHTML="";
	if(fname.length==0 || fname=="")
		{
		message.innerHTML+="<h4>Enter First Name</h4>";
		flag=false;
		}
	if(lname.length==0 || lname=="")
	{
	message.innerHTML+="<h4>Enter Last Name</h4>";
	flag=false;
	}
	else
		flag=true;
	return flag;
	}
