# 2.9.1) React

React (also known as React.js or ReactJS) is a JavaScript library for building user interfaces. It is maintained by Facebook and a community of individual developers and companies.

React can be used as a base in the development of single-page or mobile applications, as it is optimal for fetching rapidly changing data that needs to be recorded. However, fetching data is only the beginning of what happens on a web page, which is why complex React applications usually require the use of additional libraries for state management, routing, and interaction with an API: Redux, React Router and axios are examples of such libraries.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Get Started](#h2)

[ES6](#h3)

[Render HTML](#h4)

[JSX](#h5)

[Components](#h6)

[Props](#h7)

[State](#h8)

[Lifecycle](#h9)

[Events](#h10)

[Forms](#h11)

[CSS](#h12)

[USEFULL LINKS](#h13)

</details>

<a name="h1"/>

**Introduction:**

React is a JavaScript library for building user interfaces.

React is used to build single page applications.

React allows us to create reusable UI components.

In order to learn and test React, you should set up a React Environment on your computer.

If you have NPM and Node.js installed, you can create a React application by first installing the create-react-app.

Install create-react-app by running this command in your terminal:
```
C:\Users\Your Name>npm install -g create-react-app
```

Run this command to create a React application named myfirstreact:
```
C:\Users\Your Name>npx create-react-app myfirstreact
```

The create-react-app will set up everything you need to run a React application.

Run this command to move to the myfirstreact directory:
```
C:\Users\Your Name>cd myfirstreact
```

Run this command to execute the React application myfirstreact:
```
C:\Users\Your Name\myfirstreact>npm start
```

A new browser window will pop up with your newly created React App! If not, open your browser and type localhost:3000 in the address bar.

**What is React?**

React is a JavaScript library created by Facebook.

React is a tool for building UI components.

**How does React Work?**

React creates a VIRTUAL DOM in memory.

Instead of manipulating the browser's DOM directly, React creates a virtual DOM in memory, where it does all the necessary manipulating, before making the changes in the browser DOM.

React only changes what needs to be changed!

React finds out what changes have been made, and changes only what needs to be changed.

<a name="h2"/>

**Get Started:**

Look in the myfirstreact directory, and you will find a src folder. Inside the src folder there is a file called App.js, open it and it will look like this:

myfirstreact/src/App.js:
```
import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save it to see live changes on browser.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
```

Try changing the HTML content and save the file.

Notice that the changes is visible immediately after you save the file, you do not have to reload the browser!

Replace all the content inside the <div className="App"> with a h1 element.

See the changes in the browser when you click Save.
```
import React from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
        <h1>Hello World!</h1>
    </div>
  );
}

export default App;
```

Check the results on the browser.

To set a raw React app, delete everything from the src folder and add the files:

index.js:
```
import React from 'react';
import ReactDOM from 'react-dom';

const myfirstelement = <h1>Hello React!</h1>

ReactDOM.render(myfirstelement, document.getElementById('root'));
```

public/index.html:
```
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>React App</title>
  </head>
  <body>

    <div id="root"></div>

  </body>
</html>
```

<a name="h3"/>

**ES6:**

ES6 stands for ECMAScript 6.

ECMAScript was created to standardize JavaScript, and ES6 is the 6th version of ECMAScript, it was published in 2015, and is also known as ECMAScript 2015.

React uses ES6, and you should be familiar with some of the new features like:

* Classes;
* Arrow Functions;
* Variables (let, const, var).

**Arrow Functions:**

Before:
```
hello = function() {
  return "Hello World!";
}
```

With Arrow Function::
```
hello = () => {
  return "Hello World!";
}
```

Arrow Functions Return Value by Default:
```
hello = () => "Hello World!";
```

Arrow Function With Parameters:
```
hello = (val) => "Hello " + val;
```

Arrow Function Without Parentheses:
```
hello = val => "Hello " + val;
```

<a name="h4"/>

**Render HTML:**

React's goal is in many ways to render HTML in a web page.

React renders HTML to the web page by using a function called ReactDOM.render().

The ReactDOM.render() function takes two arguments, HTML code and an HTML element.

The purpose of the function is to display the specified HTML code inside the specified HTML element.

**Example:**

Display a paragraph inside the "root" element:
```
ReactDOM.render(<p>Hello</p>, document.getElementById('root'));
```

The result is displayed in the <div id="root"> element:
```
<body>

  <div id="root"></div>

</body>
```

<a name="h5"/>

**JSX:**

JSX stands for JavaScript XML.

JSX allows us to write HTML in React.

JSX makes it easier to write and add HTML in React.

JSX allows us to write HTML elements in JavaScript and place them in the DOM without any createElement()  and/or appendChild() methods.

JSX converts HTML tags into react elements.

**Example 1: With JSX**
```
const myelement = <h1>I Love JSX!</h1>;

ReactDOM.render(myelement, document.getElementById('root'));
```

**Example 2: Without JSX**
```
const myelement = React.createElement('h1', {}, 'I do not use JSX!');

ReactDOM.render(myelement, document.getElementById('root'));
```

**Expressions in JSX:**

With JSX you can write expressions inside curly braces { }.
```
const myelement = <h1>React is {5 + 5} times better with JSX</h1>;
```

**Inserting a Large Block of HTML:**

To write HTML on multiple lines, put the HTML inside parentheses:
```
const myelement = (
  <ul>
    <li>Apples</li>
    <li>Bananas</li>
    <li>Cherries</li>
  </ul>
);
```

**One Top Level Element:**

The HTML code must be wrapped in ONE top level element.

So if you like to write two headers, you must put them inside a parent element, like a div element:
```
const myelement = (
  <div>
    <h1>I am a Header.</h1>
    <h1>I am a Header too.</h1>
  </div>
);
```

<a name="h6"/>

**Components:**

Components are like functions that return HTML elements.

Components are independent and reusable bits of code. They serve the same purpose as JavaScript functions, but work in isolation and returns HTML via a render function.

When creating a React component, the component's name must start with an upper case letter.

The component has to include the extends React.Component statement, this statement creates an inheritance to React.Component, and gives your component access to React.Component's functions.

The component also requires a render() method, this method returns HTML:
```
class Car extends React.Component {
  render() {
    return <h2>Hi, I am a Car!</h2>;
  }
}
```

Now your React application has a component called Car, which returns a h2 element.

To use this component in your application, use similar syntax as normal HTML: <Car />
```
ReactDOM.render(<Car />, document.getElementById('root'));
```

If there is a constructor() function in your component, this function will be called when the component gets initiated.

The constructor function is where you initiate the component's properties.

In React, component properties should be kept in an object called state.

The constructor function is also where you honor the inheritance of the parent component by including the super() statement, which executes the parent component's constructor function, and your component has access to all the functions of the parent component (React.Component):
```
class Car extends React.Component {
  constructor() {
    super();
    this.state = {color: "red"};
  }
  render() {
    return <h2>I am a {this.state.color} Car!</h2>;
  }
}
```

**Components in Files:**

React is all about re-using code, and it can be smart to insert some of your components in separate files.

To do that, create a new file with a .js file extension and put the code inside it:

Note that the file must start by importing React (as before), and it has to end with the statement export default Car:
This is the new file, we named it "App.js":
```
import React from 'react';
import ReactDOM from 'react-dom';

class Car extends React.Component {
  render() {
    return <h2>Hi, I am a Car!</h2>;
   
}
}

export default Car;
```

To be able to use the Car component, you have to import the file in your application:
```
import React from 'react';
import ReactDOM from 'react-dom';
import Car from './App.js';

ReactDOM.render(<Car />, document.getElementById('root'));
```

<a name="h7"/>

**Props:**

Props are arguments passed into React components.

Props are passed to components via HTML attributes.

React Props are like function arguments in JavaScript and attributes in HTML.

To send props into a component, use the same syntax as HTML attributes:
```
const myelement = <Car brand="Ford" />;
```

The component receives the argument as a props object:
```
class Car extends React.Component {
  render() {
    return <h2>I am a {this.props.brand}!</h1>;
  }
}
```

If your component has a constructor function, the props should always be passed to the constructor and also to the React.Component via the super() method:
```
class Car extends React.Component {
  constructor(props) {
    super(props);
  }
  render() {
    return <h2>I am a Car!</h2>;
  }
}
```

<a name="h8"/>

**State:**

React components has a built-in state object.

The state object is where you store property values that belongs to the component.

When the state object changes, the component re-renders:
```
class Car extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      brand: "Ford",
      model: "Mustang",
      color: "red",
      year: 1964
    };
  }
  render() {
    return (
      <div>
        <h1>My Car</h1>
      </div>
    );
  }
}
```

Refer to the state object anywhere in the component by using the this.state.propertyname syntax:
```
class Car extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      brand: "Ford",
      model: "Mustang",
      color: "red",
      year: 1964
    };
  }
  render() {
    return (
      <div>
        <h1>My {this.state.brand}</h1>
        <p>
          It is a {this.state.color}
          {this.state.model}
          from {this.state.year}.
        </p>
      </div>
    );
  }
}
```

To change a value in the state object, use the this.setState() method.

When a value in the state object changes, the component will re-render, meaning that the output will change according to the new value(s):
```
class Car extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      brand: "Ford",
      model: "Mustang",
      color: "red",
      year: 1964
    };
  }
  changeColor = () => {
    this.setState({color: "blue"});
  }
  render() {
    return (
      <div>
        <h1>My {this.state.brand}</h1>
        <p>
          It is a {this.state.color}
          {this.state.model}
          from {this.state.year}.
        </p>
        <button
          type="button"
          onClick={this.changeColor}
        >Change color</button>
      </div>
    );
  }
}
```

Always use the setState() method to change the state object, it will ensure that the component knows its been updated and calls the render() method (and all the other lifecycle methods).

<a name="h9"/>

**Lifecycle:**

Each component in React has a lifecycle which you can monitor and manipulate during its three main phases.

The three phases are: Mounting, Updating, and Unmounting.

**Mounting:**

Mounting means putting elements into the DOM.

React has four built-in methods that gets called, in this order, when mounting a component:

* constructor()
* getDerivedStateFromProps()
* render()
* componentDidMount()

The render() method is required and will always be called, the others are optional and will be called if you define them.

**Updating:**

The next phase in the lifecycle is when a component is updated.

A component is updated whenever there is a change in the component's state or props.

React has five built-in methods that gets called, in this order, when a component is updated:

* getDerivedStateFromProps()
* shouldComponentUpdate()
* render()
* getSnapshotBeforeUpdate()
* componentDidUpdate()

The render() method is required and will always be called, the others are optional and will be called if you define them.

**Unmounting:**

The next phase in the lifecycle is when a component is removed from the DOM, or unmounting as React likes to call it.

React has only one built-in method that gets called when a component is unmounted:

* componentWillUnmount()
* componentWillUnmount

The componentWillUnmount method is called when the component is removed from the DOM.

<a name="h10"/>

**Events:**

Just like HTML, React can perform actions based on user events.

React has the same events as HTML: click, change, mouseover etc.

React event handlers are written inside curly braces:

onClick={shoot}  instead of onClick="shoot()":
```
class Football extends React.Component {
  shoot(a) {
    alert(a);
  }
  render() {
    return (
      <button onClick={this.shoot.bind(this, "Goal")}>Take the shot!</button>
    );
  }
}
```

<a name="h11"/>

**Forms:**

Just like in HTML, React uses forms to allow users to interact with the web page:
```
class MyForm extends React.Component {
  render() {
    return (
      <form>
        <h1>Hello</h1>
        <p>Enter your name:</p>
        <input
          type="text"
        />
      </form>
    );
  }
}
```

**Handling Forms:**

Handling forms is about how you handle the data when it changes value or gets submitted.

In HTML, form data is usually handled by the DOM.

In React, form data is usually handled by the components.

When the data is handled by the components, all the data is stored in the component state.

You can control changes by adding event handlers in the onChange attribute:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { username: '' };
  }
  myChangeHandler = (event) => {
    this.setState({username: event.target.value});
  }
  render() {
    return (
      <form>
      <h1>Hello {this.state.username}</h1>
      <p>Enter your name:</p>
      <input
        type='text'
        onChange={this.myChangeHandler}
      />
      </form>
    );
  }
}
```

**Conditional Rendering:**

If you do not want to display the h1 element until the user has done any input, you can add an if statement.

Look at the example below and note the following:

1. We create an empty variable, in this example we call it header.

2. We add an if statement to insert content to the header variable if the user has done any input.

3. We insert the header variable in the output, using curly brackets.

```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { username: '' };
  }
  myChangeHandler = (event) => {
    this.setState({username: event.target.value});
  }
  render() {
    let header = '';
    if (this.state.username) {
      header = <h1>Hello {this.state.username}</h1>;
    } else {
      header = '';
    }
    return (
      <form>
      {header}
      <p>Enter your name:</p>
      <input
        type='text'
        onChange={this.myChangeHandler}
      />
      </form>
    );
  }
}
```

**Submitting Forms:**

You can control the submit action by adding an event handler in the onSubmit attribute:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { username: '' };
  }
  mySubmitHandler = (event) => {
    event.preventDefault();
    alert("You are submitting " + this.state.username);
  }
  myChangeHandler = (event) => {
    this.setState({username: event.target.value});
  }
  render() {
    return (
      <form onSubmit={this.mySubmitHandler}>
      <h1>Hello {this.state.username}</h1>
      <p>Enter your name, and submit:</p>
      <input
        type='text'
        onChange={this.myChangeHandler}
      />
      <input
        type='submit'
      />
      </form>
    );
  }
}
```

Note that we use event.preventDefault() to prevent the form from actually being submitted.

**Multiple Input Fields:**

You can control the values of more than one input field by adding a name attribute to each element.

When you initialize the state in the constructor, use the field names.

To access the fields in the event handler use the event.target.name and event.target.value syntax.

To update the state in the this.setState method, use square brackets [bracket notation] around the property name:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      age: null,
    };
  }
  myChangeHandler = (event) => {
    let nam = event.target.name;
    let val = event.target.value;
    this.setState({[nam]: val});
  }
  render() {
    return (
      <form>
      <h1>Hello {this.state.username} {this.state.age}</h1>
      <p>Enter your name:</p>
      <input
        type='text'
        name='username'
        onChange={this.myChangeHandler}
      />
      <p>Enter your age:</p>
      <input
        type='text'
        name='age'
        onChange={this.myChangeHandler}
      />
      </form>
    );
  }
}
```

**Validating Form Input:**

You can validate form input when the user is typing or you can wait untill the form gets submitted.
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      age: null,
    };
  }
  myChangeHandler = (event) => {
    let nam = event.target.name;
    let val = event.target.value;
    if (nam === "age") {
      if (!Number(val)) {
        alert("Your age must be a number");
      }
    }
    this.setState({[nam]: val});
  }
  render() {
    return (
      <form>
      <h1>Hello {this.state.username} {this.state.age}</h1>
      <p>Enter your name:</p>
      <input
        type='text'
        name='username'
        onChange={this.myChangeHandler}
      />
      <p>Enter your age:</p>
      <input
        type='text'
        name='age'
        onChange={this.myChangeHandler}
      />
      </form>
    );
  }
}
```

Below you will see the same example as above, but the validation is done when the form gets submitted instead of when you write in the field.
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      age: null,
    };
  }
  mySubmitHandler = (event) => {
    event.preventDefault();
    let age = this.state.age;
    if (!Number(age)) {
      alert("Your age must be a number");
    }
  }
  myChangeHandler = (event) => {
    let nam = event.target.name;
    let val = event.target.value;
    this.setState({[nam]: val});
  }
  render() {
    return (
      <form onSubmit={this.mySubmitHandler}>
      <h1>Hello {this.state.username} {this.state.age}</h1>
      <p>Enter your name:</p>
      <input
        type='text'
        name='username'
        onChange={this.myChangeHandler}
      />
      <p>Enter your age:</p>
      <input
        type='text'
        name='age'
        onChange={this.myChangeHandler}
      />
      <br/>
      <br/>
      <input type='submit' />
      </form>
    );
  }
}
```

**Adding Error Message:**

Error messages in alert boxes can be annoying, so let's make an error message that is empty by default, but displays the error when the user inputs anything invalid:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      age: null,
      errormessage: ''
    };
  }
  myChangeHandler = (event) => {
    let nam = event.target.name;
    let val = event.target.value;
    let err = '';
    if (nam === "age") {
      if (val !="" && !Number(val)) {
        err = <strong>Your age must be a number</strong>;
      }
    }
    this.setState({errormessage: err});
    this.setState({[nam]: val});
  }
  render() {
    return (
      <form>
      <h1>Hello {this.state.username} {this.state.age}</h1>
      <p>Enter your name:</p>
      <input
        type='text'
        name='username'
        onChange={this.myChangeHandler}
      />
      <p>Enter your age:</p>
      <input
        type='text'
        name='age'
        onChange={this.myChangeHandler}
      />
      {this.state.errormessage}
      </form>
    );
  }
}
```

**Textarea:**

The textarea element in React is slightly different from ordinary HTML.

In HTML the value of a textarea was the text between the start tag <textarea> and the end tag </textarea>, in React the value of a textarea is placed in a value attribute:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      description: 'The content of a textarea goes in the value attribute'
    };
  }
  render() {
    return (
      <form>
      <textarea value={this.state.description} />
      </form>
    );
  }
}
```

**Select:**

A drop down list, or a select box, in React is also a bit different from HTML.

in HTML, the selected value in the drop down list was defined with the selected attribute:
```
class MyForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      mycar: 'Volvo'
    };
  }
  render() {
    return (
      <form>
      <select value={this.state.mycar}>
        <option value="Ford">Ford</option>
        <option value="Volvo">Volvo</option>
        <option value="Fiat">Fiat</option>
      </select>
      </form>
    );
  }
}
```

<a name="h12"/>

**CSS:**

Create a new file called "myStyles.css" and insert some CSS code in it:
myStyles.css:
```
body {
  background-color: #282c34;
  color: white;
  padding: 40px;
  font-family: Arial;
  text-align: center;
}
```

Import the stylesheet in your application:
```
import React from 'react';
import ReactDOM from 'react-dom';
import './App.css';

class MyHeader extends React.Component {
  render() {
    return (
      <div>
      <h1>Hello Style!</h1>
      <p>Add a little style!.</p>
      </div>
    );
   
}
}
```

<a name="h13"/>

**USEFULL LINKS**

**React Wikipedia:**

https://en.wikipedia.org/wiki/React_(web_framework)

**React Tutorial:**

https://www.w3schools.com/react/default.asp

**Deploy react apps in Netlify:**

https://www.netlify.com/blog/2016/07/22/deploy-react-apps-in-less-than-30-seconds/

**React routes:**

https://www.codingame.com/playgrounds/6517/react-router-tutorial