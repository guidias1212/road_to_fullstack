# 2.1) HTML

Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Basic](#h2)

[Elements](#h3)

[Attributes](#h4)

[Headings](#h5)

[Paragraphs](#h6)

[Styles](#h7)

[Formatting](#h8)

[Quotations](#h9)

[Comments](#h10)

[Colors](#h11)

[CSS](#h12)

[Links](#h13)

[Images](#h14)

[Tables](#h15)

[Lists](#h16)

[Blocks](#h17)

[Classes](#h18)

[Id](#h19)

[Iframes](#h20)

[JavaScript](#h21)

[File Paths](#h22)

[HeadingLayout](#h23)

[Responsive](#h24)

[Computercode](#h25)

[Entities](#h26)

[Symbols](#h27)

[Charset](#h28)

[URL Encode](#h29)

[XHTML](#h30)

[Forms](#h31)

[Form Elements](#h32)

[Form Input Types](#h33)

[Input Attributes](#h34)

[HTML5 Intro](#h35)

[HTML5 Support](#h36)

[HTML5 New Elements](#h37)

[HTML5 New Semantics](#h38)

[HTML5 Migration](#h39)

[HTML5 Style Guide](#h40)

[Canvas](#h41)

[SVG](#h42)

[Media](#h43)

[Video](#h44)

[Audio](#h45)

[Plug-ins](#h46)

[YouTube](#h47)

[USEFULL LINKS](#h48)

</details>

<a name="h1"/>

**Introduction:**

HTML is the standard markup language for creating Web pages.

* HTML stands for Hyper Text Markup Language
* HTML describes the structure of a Web page
* HTML consists of a series of elements
* HTML elements tell the browser how to display the content
* HTML elements are represented by tags
* HTML tags label pieces of content such as "heading", "paragraph", "table", and so on
* Browsers do not display the HTML tags, but use them to render the content of the page

A Simple HTML Document:

Example
```
<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
</head>
<body>

<h1>My First Heading</h1>
<p>My first paragraph.</p>

</body>
</html>
```

Example Explained:

* The <!DOCTYPE html> declaration defines this document to be HTML5
* The <html> element is the root element of an HTML page
* The <head> element contains meta information about the document
* The <title> element specifies a title for the document
* The <body> element contains the visible page content
* The <h1> element defines a large heading
* The <p> element defines a paragraph

HTML Tags:

HTML tags are element names surrounded by angle brackets:
```
<tagname>content goes here...</tagname>
```
* HTML tags normally come in pairs like <p> and </p>
* The first tag in a pair is the start tag, the second tag is the end tag
* The end tag is written like the start tag, but with a forward slash inserted before the tag name

Web Browsers:

The purpose of a web browser (Chrome, Edge, Firefox, Safari) is to read HTML documents and display them.

The browser does not display the HTML tags, but uses them to determine how to display the document.

The <!DOCTYPE> Declaration:

The <!DOCTYPE> declaration represents the document type, and helps browsers to display web pages correctly.

It must only appear once, at the top of the page (before any HTML tags).

The <!DOCTYPE> declaration is not case sensitive.

The <!DOCTYPE> declaration for HTML5 is:
```
<!DOCTYPE html>
```

<a name="h2"/>

**Basic:**

**Documents**

All HTML documents must start with a document type declaration: <!DOCTYPE html>.

The HTML document itself begins with <html> and ends with </html>.

The visible part of the HTML document is between <body> and </body>.

Example:
```
<!DOCTYPE html>
<html>
<body>

<h1>My First Heading</h1>
<p>My first paragraph.</p>

</body>
</html>
```

**Headings**

HTML headings are defined with the <h1> to <h6> tags.

<h1> defines the most important heading. <h6> defines the least important heading: 

Example:
```
<h1>This is heading 1</h1>
<h2>This is heading 2</h2>
<h3>This is heading 3</h3>
```

**Paragraphs**

HTML paragraphs are defined with the <p> tag:

Example:
```
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
```

**Links**

HTML links are defined with the <a> tag:

Example
```
<a href="https://www.w3schools.com">This is a link</a>
```

The link's destination is specified in the href attribute. 

**Images**

HTML images are defined with the <img> tag.

The source file (src), alternative text (alt), width, and height are provided as attributes:

Example:
```
<img src="w3schools.jpg" alt="W3Schools.com" width="104" height="142">
```

**Buttons**

HTML buttons are defined with the <button> tag:

Example:
```
<button>Click me</button>
```

**HTML Lists**

HTML lists are defined with the <ul> (unordered/bullet list) or the <ol> (ordered/numbered list) tag, followed by <li> tags (list items):

Example:
```
<ul>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ul>

<ol>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ol>
```

<a name="h3"/>

**Elements:**

An HTML element usually consists of a start tag and an end tag, with the content inserted in between:
```
<tagname>Content goes here...</tagname>
```

**Nested HTML Elements**

HTML elements can be nested (elements can contain elements).

All HTML documents consist of nested HTML elements (Elements inside other elements).

**Empty HTML Elements**

HTML elements with no content are called empty elements.

<br> is an empty element without a closing tag (the <br> tag defines a line break):

Example:
```
<p>This is a <br> paragraph with a line break.</p>
```

Empty elements can be "closed" in the opening tag like this: <br />.

HTML5 does not require empty elements to be closed. But if you want stricter validation, or if you need to make your document readable by XML parsers, you must close all HTML elements properly.

**HTML Is Not Case Sensitive**

HTML tags are not case sensitive: <P> means the same as <p>.

The HTML5 standard does not require lowercase tags, but it is recommended to use lowercase in HTML, and demands lowercase for stricter document types like XHTML.

<a name="h4"/>

**Attributes:**

* All HTML elements can have attributes
* Attributes provide additional information about an element
* Attributes are always specified in the start tag
* Attributes usually come in name/value pairs like: name="value"

**The href Attribute**

HTML links are defined with the <a> tag. The link address is specified in the href attribute:

Example:
```
<a href="https://www.w3schools.com">This is a link</a>
```

**The src Attribute**

HTML images are defined with the <img> tag.

The filename of the image source is specified in the src attribute:

Example:
```
<img src="img_girl.jpg">
```

**The width and height Attributes**

HTML images also have width and height attributes, which specifies the width and height of the image:

Example:
```
<img src="img_girl.jpg" width="500" height="600">
```

**The alt Attribute**

The alt attribute specifies an alternative text to be used, if an image cannot be displayed.

The value of the alt attribute can be read by screen readers. This way, someone "listening" to the webpage, e.g. a vision impaired person, can "hear" the element.

Example:
```
<img src="img_girl.jpg" alt="Girl with a jacket">
```

<a name="h5"/>

**Headings:**

Headings are defined with the <h1> to <h6> tags.

<h1> defines the most important heading. <h6> defines the least important heading.

Example:
```
<h1>Heading 1</h1>
<h2>Heading 2</h2>
<h3>Heading 3</h3>
<h4>Heading 4</h4>
<h5>Heading 5</h5>
<h6>Heading 6</h6>
```

**Headings Are Important**

Search engines use the headings to index the structure and content of your web pages.

Users often skim a page by its headings. It is important to use headings to show the document structure.

<h1> headings should be used for main headings, followed by <h2> headings, then the less important <h3>, and so on.

**Bigger Headings**

Each HTML heading has a default size. However, you can specify the size for any heading with the style attribute, using the CSS font-size property:

Example:
```
<h1 style="font-size:60px;">Heading 1</h1>
```

**Horizontal Rules**

The <hr> tag defines a thematic break in an HTML page, and is most often displayed as a horizontal rule.

The <hr> element is used to separate content (or define a change) in an HTML page:

Example:
```
<h1>This is heading 1</h1>
<p>This is some text.</p>
<hr>
<h2>This is heading 2</h2>
<p>This is some other text.</p>
<hr>
```

**The <head> Element**

The HTML <head> element is a container for metadata. HTML metadata is data about the HTML document. Metadata is not displayed.

The <head> element is placed between the <html> tag and the <body> tag:

Example:
```
<!DOCTYPE html>
<html>

<head>
  <title>My First HTML</title>
  <meta charset="UTF-8">
</head>

<body>
</html>
```

<a name="h6"/>

**Paragraphs:**

<a name="h7"/>

**Styles:**

<a name="h8"/>

**Formatting:**

<a name="h9"/>

**Quotations:**

<a name="h10"/>

**Comments:**

<a name="h11"/>

**Colors:**

<a name="h12"/>

**CSS:**

<a name="h13"/>

**Links:**

<a name="h14"/>

**Images:**

<a name="h15"/>

**Tables:**

<a name="h16"/>

**Lists:**

<a name="h17"/>

**Blocks:**

<a name="h18"/>

**Classes:**

<a name="h19"/>

**Id:**

<a name="h20"/>

**Iframes:**

<a name="h21"/>

**JavaScript:**

<a name="h22"/>

**File Paths:**

<a name="h23"/>

**HeadingLayout:**

<a name="h24"/>

**Responsive:**

<a name="h25"/>

**Computercode:**

<a name="h26"/>

**Entities:**

<a name="h27"/>

**Symbols:**

<a name="h28"/>

**Charset:**

<a name="h29"/>

**URL Encode:**

<a name="h30"/>

**XHTML:**

<a name="h31"/>

**Forms:**

<a name="h32"/>

**Form Elements:**

<a name="h33"/>

**Form Input Types:**

<a name="h34"/>

**Input Attributes:**

<a name="h35"/>

**HTML5 Intro:**

<a name="h36"/>

**HTML5 Support:**

<a name="h37"/>

**HTML5 New Elements:**

<a name="h38"/>

**HTML5 New Semantics:**

<a name="h39"/>

**HTML5 Migration:**

<a name="h40"/>

**HTML5 Style Guide:**

<a name="h41"/>

**Canvas:**

<a name="h42"/>

**SVG:**

<a name="h43"/>

**Media:**

<a name="h44"/>

**Video:**

<a name="h45"/>

**Audio:**

<a name="h46"/>

**Plug-ins:**

<a name="h47"/>

**YouTube:**

<a name="h48"/>

**USEFULL LINKS**

**HTML Wikipedia:**

https://en.wikipedia.org/wiki/HTML

**HTML Tutorial:**

https://www.w3schools.com/html/