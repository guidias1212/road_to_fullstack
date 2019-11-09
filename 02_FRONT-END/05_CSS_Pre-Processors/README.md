# 2.5) CSS Pre-Processors

Sass (short for syntactically awesome style sheets) is a style sheet language.

Sass is a preprocessor scripting language that is interpreted or compiled into Cascading Style Sheets (CSS). SassScript is the scripting language itself. Sass consists of two syntaxes.

CSS3 consists of a series of selectors and pseudo-selectors that group rules that apply to them. Sass (in the larger context of both syntaxes) extends CSS by providing several mechanisms available in more traditional programming languages, particularly object-oriented languages, but that are not available to CSS3 itself. When SassScript is interpreted, it creates blocks of CSS rules for various selectors as defined by the Sass file. The Sass interpreter translates SassScript into CSS. Alternatively, Sass can monitor the .sass or .scss file and translate it to an output .css file whenever the .sass or .scss file is saved.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Example](#h2)

[USEFULL LINKS](#h3)

</details>

<a name="h1"/>

**Introduction:**

When you install Sass on the command line, you'll be able to run the sass executable to compile .sass and .scss files to .css files. For example:
```
sass source/stylesheets/index.scss build/stylesheets/index.css
```

<a name="h2"/>

**Example:**

The following example declares 4 variables named myFont, myColor, myFontSize, and myWidth. After the variables are declared, you can use the variables wherever you want:

SCSS Syntax:
```
$myFont: Helvetica, sans-serif;
$myColor: red;
$myFontSize: 18px;
$myWidth: 680px;

body {
  font-family: $myFont;
  font-size: $myFontSize;
  color: $myColor;
}

#container {
  width: $myWidth;
}
```

So, when the Sass file is transpiled, it takes the variables (myFont, myColor, etc.) and outputs normal CSS with the variable values placed in the CSS, like this:

CSS Output:
```
body {
  font-family: Helvetica, sans-serif;
  font-size: 18px;
  color: red;
}

#container {
  width: 680px;
}
```

<a name="h3"/>

**USEFULL LINKS**

**SASS Wikipedia:**

https://en.wikipedia.org/wiki/Sass_(stylesheet_language)

**SASS Tutorial:**

https://www.w3schools.com/sass/default.asp

**SASS Website:**

https://sass-lang.com/