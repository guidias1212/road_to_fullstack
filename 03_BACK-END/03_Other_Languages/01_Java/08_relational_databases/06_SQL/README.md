# 3.3.1.8.6) SQL

SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS). It is particularly useful in handling structured data where there are relations between different entities/variables of the data. SQL offers two main advantages over older read/write APIs like ISAM or VSAM. First, it introduced the concept of accessing many records with one single command; and second, it eliminates the need to specify how to reach a record, e.g. with or without an index.

The following SQL code examples were tested using MySQL Workbench and its default database example called "world". It contains the following tables:

| **Table** | **Columns** |
| --- | --- |
| city | ID, Name, CountryCode, District, Population |
| country | Code, Name, Continent, Region, SurfaceArea, IndepYear, Population, LifeExpectancy, GNP, GNPOId, LocalName, GovernmentForm, HeadOfState, Capital, Code2 |
| countrylanguage | CountryCode, Language, IsOfficial, Percentage |


Some important SQL command lines are given by:

**SELECT:**

The SELECT statement is used to select data from a database. The data returned is stored in a result table, called the result-set.
```
SELECT column1, column2, ...
FROM table_name;
```

Here, column1, column2, ... are the field names of the table you want to select data from. If you want to select all the fields available in the table, use the following syntax:
```
SELECT * FROM table_name;
```

**SELECT DISTINCT:**

The SELECT DISTINCT statement is used to return only distinct (different) values. Inside a table, a column often contains many duplicate values; and sometimes you only want to list the different (distinct) values.
```
SELECT DISTINCT column1, column2, ...
FROM table_name;
```

**WHERE:**

The WHERE clause is used to filter records. The WHERE clause is used to extract only those records that fulfill a specified condition.
```
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```

The following SQL statement selects all the names from cities where the country code is NLD (Niederlands):
```
SELECT Name
FROM city
WHERE CountryCode='NLD'
```

**AND, OR and NOT:**

The WHERE clause can be combined with AND, OR, and NOT operators.

The AND and OR operators are used to filter records based on more than one condition:

* The AND operator displays a record if all the conditions separated by AND are TRUE.
* The OR operator displays a record if any of the conditions separated by OR is TRUE.

The NOT operator displays a record if the condition(s) is NOT TRUE.

AND Syntax:
```
SELECT column1, column2, ...
FROM table_name
WHERE condition1 AND condition2 AND condition3 ...;
```

OR Syntax:
```
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...;
```

NOT Syntax:
```
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition;
```

**ORDER BY:**

The ORDER BY keyword is used to sort the result-set in ascending or descending order. The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword. It can be used to order multiple columns at the same time.
```
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;
```

**INSERT INTO:**

The INSERT INTO statement is used to insert new records in a table.
```
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);
```

**NULL Values:**

A field with a NULL value is a field with no value. If a field in a table is optional, it is possible to insert a new record or update a record without adding a value to this field. Then, the field will be saved with a NULL value.

Test for NULL Values:

It is not possible to test for NULL values with comparison operators, such as =, <, or <>.

We will have to use the IS NULL and IS NOT NULL operators instead:

IS NULL Syntax:
```
SELECT column_names
FROM table_name
WHERE column_name IS NULL;
```

IS NOT NULL Syntax:
```
SELECT column_names
FROM table_name
WHERE column_name IS NOT NULL;
```

**UPDATE:**

The UPDATE statement is used to modify the existing records in a table.
```
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
```

**DELETE:**

The DELETE statement is used to delete existing records in a table.
```
DELETE FROM table_name WHERE condition;
```

**SELECT TOP:**

The SELECT TOP clause is used to specify the number of records to return. The SELECT TOP clause is useful on large tables with thousands of records. Returning a large number of records **can impact on performance**.

MySQL Syntax:
```
SELECT column_name(s)
FROM table_name
WHERE condition
LIMIT number;
```

SQL Server / MS Access Syntax:
```
SELECT TOP number|percent column_name(s)
FROM table_name
WHERE condition;
```

Oracle Syntax:
```
SELECT column_name(s)
FROM table_name
WHERE ROWNUM <= number;
```

**MIN() and MAX() Functions:**

The MIN() function returns the smallest value of the selected column.

The MAX() function returns the largest value of the selected column.

MIN() Syntax:
```
SELECT MIN(column_name)
FROM table_name
WHERE condition;
```

MAX() Syntax
```
SELECT MAX(column_name)
FROM table_name
WHERE condition;
```

**COUNT(), AVG() and SUM() Functions:**

The COUNT() function returns the number of rows that matches a specified criteria.

The AVG() function returns the average value of a numeric column.

The SUM() function returns the total sum of a numeric column.

COUNT() Syntax:
```
SELECT COUNT(column_name)
FROM table_name
WHERE condition;
```

AVG() Syntax:
```
SELECT AVG(column_name)
FROM table_name
WHERE condition;
```

SUM() Syntax:
```
SELECT SUM(column_name)
FROM table_name
WHERE condition;
```

**LIKE:**

The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.

There are two wildcards often used in conjunction with the LIKE operator:

* % - The percent sign represents zero, one, or multiple characters
* _ - The underscore represents a single character

Obs.: MS Access uses an asterisk (*) instead of the percent sign (%), and a question mark (?) instead of the underscore (_).

LIKE Syntax:
```
SELECT column1, column2, ...
FROM table_name
WHERE columnN LIKE pattern;
```

Here are some examples showing different LIKE operators with '%' and '_' wildcards:

| **LIKE Operator** | **Description** |
| --- | --- |
| WHERE CustomerName LIKE 'a%' | Finds any values that start with "a" |
| WHERE CustomerName LIKE '%a' | Finds any values that end with "a" |
| WHERE CustomerName LIKE '%or%' | Finds any values that have "or" in any position |
| WHERE CustomerName LIKE '_r%' | Finds any values that have "r" in the second position |
| WHERE CustomerName LIKE 'a__%' | Finds any values that start with "a" and are at least 3 characters in length |
| WHERE ContactName LIKE 'a%o' | Finds any values that start with "a" and ends with "o" |





**USEFULL LINKS**

**History:**

https://en.wikipedia.org/wiki/SQL


** SQL tutorial:**

https://www.w3schools.com/sql/default.asp