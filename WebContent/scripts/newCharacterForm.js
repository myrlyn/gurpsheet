/**
 * if I create the entire form as JS, I already have variable names for every
 * element and do not have to do lookups
 */
let skillLines = 0
let advantageLines = 0
let f = document.createElement("form")
f.id = "charForm"
f.name = "charForm"
let blk = null
let URL = "rest/sheets/blank"
$.getJSON(URL, function(result) {
	blk = result
	console.log(result)
})
// create arrays for skill pieces
let skillNames = []
let skillValues = []
let skillRsls = []
let textN = []
let skillLabels = []
let skillPts = []
let skillPageRef = []

let advantageNames = []
let advantageHasLevels = []
let advantageLevels = []
let advantageDescription = []
let advantagePageRef = []
let advantageNotes = []
let advantageModifiers = []
let advantageTextNodes = []
let advCheckboxTextNodes = []
let advCheckboxLabels = []
let advantageLineBreak = []

let s = document.createElement("input") // input element, Submit button
s.setAttribute('type', "submit")
s.setAttribute('value', "Submit")
s.id = "submitButton"

let asb = document.createElement("input") // input element, Submit button
asb.setAttribute('type', "submit")
asb.setAttribute('value', "Add Skill Row")
asb.id = "addSkillButton"

let addAdvantageButton = document.createElement("input")
addAdvantageButton.setAttribute('type', "submit")
addAdvantageButton.setAttribute('value', "Add Advantage Row")
addAdvantageButton.id = "addAdvantageButton"

let sle = document.createElement("br")
sle.id = "skillLineEnd"

let advantageLineEnd = document.createElement("br")
advantageLineEnd.id = "advantageLineEnd"

f.appendChild(s)
f.insertBefore(sle, s)
f.insertBefore(advantageLineEnd, sle)

f.appendChild(asb)
f.appendChild(addAdvantageButton)
s.addEventListener("click", saveCharacter, false)
asb.addEventListener("click", addSkillLine, false)
addAdvantageButton.addEventListener("click", addAdvantageLine, false)
document.getElementsByTagName('body')[0].appendChild(f)

function saveCharacter(event) {
	console.log("data below")
	document.bgColor = "#780000"
	// xhttp.open("POST", "rest/sheets/save", true)
	// xhttp.setRequestHeader("Content-type", "application/json")
	// xhttp.send()
	// $.post('rest/sheets/save',data,function(response){ }, 'json')
	event.preventDefault()
}
function addAdvantageLine(event) {
	document.bgColor = "#780078"
	event.preventDefault()
	
	advantageTextNodes[advantageLines] = document.createTextNode("Advantage")

	advantageNames[advantageLines] = document.createElement("input")
	advantageNames[advantageLines].type = "text"
	advantageNames[advantageLines].name = `advantageNames[${advantageLines}]`
	advantageNames[advantageLines].id = `advantageNames[${advantageLines}]`
	advantageNames[advantageLines].value = "Advantage Name"

	advantagePageRef[advantageLines] = document.createElement("input")
	advantagePageRef[advantageLines].type = "text"
	advantagePageRef[advantageLines].name = `advantageNames[${advantageLines}]`
	advantagePageRef[advantageLines].id = `advantageNames[${advantageLines}]`
	advantagePageRef[advantageLines].value = "Page Reference"

	advantageHasLevels[advantageLines] = document.createElement("input")
	advantageHasLevels[advantageLines].type = "checkbox"
	advantageHasLevels[advantageLines].name = `advantageHasLevels[${advantageLines}]`
	advantageHasLevels[advantageLines].id = `advantageHasLevels[${advantageLines}]`

	advantageNotes[advantageLines] = document.createElement("input")
	advantageNotes[advantageLines].type = "text"
	advantageNotes[advantageLines].name = `advantageNotes[${advantageLines}]`
	advantageNotes[advantageLines].id = `advantageNotes[${advantageLines}]`
	advantageNotes[advantageLines].value = "notes"

	advantageModifiers[advantageLines] = document.createElement("input")
	advantageModifiers[advantageLines].type = "text"
	advantageModifiers[advantageLines].name = `advantageModifiers[${advantageLines}]`
	advantageModifiers[advantageLines].id = `advantageModifiers[${advantageLines}]`
	advantageModifiers[advantageLines].value = "modifiers"

	advantageLevels[advantageLines] = document.createElement("input")
	advantageLevels[advantageLines].type = "text"
	advantageLevels[advantageLines].name = `advantageLevels[${advantageLines}]`
	advantageLevels[advantageLines].id = `advantageLevels[${advantageLines}]`
	advantageLevels[advantageLines].value = "Levels"
		
	advCheckboxTextNodes[advantageLines] = document
			.createTextNode("Has Levels?")
	advCheckboxLabels[advantageLines] = document.createElement("label")
	advCheckboxLabels[advantageLines].setAttribute('for',
			advantageHasLevels[advantageLines])

	advCheckboxLabels[advantageLines] = document.createElement("label")
	advantageLineBreak[advantageLines] = document.createElement("br")
	f.insertBefore(advantageLineBreak[advantageLines],advantageLineEnd)
	f.insertBefore(advantageTextNodes[advantageLines],advantageLineBreak[advantageLines])
	advantageLines++
	
}

