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
		    return this.firstName + " " + this.lastName
		  }
		};

function myFunction12(a_user) {  
	window.alert(a_user.fullName());
}

function myFunction13() {  
	document.getElementById('demo13').innerHTML = Date()
}

function myFunction14() {  
	document.getElementById('demo14').innerHTML = Math.floor(Math.random() * 100);
}

function myFunction15() {
	var day;
	switch (new Date().getDay()) {
	case 0:
		day = "Sunday";
		break;
	case 1:
		day = "Monday";
		break;
	case 2:
		day = "Tuesday";
		break;
	case 3:
		day = "Wednesday";
		break;
	case 4:
		day = "Thursday";
		break;
	case 5:
		day = "Friday";
		break;
	case 6:
		day = "Saturday";
	}  
	document.getElementById('demo15').innerHTML = day;
}

class Car {
  constructor(brand) {
    this.carname = brand;
  }
  getName() {
	  return this.carname
  }
}

function myFunction16() {  
	car = new Car("BMW");
	document.getElementById('demo16').innerHTML = car.getName();
}
