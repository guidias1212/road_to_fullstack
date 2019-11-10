# 2.7) CSS Architecture

To many Web developers, being good at CSS means you can take a visual mock-up and replicate it perfectly in code. You don’t use tables, and you pride yourself on using as few images as possible. If you’re really good, you use the latest and greatest techniques like media queries, transitions and transforms. While all this is certainly true of good CSS developers, there’s an entirely separate side to CSS that rarely gets mentioned when assessing one’s skill.

Interestingly, we don’t usually make this oversight with other languages. A Rails developer isn’t considered good just because his code works to spec. This is considered baseline. Of course it must work to spec; its merit is based on other things: Is the code readable? Is it easy to change or extend? Is it decoupled from other parts of the application? Will it scale?

These questions are natural when assessing other parts of the code base, and CSS shouldn’t be any different. Today’s web applications are larger than ever, and a poorly thought-out CSS architecture can cripple development. It’s time to evaluate CSS the same way we evaluate every other part of the application. It cannot be an afterthought or written off as merely the designer’s problem.

<details open>
<summary>Table of Contents</summary>
<br>

[USEFULL LINKS](#h1)

</details>

There are plenty of methodologies out there aiming to reduce the CSS footprint, organize cooperation among programmers and maintain large CSS codebases. This is obvious in large projects like Twitter, Facebook and Github, but other projects often grow into some “Huge CSS file” state pretty quickly.

BEM (Block Element Modifier) is less confusing than the other methods (i.e. SMACSS) but still provides us the good architecture we want (i.e. OOCSS) and with a recognizable terminology.

<a name="h1"/>

**USEFULL LINKS**

**BEM Website:**

http://getbem.com/introduction/

**CSS Best practices:**

https://philipwalton.com/articles/css-architecture/