function addSkillLine(event) {
	event.preventDefault()
	textN[skillLines] = document.createTextNode("Skill")

	skillNames[skillLines] = document.createElement("input")// create
	skillNames[skillLines].type = "text"
	skillNames[skillLines].name = `skillNames[${skillLines}]`
	skillNames[skillLines].id = `skillNames[${skillLines}]`
	skillNames[skillLines].value = "Skill Name"

	skillValues[skillLines] = document.createElement("input")
	skillValues[skillLines].type = "text"
	skillValues[skillLines].name = `skillValues[${skillLines}]`
	skillValues[skillLines].id = `skillValues[${skillLines}]`
	skillValues[skillLines].value = "Skill Level"

	skillLabels[skillLines] = document.createElement("Label")
	skillLabels[skillLines].setAttribute('for', `skillNames[${skillLines}]`)
	skillLabels[skillLines].innerHtml = `skillNames[${skillLines}].name`
	skillLabels[skillLines].form = "charForm"
	skillLabels[skillLines].appendChild(textN[skillLines])

	skillRsls[skillLines] = document.createElement("input")
	skillRsls[skillLines].type = "text"
	skillRsls[skillLines].name = `skillRsls[${skillLines}]`
	skillRsls[skillLines].id = `skillRsls[${skillLines}]`
	skillRsls[skillLines].value = "Relative Skill Level (e.g. DX-1)"

	skillPts[skillLines] = document.createElement("input")
	skillPts[skillLines].type = "text"
	skillPts[skillLines].name = `skillpts[${skillLines}]`
	skillPts[skillLines].id = `skillPts[${skillLines}]`
	skillPts[skillLines].value = "Character Points Spent (e.g. 1)"

	skillPageRef[skillLines] = document.createElement("input")
	skillPageRef[skillLines].type = "text"
	skillPageRef[skillLines].name = `skillPageRef[${skillLines}]`
	skillPageRef[skillLines].id = `skillPageRef[${skillLines}]`
	skillPageRef[skillLines].value = "Page Reference"

	f.insertBefore(skillValues[skillLines], skillLineEnd)
	f.insertBefore(skillNames[skillLines], skillValues[skillLines])
	f.insertBefore(skillLabels[skillLines], skillNames[skillLines])
	f.insertBefore(skillRsls[skillLines], skillValues[skillLines])
	f.insertBefore(skillPts[skillLines], skillValues[skillLines])
	f.insertBefore(skillPageRef[skillLines], skillValues[skillLines])
	f.insertBefore(document.createElement("br"),
			skillValues[skillLines].nextSibling)
	skillLines++
}
