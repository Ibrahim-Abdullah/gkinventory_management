<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Log In | Genkey Inventory Management System</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
	<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
</head>
<body>
	  	<div class="container">
  		<div class="login-wrap">
 			<img src="<c:url value="resources/images/genkey3.png"/>" class="img-responsive img-rounded">
  			<h3 class="text-center col-sm-offset-1" style="color: white">Inventory Management System</h3>
  			<div>&nbsp;&nbsp;&nbsp;&nbsp;</div>
  			<div>&nbsp;&nbsp;&nbsp;&nbsp;</div>
  			<div>&nbsp;&nbsp;&nbsp;&nbsp;</div>
  			 <form role="form" class="form-horizontal" action="item-management.html" method="post">
  				<div class = "form-group">
      				<label for="email" class="col-sm-3 control-label">Email</label>
      				
      				<div class = "col-sm-7">
         				<input type= "email" class="form-control" id ="email" placeholder ="example@Genkey.com" required autocomplete="true">
     			 	</div>
     				<div>&nbsp;</div>
     			</div>
   				<div class="form-group">
   					<label for="password" class="col-sm-3 control-label">Password</label>
   					
   					<div class="col-sm-7">
   						<input type="password" name="password" id="password" class="form-control" required>
   					</div>
   				</div>
   				<div>&nbsp;</div>
   				   <input type = "submit" class = "btn btn-primary col-sm-3 col-sm-offset-5" value="Log In">
  			</form>
  		</div>
  	</div>
  	<script src="webjars/jquery/3.2.1/jquery.js"></script>
  	<script src="webjars/bootstrap/3.3.6/js/bootstrap.js"></script>
</body>
</html>