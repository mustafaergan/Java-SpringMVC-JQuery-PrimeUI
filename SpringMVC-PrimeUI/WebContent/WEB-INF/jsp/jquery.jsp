<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="../../resources/lib/jquery/jquery-3.2.1.js"></script> 
</head>
<body>

<p>Message : ${text}</p>


<button>Tikla ve Yok Et</button>

	<script type="text/javascript">
	
	$(document).ready(function(){
	    $("button").click(function(){
	        $("p").hide();
	    });
	});
			   
    </script>
        
        
        

	
</body>
</html>