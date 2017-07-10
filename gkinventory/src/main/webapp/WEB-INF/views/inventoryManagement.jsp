<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Genkey Inventory Management System</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">
	<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
</head>
<body>
		<!--header-->
			<div id="header-top" class="row">
				<div class="header-user" id="header-user">
					<div class="col-md-2 col-md-offset-9">kwesi.mensah@GenKey.com</div>
				</div>
					<div class="col-md-1 header-logout">
						<a href="index.html">Log out</a>
					</div>
			</div>

			<div id="header-tab" class="row header-tab">
				<ul class="nav nav-tabs nav-justified">
  					<li class="active"><a data-toggle="tab" href="#item-management">Item Management</a></li>
  					<li><a data-toggle="tab" href="#employeeManagement">Employee Management</a></li>
  					<li><a data-toggle="tab" href="#user-profile-management">User Profile Management</a></li>
				</ul>
			</div>

		<!--header end-->
		<!--Content--> 
	<div class="tab-content" id="tab-content">

	<!--Item Management Section-->
	<div class="tab-pane fade in active" id="item-management">
	<div id="filter-row" class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-2">
				<form role="form" class="form-inline" id="itemManagementForm">
					<div class="col-md-3 form-group">
						<select class="form-control">
						<option value=""> Filter Items</option>
					      	<option value="laptop">Laptop</option>
					      	<option value="desktop">Desktop</option>
					      	<option value="keyboardMouse">Keyboard and Mouse</option>
					      	<option value="keyboard">Only Keyboard</option>
					      	<option value="mouse">Only Mouse</option>
					      	<option value="mobilePhone">Mobile Phone</option>
						</select>
					</div>
				</form>
			</div>
			<div class="btn-group btn-group-xs tble-buttons col-md-3 col-sm-4">
				<a href="#addnewitem" data-toggle="modal"><button type="button" class="btn btn-sm btn-primary add-new">New Item</button></a>
			</div>
		</div>
	</div>
	<div id="table-row" class="container">
		<div class="row table-row">
			<div class="table-responsive">
  				<table class="table table-hover table-bordered">
 					<thead>
      					<tr>
						    <th>Serial Number</th>
						    <th>Genkey ID</th>
						    <th>Type</th>
						    <th>Status</th>
						    <th>Action</th>
					    </tr>
					</thead>
					    <tbody>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Laptop</td>
					        	<td>Working</td>

					        	<td>
									<div class="btn-group btn-group-xs tble-buttons">
									  	<a href="#viewItem" data-toggle="modal"><button type="button" class="btn black-background btn-sm">View</button></a>
									  	<a><button type="button" class="btn black-background btn-sm">Assign</button></a>
									  	<a href="#editItem" data-toggle="modal"><button type="button" class="btn black-background btn-sm">Edit</button></a>
									  	<a href="#deleteItem" data-toggle="modal"><button type="button" class="btn black-background btn-sm">Delete</button></a>
									</div>
					        	</td>
					      	</tr>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Desktop</td>
					        	<td>Working</td>
					        	<td>Not Working</td>

					      	</tr>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Keyboard and Mouse</td>
					        	<td>Working</td>
					        	<td>Not Working</td>
					      	</tr>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Only Keyboard</td>
					        	<td>Working</td>
					        	<td>Not Working</td>
					      	</tr>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Only mouse</td>
					        	<td>Working</td>
					        	<td>Not Working</td>
					      	</tr>
					      	<tr>
					        	<td>xxxxxx</td>
					        	<td>xxxxxx</td>
					        	<td>Mobile Phone</td>
					        	<td>Working</td>
					        	<td>Not Working</td>
					      	</tr>
					    </tbody>
  				</table>
			</div>
		</div>
	</div>
	</div>

	<!--EPLOYEE MANAGEMENT TAB SECTION-->
	<div class="tab-pane fade" id="employeeManagement">
		<!--heade end-->
	<div id="filter-row" class="container filter-row">
		<div class="row">
			<div class="col-md-6 col-sm-3">
				<form role="form" class="form-inline form-element">
					<div class="col-md-3 form-group">
						<select class="form-control">
							<option value="">Filter Employees</option>
							<option value="administration">Administration</option>
							<option value="developers">Developers</option>
							<option value="operationsSupport">Operations and Support</option>
							<option value="qa">Quality Assurance</option>
							<option value="logisticsTranport"> Logistics and Transport</option>
						</select>
					</div>
				</form>
			</div>
			<div class="btn-group btn-group-xs tble-buttons col-md-4 col-sm-2 col-md-offset-2">
				<a href="#addnewemployee" data-toggle="modal"><button type="button" class="btn btn-sm btn-primary add-new">New Employee</button></a>
			</div>
		</div>
	</div>
	<div id="table-row" class="container">
		<div class="row table-row">
			<div class="table-responsive">
  				<table class="table table-hover table-bordered">
 					<thead>
      					<tr>
						    <th>First name</th>
						    <th>Last name</th>
						    <th>Department</th>
						    <th>Permission</th>
						    <th>Action</th>
					    </tr>
					</thead>
					    <tbody>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>User</td>
					        	<td>
									<div class="btn-group btn-group-xs tble-buttons">
									  <a href="#viewemployee" data-toggle="modal"><button type="button" class="btn btn-sm btn-black black-background">View</button></a>
									  <a href="#makeadmin" data-toggle="modal"><button type="button" class="btn btn-sm btn-black black-background">Make User</button></a>
									  <a href="#editemployee" data-toggle="modal" ><button type="button" class="btn btn-sm btn-black black-background">Edit</button></a>
									  <a href="#deleteemployee" data-toggle="modal"><button type="button" class="btn btn-sm black-background">Delete</button></a>
									</div>
					        	</td>
					      	</tr>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>Not User</td>
					        	<td></td>

					      	</tr>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>User</td>
					        	<td></td>
					      	</tr>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>User</td>
					        	<td></td>
					      	</tr>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>User</td>
					        	<td></td>
					      	</tr>
					      	<tr>
					        	<td>Kwesi</td>
					        	<td>Mensah</td>
					        	<td>Developers</td>
					        	<td>Not User</td>
					        	<td></td>
					      	</tr>					   
					    </tbody>
  				</table>
			</div>
		</div>
	</div>
	</div>

	<!--USER PROFILE MANAGEMENT SECTION-->
	<div class="tab-pane fade" id="user-profile-management">
	<div id="filter-row" class="container filter-row">
		<div class="row">
			<div class="btn-group btn-group-xs tble-buttons col-md-4 col-sm-2 col-md-offset-8">
				<a href="#editemployee" data-toggle="modal"><button type="button" class="btn btn-sm btn-primary add-new">Edit Profile</button></a>
			</div>
		</div>
	</div>
	<div id="table-row" class="container">
		<div class="row table-row">
			<div class="table-responsive">
    				<table class="table table-hover table-bordered">
    					<tbody>
    						<tr>
    							<td>Employee name:</td>
    							<td>Kwesi Mensah</td>
    						</tr>
    						<tr>
    							<td>Email Address</td>
    							<td>kwesi.mensah@GenKey.com</td>
    						</tr>
    						<tr>
    							<td>Employee ID</td>
    							<td>xxxxxxxxxxx</td>
    						</tr>

    						<tr>
    							<td>Department:</td>
    							<td>Developers</td>
    						</tr>
    						<tr>
    							<td>Permission:</td>
    							<td>User</td>
    						</tr>    						
    					</tbody>
    				</table>
			</div>
		</div>
	</div>
	</div>
	</div>
	<!--Content end-->

	<!--footer-->
	<div class="footer-bottom">
		<div class="col-md-2 col-md-offset-5 footer-class">
			<p>GenKey Africa, Ghana @ 2017</p>
		</div>
	</div>
	<!--End of footer-->

	<!--ADD NEW ITEM MODAL-->
	<div id="addnewitem" class="modal fade" aria-labelledby="addnewitem" aria-hidden="true" action="#item-management" method="post">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
        			<h4 class="text-center">ADD NEW DEVICE</h4>
        			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          				<span>&times;</span>
       				</button>
      			</div>
      			<div class="modal-body">
					<form role="form" class="form-horizontal" id="addnewitem" action="" method="get">
						<div class="form-group">
		    				<label class="control-label col-sm-3 col-md-offset-1" for="serial_number">Serial Number</label>
		    				<div class="col-sm-6">
		      					<input type="text" class="form-control" id="serial_number">
		    				</div>
		  				</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="genkeyid">GenKey ID</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="genkeyid" required>
					    	</div>
					  	</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1">Type</label>
					    	<div class="col-sm-6"> 
					      		<select onchange="isLaptop(this);" class="form-control" required>
					      			<option value="">Select</option>
					      			<option value="laptop">Laptop</option>
					      			<option value="desktop">Desktop</option>
					      			<option value="keyboardMouse">Keyboard and Mouse</option>
					      			<option value="keyboard">Only Keyboard</option>
					      			<option value="mouse">Only Mouse</option>
					      			<option value="mobilePhone">Mobile Phone</option>
					      		</select>
					    	</div>
					  	</div>
					  	<div class="form-group" id="cpu" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="cpu">CPU</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="cpu" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="ram" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="ram">RAM(MB)</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="ram" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="hdd" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="hdd">HDD(GB)</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="hdd" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="os" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="os">OS</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="os" required>
					    	</div>
					  	</div>
					  	<script>
    						function isLaptop(optionSelected) 
    						{
        						if (optionSelected.value == "laptop") 
        						{
            						document.getElementById("cpu").style.display = "block";
            						document.getElementById("ram").style.display = "block";
            						document.getElementById("hdd").style.display = "block";
            						document.getElementById("os").style.display = "block";
	        					} 
	        					else {
            						document.getElementById("cpu").style.display = "none";
            						document.getElementById("ram").style.display = "none";
            						document.getElementById("hdd").style.display = "none";
            						document.getElementById("os").style.display = "none";	        					}
    						}
						</script>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1">Status</label>
					    	<div class="col-sm-6"> 
					      		<select onchange="isDefective(this);" class="form-control" required>
					      			<option value="">Select</option>
					      			<option value="working">Working</option>
					      			<option value="defective">Defective</option>
					      		</select>
					    	</div>
					  	</div>
					  	<div class="form-group" id="defectiveDescription" style="display: none;">
					  		<label class="control-label col-sm-4" for="defectiveDescription">Defect Description</label>
					  		<div class="col-sm-6" >
					  			<textarea rows="5" class="form-control" id="defectiveDescription">
					  				
					  			</textarea>
					  		</div>
					  	</div>	
					  	<script>
    						function isDefective(optionSelected) 
    						{
        						if (optionSelected.value == "defective") 
        						{
            						document.getElementById("defectiveDescription").style.display = "block";
	        					} 
	        					else {
            						document.getElementById("defectiveDescription").style.display = "none";
            					}
    						}
						</script>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="manufacturer">Manufacturer</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="manufacturer" required>
					    	</div>
					  	</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="model">Model</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="model" required>
					    	</div>
					  	</div>
					</form>
				</div>
				<div class="modal-footer form-group">
        			<input type="submit" class="btn btn-primary" form="addnewitem" value="Add">
        			<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
      			</div>
      		</div>
    	</div>
  	</div>
	<!--END OF ADD NEW ITEM MODAL-->

	<!--ASSIGN ITEM TO EMPLOYEE MODAL-->
	<!--UNASSIGN ITEM TO EMPLOYEE MODAL-->
	<div id="unassignitem" class="modal fade" aria-labelledby="unassignitem" aria-hidden="true">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
      				<h4 class="text-center">UNASSIGN ITEM TO EMPLOYEE</h4>
      			</div>
      			<div class="modal-body">
      				<p>Confirm unassignin item with GenKey Label XXXXXXX Kwesi Mensah</p>
      			</div>
      			<div class="modal-footer">
      				<button type="button" class="btn btn-primary">Confirm</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
      			</div>
      		</div>
      	</div>
    </div>
	<!--END OF UNASSIGN ITEM TO EMPLOYEE MODAL-->

	<!--EDIT ITEM MODAL -->
	<div id="editItem" class="modal fade" aria-labelledby="editItem" aria-hidden="true">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
        			<h4 class="text-center">EDITING ITEM</h4>
        			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          				<span aria-hidden="true">&times;</span>
       				</button>
      			</div>
      			<div class="modal-body">
					<form role="form" class="form-horizontal">
						<div class="form-group">
		    				<label class="control-label col-sm-3 col-md-offset-1" for="serial_number">Serial Number</label>
		    				<div class="col-sm-6">
		      					<input type="text" class="form-control" id="serial_number" readonly value="xxxxxxxxxx">
		    				</div>
		  				</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="gk_label">GK Label</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="gk_label">
					    	</div>
					  	</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1">Type</label>
					    	<div class="col-sm-6"> 
					      		<select onchange="laptopSelected(this);" class="form-control" required>
					      			<option value="">Select</option>
					      			<option value="laptop">Laptop</option>
					      			<option value="desktop">Desktop</option>
					      			<option value="keyboardMouse">Keyboard and Mouse</option>
					      			<option value="keyboard">Only Keyboard</option>
					      			<option value="mouse">Only Mouse</option>
					      			<option value="mobilePhone">Mobile Phone</option>
					      		</select>
					    	</div>
					  	</div>
					  	<div class="form-group" id="cpue" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="cpue">CPU</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="cpue" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="rame" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="rame">RAM(MB)</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="rame" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="hdde" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="hdde">HDD(GB)</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="hdde" required>
					    	</div>
					  	</div>
					  	<div class="form-group" id="ose" style="display: none">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="ose">OS</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="ose" required>
					    	</div>
					  	</div>
					  	<script>
    						function laptopSelected(optionSelected) 
    						{
        						if (optionSelected.value == "laptop") 
        						{
            						document.getElementById("cpue").style.display = "block";
            						document.getElementById("rame").style.display = "block";
            						document.getElementById("hdde").style.display = "block";
            						document.getElementById("ose").style.display = "block";
	        					} 
	        					else {
            						document.getElementById("cpue").style.display = "none";
            						document.getElementById("rame").style.display = "none";
            						document.getElementById("hdde").style.display = "none";
            						document.getElementById("ose").style.display = "none"; 	       					
            					}
    						}
						</script>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1">Status</label>
					    	<div class="col-sm-6"> 
					      		<select class="form-control" onchange="defectiveSelected(this);">
					      			<option value="">Select</option>
					      			<option value="working">Working</option>
					      			<option value="defective">Defective</option>
					      		</select>
					    	</div>
					  	</div>
					  	<div class="form-group" id="defectiveDes" style="display: none;">
					  		<label class="control-label col-sm-4" for="defectiveDes">Defect Description</label>
					  		<div class="col-sm-6" >
					  			<textarea rows="5" class="form-control" id="defectiveDescription">
					  				
					  			</textarea>
					  		</div>
					  	</div>
					  	<script>
    						function defectiveSelected(optionSelected) 
    						{
        						if (optionSelected.value == "defective") 
        						{
            						document.getElementById("defectiveDes").style.display = "block";
	        					} 
	        					else {
            						document.getElementById("defectiveDes").style.display = "none";
            					}
    						}
						</script>	
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="brand">Brand</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="brand" readonly autocomplete="true" value="Dell">
					    	</div>
					  	</div>
					  	<div class="form-group">
					    	<label class="control-label col-sm-3 col-md-offset-1" for="model">Model</label>
					    	<div class="col-sm-6"> 
					      		<input type="text" class="form-control" id="model" readonly autocomplete="true" value="LATTITUDE E7450">
					    	</div>
					  	</div>	
					</form>
				</div>
				<div class="modal-footer">
        			<button type="button" class="btn btn-primary">Save changes</button>
        			<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
      			</div>
      		</div>
    	</div>
  	</div>

  	<!--DELETE ITEM MODAL-->
	<div id="deleteItem" class="modal fade" aria-labelledby="deleteItem" aria-hidden="true">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
      				<h4 class="text-center">DELETE ITEM</h4>
      			</div>
      			<div class="modal-body">
      				<p>Confirm deleting Item with GenKey Label XXXXXXX</p>
      			</div>
      			<div class="modal-footer">
      				<button type="button" class="btn btn-primary">Confirm</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
      			</div>
      		</div>
      	</div>
    </div>

    <!--END OF DELETE ITEM MODAL-->

    <!--VIEW ITEM MODAL-->
    <div id="viewItem" class="modal fade" aria-labelledby="viewItem" aria-hidden="true">
    	<div class="modal-dialog" role="document">
    		<div class="modal-content">
    			<div class="modal-header">
    				<h4 class="text-center">ITEM DETAIL</h4>
    			</div>
    			<div class="modal-body">
					<table class="table table-hover table-bordered">
    					<tbody>
    						<tr>
    							<td>Serial Number:</td>
    							<td>xxxxxxxxxxxxx</td>
    						</tr>
    						<tr>
    							<td>GK Label</td>
    							<td>xxxxxxxxxxxxx</td>
    						</tr>
    						<tr>
    							<td>Employee ID:</td>
    							<td>xxxxxxxxxxx</td>
    						</tr>

    						<tr>
    							<td>Type:</td>
    							<td>Laptop</td>
    						</tr>
    						<tr>
    							<td>Status:</td>
    							<td>Working</td>
    						</tr>
    						<tr>
    							<td>Model:</td>
    							<td>xxxxxxx</td>
    						</tr>
    						<tr>
    							<td>Brand:</td>
    							<td>Dell</td>
    						</tr>
    						<tr>
    							<td>Comment:</td>
    							<td>xxxxxxxxxx</td>
    						</tr>
   							<tr>
    							<td>User</td>
    							<td>Not assigned</td>
    						</tr>					
    					</tbody>
    				</table>
    			</div>
	    		<div  class="modal-footer">
	    			<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
	    		</div>
    		</div>
    	</div>
    	
    </div>
    <!--END OF VIEW ITEM MODAL-->

    <!--ADD NEW EMPLOYEE MODAL-->
    <div id="addnewemployee" class="modal fade" aria-labelledby="addnewemployee" aria-hidden="true">
    	<div class="modal-dialog" role="document">
    		<div class="modal-content">
    			<div class="modal-header"> 
    				<h4 class="text-center">ADD NEW EMPLOYEE FORM</h4>
    			</div>
    			<div class="modal-body">
							<form role="form" class="form-horizontal" id="addnewemployee">
								<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1" for="firstname">First name</label>
							    	<div class="col-sm-6">
							      		<input type="text" class="form-control" id="firstname">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1" for="lastname">Last name</label>
							    	<div class="col-sm-6"> 
							      		<input type="text" class="form-control" id="lastname">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1" for="email">Email</label>
							    	<div class="col-sm-6"> 
							      		<input type="Email" class="form-control" id="email">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1">Department</label>
							    	<div class="col-sm-6"> 
							      		<select class="form-control">
							      			<option value="">Select</option>
							      			<option value="administration">Administration</option>
							      			<option value="developers">Developers</option>
							      			<option value="operationsSupport">Operations and Support</option>
							      			<option value="qa">Quality Assurance</option>
							      			<option value="logisticsTranport"> Logistics and Transport</option>
							      		</select>
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1" for="employee_id">Employee ID</label>
							    	<div class="col-sm-6"> 
							      		<input type="text" class="form-control" id="employee_id">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-2 col-md-offset-1 col-sm-offset-1">Permission</label>
							    	<div class="col-sm-6"> 
							      		<select class="form-control">
							      			<option value="">Select</option>
							      			<option value="user">User</option>
							      			<option value="not-user">Not User</option>
							      		</select>
							    	</div>
							  	</div>	
							</form>
					</div>
    			<div class="modal-footer">
       				<button type="button" class="btn btn-primary">Add</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
    			</div>
    		</div>
    	</div>
    </div>

    <!--END OF ADD NEW EMPLOYEE MODAL-->

    <!--EDIT EMPLOYEE MODAL-->
    <div id="editemployee" class="modal fade" aria-labelledby="editemployee" aria-hidden="true">
    	<div class="modal-dialog" role="document">
    		<div class="modal-content">
    			<div class="modal-header"> 
    				<h4 class="text-center">EDIT EMPLOYEE FORM</h4>
    			</div>
    			<div class="modal-body">
							<form role="form" class="form-horizontal" id="editemployee">
								<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1" for="firstname">First name</label>
							    	<div class="col-sm-6">
							      		<input type="text" class="form-control" id="firstname">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1" for="lastname">Last name</label>
							    	<div class="col-sm-6"> 
							      		<input type="text" class="form-control" id="lastname">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1" for="email">Email</label>
							    	<div class="col-sm-6"> 
							      		<input type="Email" class="form-control" id="email">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1">Department</label>
							    	<div class="col-sm-6"> 
							      		<select class="form-control">
							      			<option value="">Select</option>
							      			<option value="administration">Administration</option>
							      			<option value="developers">Developers</option>
							      			<option value="operationsSupport">Operations and Support</option>
							      			<option value="qa">Quality Assurance</option>
							      			<option value="logisticsTranport"> Logistics and Transport</option>
							      		</select>
							  		</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1" for="employee_id">Employee ID</label>
							    	<div class="col-sm-6"> 
							      		<input type="text" class="form-control" id="employee_id">
							    	</div>
							  	</div>
							  	<div class="form-group">
							    	<label class="control-label col-sm-3 col-md-offset-1 col-sm-offset-1">Permission</label>
							    	<div class="col-sm-6"> 
							      		<select class="form-control">
							      			<option value="">Select</option>
							      			<option value="user">User</option>
							      			<option value="notUser">Not User</option>
							      		</select>
							    	</div>
							  	</div>	
							</form>
					</div>
    			<div class="modal-footer">
       				<button type="button" class="btn btn-primary">Save Changes</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
    			</div>
    		</div>
    	</div>
    </div>
    <!--END OF EDIT EMPLOYEE MODAL-->

  	<!--DELETE EMPLOYEE MODAL-->
	<div id="deleteemployee" class="modal fade" aria-labelledby="deleteemployee" aria-hidden="true">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
      				<h4 class="text-center">DELETING EMPLOYEE</h4>
      			</div>
      			<div class="modal-body">
      				<p>Confirm deleting of Employee identified as Kwesi Mensah</p>
      			</div>
      			<div class="modal-footer">
      				<button type="button" class="btn btn-primary">Confirm</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
      			</div>
      		</div>
      	</div>
    </div>

    <!--END OF DELETE EMPLOYEE MODAL-->

    <!--VIEW EMPLOYEE MODAL-->
    <div id="viewemployee" class="modal fade" aria-labelledby="viewemployee" aria-hidden="true">
    	<div class="modal-dialog" role="document">
    		<div class="modal-content">
    			<div class="modal-header">
    				<h4 class="text-center">EMPLOYEE PROFILE</h4>
    			</div>
    			<div class="modal-body">
    				<table class="table table-hover table-bordered">
    					<tbody>
    						<tr>
    							<td>Employee name:</td>
    							<td>Kwesi Mensah</td>
    						</tr>
    						<tr>
    							<td>Email Address</td>
    							<td>kwesi.mensah@GenKey.com</td>
    						</tr>
    						<tr>
    							<td>Employee ID:</td>
    							<td>xxxxxxxxxxx</td>
    						</tr>

    						<tr>
    							<td>Department:</td>
    							<td>Developers</td>
    						</tr>
    						<tr>
    							<td>Permission:</td>
    							<td>Admin</td>
    						</tr>    						
    					</tbody>
    				</table>
    				<hr>
    				<h5>Assigned Items</h5>
    				<table class="table table-hover">
    					<tbody>
    						<thead>
    							<tr>
    								<td>Type</td>
    								<td>GK Label</td>
    								<td>Action</td>
    							</tr>
    						</thead>
    						<tr>
    							<td>Laptop</td>
    							<td>xxxxxxx</td>
    							<td><a href="#"><button class="btn btn-danger btn-sm">Unassign</button></a></td>
    						</tr>
    						<tr>
    							<td>Laptop</td>
    							<td>xxxxxxx</td>
    							<td><a href="#"><button class="btn btn-danger btn-sm">Unassign</button></a></td>
    						</tr>
     						<tr>
    							<td>Laptop</td>
    							<td>xxxxxxx</td>
    							<td><a href="#"><button class="btn btn-danger btn-sm">Unassign</button></a></td>
    						</tr>
    					</tbody>
    				</table>
    			</div>
	    		<div  class="modal-footer">
	    			<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
	    		</div>
    		</div>
    	</div>
    </div>
    <!--END OF VIEW EMPLOYEE MODAL-->

    <!--MAKE EMPLOYEE ADMIN MODALL-->
	<div id="makeadmin" class="modal fade" aria-labelledby="makeadmin" aria-hidden="true">
  		<div class="modal-dialog" role="document">
    		<div class="modal-content">
      			<div class="modal-header">
      				<h4 class="text-center">MAKE USER</h4>
      			</div>
      			<div class="modal-body">
      				<p>Confirm making Employee identified as Kwesi Mensah and User</p>
      			</div>
      			<div class="modal-footer">
      				<button type="button" class="btn btn-primary">Confirm</button>
      				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
      			</div>
      		</div>
      	</div>
    </div>

    <!--END OF MAKE EMPLOYEE ADMIN MODAL-->
  	<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
  	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>