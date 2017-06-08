<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="../../resources/lib/jquery/jquery-3.2.1.js"></script> 

<link rel="stylesheet" href="../../resources/lib/primeui/themes/bootstrap/theme.css" />
<script type="text/javascript" src="../../resources/lib/primeui/primeui-all.js"></script>
</head>
<body>

<h1>Message : ${text}</h1>

<div id="tbllocal"></div>


	<script type="text/javascript">
			   $(function() {
			    var localData = [
			        {'brand': 'Volkswagen', 'year': 2012, 'color': 'White', 'vin': 'dsad231ff'},
			        {'brand': 'Audi', 'year': 2011, 'color': 'Black', 'vin': 'gwregre345'},
			        {'brand': 'Renault', 'year': 2005, 'color': 'Gray', 'vin': 'h354htr'},
			        {'brand': 'BMW', 'year': 2003, 'color': 'Blue', 'vin': 'j6w54qgh'},
			        {'brand': 'Mercedes', 'year': 1995, 'color': 'White', 'vin': 'hrtwy34'},
			        {'brand': 'Volvo', 'year': 2005, 'color': 'Black', 'vin': 'jejtyj'},
			        {'brand': 'Honda', 'year': 2012, 'color': 'Yellow', 'vin': 'g43gr'},
			        {'brand': 'Jaguar', 'year': 2013, 'color': 'White', 'vin': 'greg34'},
			        {'brand': 'Ford', 'year': 2000, 'color': 'Black', 'vin': 'h54hw5'},
			        {'brand': 'Fiat', 'year': 2013, 'color': 'Red', 'vin': '245t2s'}
			    ];
			 
			    $('#tbllocal').puidatatable({
			        caption: 'Client Side Pagination with Local Data',
			        paginator: {
			            rows: 3
			        },
			        columns: [
			            {field: 'vin', headerText: 'Vin' , filter: true},
			            {field: 'brand', headerText: 'Brand', filter: true},
			            {field: 'year', headerText: 'Year'},
			            {field: 'color', headerText: 'Color'}
			        ],
			        datasource: localData
			    });
			});
        </script>
        
        
        

	
</body>
</html>