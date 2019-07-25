# 3.3.1.8.6) SQL

SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS). It is particularly useful in handling structured data where there are relations between different entities/variables of the data. SQL offers two main advantages over older read/write APIs like ISAM or VSAM. First, it introduced the concept of accessing many records with one single command; and second, it eliminates the need to specify how to reach a record, e.g. with or without an index.

The following SQL code examples were tested using MySQL Workbench and its default database example called "world". It contains the following tables:

| **Table** | **Columns** |
| --- | --- |
| **Table** | **Columns** |
| city | ID, Name, CountryCode, District, Population |
| country | Code, Name, Continent, Region, SurfaceArea, IndepYear, Population, LifeExpectancy, GNP, GNPOId, LocalName, GovernmentForm, HeadOfState, Capital, Code2 |
| countrylanguage | CountryCode, Language, IsOfficial, Percentage |

**USEFULL LINKS**

**History:**

https://en.wikipedia.org/wiki/SQL


** SQL tutorial:**

https://www.w3schools.com/sql/default.asp