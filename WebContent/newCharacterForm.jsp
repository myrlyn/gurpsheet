<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Character Form</title>
</head>
<body>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
var f = document.createElement("form");
var blk = null;
var URL = "rest/sheets/blank"
	$.getJSON(URL,function(result){
		blk = result;
		console.log(result);
	});

f.setAttribute('method',"put");
f.setAttribute('action',"rest/sheets/save");

//var i = document.createElement("input"); //input element, text
//i.setAttribute('type',"text");
//i.setAttribute('name',"username");
var skillNames = []
skillNames[0] = document.createElement("input");//create 
skillNames[0].setAttribute('type',"text");
skillNames[0].setAttribute('name',"skillname[]");
var skillLabels = []
skillLabels[0] = document.createElement("label")





var s = document.createElement("input"); //input element, Submit button
s.setAttribute('type',"submit");
s.setAttribute('value',"Submit");

f.appendChild(skillLabels[0]);
f.appendChild(skillNames[0]);
f.appendChild(s);

//and some more input elements here
//and dont forget to add a submit button

document.getElementsByTagName('body')[0].appendChild(f);

</script>
</body>
</html>