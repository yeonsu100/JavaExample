<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>

<script>  
	var flag=true;  
	function commentform(){  
	var cform="<form action='Comment'>Enter Name:<br><input type='text' name='name'/><br/>  
		Enter Email:<br><input type='email' name='email'/><br>Enter Comment:<br/>  
		<textarea rows='5' cols='70'></textarea><br><input type='submit' value='Post Comment'/></form>";  

	if(flag){  
			document.getElementById("mylocation").innerHTML=cform;  
			flag=false;  
		}else{  
			document.getElementById("mylocation").innerHTML="";  
			flag=true;  
		}  
	}  
</script>  

</head>
<body>
	<button onclick="commentfor()">Comment</button>
	<div id="mylocation"></div>
</body>
</html>