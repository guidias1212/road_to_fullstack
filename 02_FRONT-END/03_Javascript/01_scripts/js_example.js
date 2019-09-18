/* External Javascript */
function myFunction3() {
	document.getElementById("demo3").innerHTML = "Paragraph changed.";
}

function myFunction4() {
	document.write(5 + 6);
}

function myFunction5() {
	window.alert(5 + 6);
}

function myFunction6() {
	console.log(5 + 6);
}

function myFunction7() {
	var x, y, z;       // How to declare variables
	x = 5; y = 6;      // How to assign values
	z = x + y;         // How to compute values
	window.alert(z);
}

function myFunction8() {     
	window.alert(5 + "6");
}

function myFunction9() {     
	window.alert("5" + 6);
}

function myFunction10() {  
	var person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};
	window.alert(person);
}

function myFunction11(a,b) {  
	window.alert(a + b);
}

var user = {
		  firstName: "John",
		  lastName : "Doe",
		  id       : 5566,
		  fullName : function() {
		    return this.firstName + " " + this.lastName;
		  }
		};

function myFunction12(a_user) {  
	window.alert(a_user.fullName());
}

function myFunction13() {  
	document.getElementById('demo13').innerHTML = Date()
}
