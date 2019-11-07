/**
 * 
 */
var f = document.createElement("form");
f.id = "skillForm"
f.name = "skillForm"
var blk = null;
var URL = "rest/sheets/blank"
	$.getJSON(URL,function(result){
		blk = result;
		console.log(result);
	});

//f.setAttribute('method',"post");
//f.setAttribute('action',"rest/sheets/save");
//f.setAttribute('onsubmit',"saveCharacter()")


var skillNames = []
skillNames[0] = document.createElement("input");//create 
skillNames[0].type = "text";
skillNames[0].name = "skillNames[0]";
skillNames[0].id   = "skillNames[0]";

var textN = []
textN[0] = document.createTextNode("LblText")
var skillLabels = []
skillLabels[0] = document.createElement("Label");
skillLabels[0].setAttribute('for',"skillNames[0]")
skillLabels[0].innerHtml="skillNames[0].name"
skillLabels[0].form = "skillForm"
skillLabels[0].appendChild(textN[0])
skillNames[0].value = "ENTER VALUE HERE"	



var s = document.createElement("input"); //input element, Submit button
s.setAttribute('type',"submit");
s.setAttribute('value',"Submit");
s.id = "submitButton"
//f.appendChild(skillLabels[0]);
//f.appendChild(skillNames[0]);
f.appendChild(s);
f.insertBefore(skillNames[0],s)
f.insertBefore(skillLabels[0],skillNames[0])
//f.accept-charset="utf-8" 
//and some more input elements here
//and dont forget to add a submit button
//document.getElementById("submitColor").addEventListener("click", changeBackground, false);
document.getElementsByTagName('body')[0].appendChild(f);
function saveCharacter(){
	//var data = $("skillForm").serializeArray()
	console.log("data below")
	//document.bgColor = "#780000"
	
	//xhttp.open("POST", "rest/sheets/save", true);
	//xhttp.setRequestHeader("Content-type", "application/json");
	//xhttp.send();
	$.post('rest/sheets/save',data,function(response){
		
	}, 'json')
	
}