<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<title>Insert title here</title>
	<meta name="viewport" content="initial-scale=1, maximum-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<link href="<c:url value ="webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
	    <form class="form-signin">       
	      	<h2 class="form-signin-heading">Please login</h2>
	      	<input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
	      	<input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
	      	<label class="checkbox">
	        	<input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
	      	</label>
	      	<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
	    </form>
  	</div>
  <script type="text/javascript" src="<c:url value="webjars/jquery/3.2.1/jquery.min.js"/>"></script>
  <script type="text/javascript" src="<c:url value="webjars/bootstrap/3.3.6/js/bootstrap.min.js"/>"></script>
</body>
</html>