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

The HTML <p> element defines a paragraph:

Example:
```
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
```

**The HTML <pre> Element**

The HTML <pre> element defines preformatted text.

The text inside a <pre> element is displayed in a fixed-width font (usually Courier), and it preserves both spaces and line breaks:

Example:
```
<pre>
  My Bonnie lies over the ocean.

  My Bonnie lies over the sea.

  My Bonnie lies over the ocean.

  Oh, bring back my Bonnie to me.
</pre>
```

<a name="h7"/>

**Styles:**

Setting the style of an HTML element, can be done with the style attribute.

The HTML style attribute has the following syntax:
```
<tagname style="property:value;">
```

**Background Color**

The CSS background-color property defines the background color for an HTML element.

This example sets the background color for a page to powderblue:

Example:
```
<body style="background-color:powderblue;">

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
```

**Text Color**

The CSS color property defines the text color for an HTML element:

Example:
```
<h1 style="color:blue;">This is a heading</h1>
<p style="color:red;">This is a paragraph.</p>
```

**Fonts**

The CSS font-family property defines the font to be used for an HTML element:

Example:
```
<h1 style="font-family:verdana;">This is a heading</h1>
<p style="font-family:courier;">This is a paragraph.</p>
```

**Text Size**

The CSS font-size property defines the text size for an HTML element:

Example:
```
<h1 style="font-size:300%;">This is a heading</h1>
<p style="font-size:160%;">This is a paragraph.</p>
```

**Text Alignment**

The CSS text-align property defines the horizontal text alignment for an HTML element:

Example:
```
<h1 style="text-align:center;">Centered Heading</h1>
<p style="text-align:center;">Centered paragraph.</p>
```

<a name="h8"/>

**Formatting:**

HTML also defines special elements for defining text with a special meaning.

HTML uses elements like <b> and <i> for formatting output, like bold or italic text.

Formatting elements were designed to display special types of text:

* <b> - Bold text
* <strong> - Important text
* <i> - Italic text
* <em> - Emphasized text
* <mark> - Marked text
* <small> - Small text
* <del> - Deleted text
* <ins> - Inserted text
* <sub> - Subscript text
* <sup> - Superscript text

**HTML <b> and <strong> Elements**

The HTML <b> element defines bold text, without any extra importance.

Example:
```
<b>This text is bold</b>
```

The HTML <strong> element defines strong text, with added semantic "strong" importance.

Example:
```
<strong>This text is strong</strong>
```

**HTML <i> and <em> Elements**

The HTML <i> element defines italic text, without any extra importance.

Example:
```
<i>This text is italic</i>
```

The HTML <em> element defines emphasized text, with added semantic importance.

Example:
```
<em>This text is emphasized</em>
```

**HTML <small> Element**

The HTML <small> element defines smaller text:

Example:
```
<h2>HTML <small>Small</small> Formatting</h2>
```

**HTML <mark> Element**

The HTML <mark> element defines marked/highlighted text:

Example:
```
<h2>HTML <mark>Marked</mark> Formatting</h2>
```

**HTML <del> Element**

The HTML <del> element defines deleted/removed text.

Example:
```
<p>My favorite color is <del>blue</del> red.</p>
```

**HTML <ins> Element**

The HTML <ins> element defines inserted/added text.

Example:
```
<p>My favorite <ins>color</ins> is red.</p>
```

**HTML <sub> Element**

The HTML <sub> element defines subscripted text.

Example:
```
<p>This is <sub>subscripted</sub> text.</p>
```

**HTML <sup> Element**

The HTML <sup> element defines superscripted text.

Example:
```
<p>This is <sup>superscripted</sup> text.</p>
```

<a name="h9"/>

**Quotations:**

**HTML <q> for Short Quotations**

The HTML <q> element defines a short quotation.

Browsers usually insert quotation marks around the <q> element.

Example:
```
<p>WWF's goal is to: <q>Build a future where people live in harmony with nature.</q></p>
```

**HTML <blockquote> for Quotations**

The HTML <blockquote> element defines a section that is quoted from another source.

Browsers usually indent <blockquote> elements.

Example:
```
<p>Here is a quote from WWF's website:</p>
<blockquote cite="http://www.worldwildlife.org/who/index.html">
For 50 years, WWF has been protecting the future of nature.
The world's leading conservation organization,
WWF works in 100 countries and is supported by
1.2 million members in the United States and
close to 5 million globally.
</blockquote>
```

**HTML <abbr> for Abbreviations**

The HTML <abbr> element defines an abbreviation or an acronym.

Marking abbreviations can give useful information to browsers, translation systems and search-engines.

Example:
```
<p>The <abbr title="World Health Organization">WHO</abbr> was founded in 1948.</p>
```

**HTML <address> for Contact Information**

The HTML <address> element defines contact information (author/owner) of a document or an article.

The <address> element is usually displayed in italic. Most browsers will add a line break before and after the element.

Example:
```
<address>
Written by John Doe.<br>
Visit us at:<br>
Example.com<br>
Box 564, Disneyland<br>
USA
</address>
```

**HTML <cite> for Work Title**

The HTML <cite> element defines the title of a work.

Browsers usually display <cite> elements in italic.

Example:
```
<p><cite>The Scream</cite> by Edvard Munch. Painted in 1893.</p>
```

**HTML <bdo> for Bi-Directional Override**

The HTML <bdo> element defines bi-directional override.

The <bdo> element is used to override the current text direction:

Example:
```
<bdo dir="rtl">This text will be written from right to left</bdo>
```

<a name="h10"/>

**Comments:**

You can add comments to your HTML source by using the following syntax:
```
<!-- Write your comments here -->
```

<a name="h11"/>

**Colors:**

HTML supports 140 standard color names:

https://www.w3schools.com/colors/colors_names.asp

**Background Color**

You can set the background color for HTML elements:

Example:
```
<h1 style="background-color:DodgerBlue;">Hello World</h1>
<p style="background-color:Tomato;">Lorem ipsum...</p>
<a name="h12"/>
```

**Text Color**

You can set the color of text:

Example:
```
<h1 style="color:Tomato;">Hello World</h1>
<p style="color:DodgerBlue;">Lorem ipsum...</p>
<p style="color:MediumSeaGreen;">Ut wisi enim...</p>
```

**Border Color**

You can set the color of borders:

Example:
```
<h1 style="border:2px solid Tomato;">Hello World</h1>
<h1 style="border:2px solid DodgerBlue;">Hello World</h1>
<h1 style="border:2px solid Violet;">Hello World</h1>
```

**Color Values**

In HTML, colors can also be specified using RGB values, HEX values, HSL values, RGBA values, and HSLA values:

Example:
```
<h1 style="background-color:rgb(255, 99, 71);">...</h1>
<h1 style="background-color:#ff6347;">...</h1>
<h1 style="background-color:hsl(9, 100%, 64%);">...</h1>

<h1 style="background-color:rgba(255, 99, 71, 0.5);">...</h1>
<h1 style="background-color:hsla(9, 100%, 64%, 0.5);">...</h1>
```

**RGB Value**

In HTML, a color can be specified as an RGB value, using this formula:
```
rgb(red, green, blue)
```

Each parameter (red, green, and blue) defines the intensity of the color between 0 and 255.

**HEX Value**
In HTML, a color can be specified using a hexadecimal value in the form:
```
#rrggbb
```

Where rr (red), gg (green) and bb (blue) are hexadecimal values between 00 and ff (same as decimal 0-255).

**HSL Value**

In HTML, a color can be specified using hue, saturation, and lightness (HSL) in the form:
```
hsl(hue, saturation, lightness)
```

Hue is a degree on the color wheel from 0 to 360. 0 is red, 120 is green, and 240 is blue.

**RGBA Value**

RGBA color values are an extension of RGB color values with an alpha channel - which specifies the opacity for a color.

An RGBA color value is specified with:
```
rgba(red, green, blue, alpha)
```

The alpha parameter is a number between 0.0 (fully transparent) and 1.0 (not transparent at all)

**HSLA Value**

HSLA color values are an extension of HSL color values with an alpha channel - which specifies the opacity for a color.

An HSLA color value is specified with:
```
hsla(hue, saturation, lightness, alpha)
```

The alpha parameter is a number between 0.0 (fully transparent) and 1.0 (not transparent at all)

**CSS:**

CSS stands for Cascading Style Sheets.

CSS describes how HTML elements are to be displayed on screen, paper, or in other media.

CSS saves a lot of work. It can control the layout of multiple web pages all at once.

CSS can be added to HTML elements in 3 ways:

* **Inline** - by using the style attribute in HTML elements
* **Internal** - by using a <style> element in the <head> section
* **External** - by using an external CSS file
The most common way to add CSS, is to keep the styles in separate CSS files. However, here we will use inline and internal styling, because this is easier to demonstrate, and easier for you to try it

**Inline CSS**

An inline CSS is used to apply a unique style to a single HTML element.

An inline CSS uses the style attribute of an HTML element.

This example sets the text color of the <h1> element to blue:

Example:
```
<h1 style="color:blue;">This is a Blue Heading</h1>
```
**Internal CSS**

An internal CSS is used to define a style for a single HTML page.

An internal CSS is defined in the <head> section of an HTML page, within a <style> element:

Example:
```
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

**External CSS**

An external style sheet is used to define the style for many HTML pages.

With an external style sheet, you can change the look of an entire web site, by changing one file!

To use an external style sheet, add a link to it in the <head> section of the HTML page:

Example:
```
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

An external style sheet can be written in any text editor. The file must not contain any HTML code, and must be saved with a .css extension.

Here is how the "styles.css" looks:
```
body {
  background-color: powderblue;
}
h1 {
  color: blue;
}
p {
  color: red;
}
```

**CSS Fonts**

The CSS color property defines the text color to be used.

The CSS font-family property defines the font to be used.

The CSS font-size property defines the text size to be used.

Example:
```
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  color: blue;
  font-family: verdana;
  font-size: 300%;
}
p  {
  color: red;
  font-family: courier;
  font-size: 160%;
}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

**CSS Border**

The CSS border property defines a border around an HTML element:

Example:
```
p {
  border: 1px solid powderblue;
}
```

**CSS Padding**
The CSS padding property defines a padding (space) between the text and the border:

Example:
```
p {
  border: 1px solid powderblue;
  padding: 30px;
}
```

**CSS Margin**

The CSS margin property defines a margin (space) outside the border:

Example:
```
p {
  border: 1px solid powderblue;
  margin: 50px;
}
```

**The id Attribute**

To define a specific style for one special element, add an id attribute to the element:
```
<p id="p01">I am different</p>
```

then define a style for the element with the specific id:

Example:
```
#p01 {
  color: blue;
}
```

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