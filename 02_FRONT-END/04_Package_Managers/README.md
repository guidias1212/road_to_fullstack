# 2.4) Package Managers

Yarn is a package manager for your code. It allows you to use and share code with other developers from around the world. Yarn does this quickly, securely, and reliably so you don’t ever have to worry.

Yarn allows you to use other developers’ solutions to different problems, making it easier for you to develop your software. If you have problems, you can report issues or contribute back, and when the problem is fixed, you can use Yarn to keep it all up to date.

Code is shared through something called a package (sometimes referred to as a module). A package contains all the code being shared as well as a package.json file which describes the package.

<details open>
<summary>Table of Contents</summary>
<br>

[Starting a new project](#h1)

[Adding a dependency](#h2)

[Adding a dependency to different categories of dependencies](#h3)

[Upgrading a dependency](#h4)

[Removing a dependency](#h5)

[Installing all the dependencies of project](#h6)

[USEFULL LINKS](#h7)

</details>

<a name="h1"/>

**Starting a new project:**

```
yarn init
```

<a name="h2"/>

**Adding a dependency:**

```
yarn add [package]
yarn add [package]@[version]
yarn add [package]@[tag]
```

<a name="h3"/>

**Adding a dependency to different categories of dependencies:**

```
yarn add [package] --dev
yarn add [package] --peer
yarn add [package] --optional
```

<a name="h4"/>

**Upgrading a dependency:**

```
yarn upgrade [package]
yarn upgrade [package]@[version]
yarn upgrade [package]@[tag]
```

<a name="h5"/>

**Removing a dependency:**

```
yarn remove [package]
```

<a name="h6"/>

**Installing all the dependencies of project:**

```
yarn
```

or:

```
yarn install
```

<a name="h7"/>

**USEFULL LINKS**

**Yarn Website:**

https://yarnpkg.com/lang/en/

**Npm vs. Yarn:**

https://medium.com/@j.dumadag718/yarn-vs-npm-b2d58289fb9b


**Package manager tutorial:**

https://www.w3schools.com/nodejs/nodejs_npm.asp