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

The SELECT statement is used to select data from a database. The data returned is stored in a result table, called the result-set:
```
SELECT column1, column2, ...
FROM table_name;
```

Here, column1, column2, ... are the field names of the table you want to select data from. If you want to select all the fields available in the table, use the following syntax:
```
SELECT * FROM table_name;
```

**SELECT DISTINCT:**

The SELECT DISTINCT statement is used to return only distinct (different) values. Inside a table, a column often contains many duplicate values; and sometimes you only want to list the different (distinct) values:
```
SELECT DISTINCT column1, column2, ...
FROM table_name;
```

**WHERE:**

The WHERE clause is used to filter records. The WHERE clause is used to extract only those records that fulfill a specified condition:
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

Operators:

| **Operator** | **Description** |
| --- | --- |
| = | Equal |
| > | Greater than |
| < | Less than |
| >= | 	Greater than or equal |
| <= | 	Less than or equal |
| <> | 	Not equal, may be != in some versions|
| BETWEEN | Between a certain range |
| LIKE | Search for a pattern |
| IN | 	To specify multiple possible values for a column |


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

The ORDER BY keyword is used to sort the result-set in ascending or descending order. The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword. It can be used to order multiple columns at the same time:
```
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;
```

**INSERT INTO:**

The INSERT INTO statement is used to insert new records in a table:
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

The UPDATE statement is used to modify the existing records in a table:
```
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
```

**DELETE:**

The DELETE statement is used to delete existing records in a table:
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

MAX() Syntax:
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

**Wildcards:**

A wildcard character is used to substitute one or more characters in a string. Wildcard characters are used with the SQL LIKE operator. The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.

Wildcard Characters in SQL Server:

| Symbol | Symbol | Example |
| --- | --- | --- |
| % | Represents zero or more characters | bl% finds bl, black, blue, and blob |
| _ | Represents a single character | h_t finds hot, hat, and hit |
| [] | Represents any single character within the brackets | h[oa]t finds hot and hat, but not hit |
| ^ | Represents any character not in the brackets | h[^oa]t finds hit, but not hot and hat |
| - | Represents a range of characters | c[a-b]t finds cat and cbt |

**IN:**

The IN operator allows you to specify multiple values in a WHERE clause. The IN operator is a shorthand for multiple OR conditions:
```
SELECT column_name(s)
FROM table_name
WHERE column_name IN (value1, value2, ...);
```

or:
```
SELECT column_name(s)
FROM table_name
WHERE column_name IN (SELECT STATEMENT);
```

**BETWEEN:**

The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates. The BETWEEN operator is inclusive: begin and end values are included:
```
SELECT column_name(s)
FROM table_name
WHERE column_name BETWEEN value1 AND value2;
```

**Aliases:**

SQL aliases are used to give a table, or a column in a table, a temporary name. Aliases are often used to make column names more readable. An alias only exists for the duration of the query:
```
SELECT column_name AS column_alias_name
FROM table_name AS table_alias_name;
```

**INNER JOIN:**

The INNER JOIN keyword selects records that have matching values in both tables:
```
SELECT city.Name, country.Name, city.Population
FROM city
INNER JOIN country 
ON city.CountryCode=country.Code
```

**LEFT JOIN:**

The LEFT JOIN keyword returns all records from the left table (city), and the matched records from the right table (countrylanguage). The result is NULL from the right side, if there is no match.

The following SQL statement will select all cities, and any languages they might have:
```
SELECT city.Name, countrylanguage.Language
FROM city
LEFT JOIN countrylanguage
ON city.CountryCode = countrylanguage.CountryCode;
```

**RIGHT JOIN:**

The RIGHT JOIN keyword returns all records from the right table (table2), and the matched records from the left table (table1). The result is NULL from the left side, when there is no match.

The following SQL statement will return all languages, and any city they might belong:
```
SELECT city.Name, countrylanguage.Language
FROM city
RIGHT JOIN countrylanguage
ON city.CountryCode = countrylanguage.CountryCode;
```

**FULL OUTER JOIN:**

The FULL OUTER JOIN keyword return all records when there is a match in either left (table1) or right (table2) table records.
```
SELECT column_name(s)
FROM table1
FULL OUTER JOIN table2
ON table1.column_name = table2.column_name
WHERE condition;
```

**Self JOIN:**

A self JOIN is a regular join, but the table is joined with itself.

The following SQL statement matches cities that are from the same country:
```
SELECT A.Name AS CityName1, B.Name AS CityName2, A.Population
FROM city A, city B
WHERE A.ID <> B.ID
AND A.CountryCode = B.CountryCode 
ORDER BY A.CountryCode;
```

A and B are different table aliases for the same table.

**UNION:**

The UNION operator is used to combine the result-set of two or more SELECT statements.

* Each SELECT statement within UNION must have the same number of columns
* The columns must also have similar data types
* The columns in each SELECT statement must also be in the same order

UNION Syntax:
```
SELECT column_name(s) FROM table1
UNION
SELECT column_name(s) FROM table2;
```

The UNION operator selects only distinct values by default. To allow duplicate values, use UNION ALL:

UNION ALL Syntax:
```
SELECT column_name(s) FROM table1
UNION ALL
SELECT column_name(s) FROM table2;
```

This is used for equivalent tables (same columns) but with diferent records.

**GROUP BY:**

The GROUP BY statement group rows that have the same values into summary rows, like "find the number of customers in each country".

The GROUP BY statement is often used with aggregate functions (COUNT, MAX, MIN, SUM, AVG) to group the result-set by one or more columns.
```
SELECT column_name(s)
FROM table_name
WHERE condition
GROUP BY column_name(s)
ORDER BY column_name(s);
```

The following SQL statement lists the number of cities in each country, sorted high to low:
```
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;
ORDER BY COUNT(CustomerID) DESC;
```

**HAVING:**

The HAVING clause was added to SQL because the WHERE keyword could not be used with aggregate functions:
```
SELECT column_name(s)
FROM table_name
WHERE condition
GROUP BY column_name(s)
HAVING condition
ORDER BY column_name(s);
```

The following SQL statement lists the number of cities in each country. Only include countries with more than 200 cities:
```
SELECT COUNT(ID), CountryCode
FROM city
GROUP BY CountryCode
HAVING COUNT(CustomerID) > 200
ORDER BY COUNT(ID) DESC;
```

**EXISTS:**

The EXISTS operator is used to test for the existence of any record in a subquery. The EXISTS operator returns true if the subquery returns one or more records:
```
SELECT column_name(s)
FROM table_name
WHERE EXISTS
(SELECT column_name FROM table_name WHERE condition);
```

**ANY and ALL:**

The ANY and ALL operators are used with a WHERE or HAVING clause.

* The ANY operator returns true if any of the subquery values meet the condition.

* The ALL operator returns true if all of the subquery values meet the condition.

ANY Syntax:
```
SELECT column_name(s)
FROM table_name
WHERE column_name operator ANY
(SELECT column_name FROM table_name WHERE condition);
```

ALL Syntax:
```
SELECT column_name(s)
FROM table_name
WHERE column_name operator ALL
(SELECT column_name FROM table_name WHERE condition);
```

**SELECT INTO:**

The SELECT INTO statement copies data from one table into a new table:
```
SELECT column1, column2, column3, ...
INTO newtable [IN externaldb]
FROM oldtable
WHERE condition;
```

Good for creating backup tables.

**INSERT INTO SELECT:**

The INSERT INTO SELECT statement copies data from one table and inserts it into another table.

* INSERT INTO SELECT requires that data types in source and target tables match
* The existing records in the target table are unaffected

```
INSERT INTO table2
SELECT * FROM table1
WHERE condition;
```

**CASE:**

The CASE statement goes through conditions and returns a value when the first condition is met (like an IF-THEN-ELSE statement). So, once a condition is true, it will stop reading and return the result. If no conditions are true, it returns the value in the ELSE clause:
```
SELECT Name, CountryCode, Population,
CASE
    WHEN Population > 1000000 THEN "The population is greater than a million"
    WHEN Quantity < 100000 THEN "The population is lesser than 100k"
    ELSE "The population is between 10k and 1M"
END AS PopulationText
FROM city;
```

If there is no ELSE part and no conditions are true, it returns NULL.

**IFNULL():**

The MySQL IFNULL() function lets you return an alternative value if an expression is NULL:
```
SELECT ProductName, UnitPrice * (UnitsInStock + IFNULL(UnitsOnOrder, 0))
FROM Products;
```

The syntax change for other database types (Oracle and so on...).

**Stored Procedures (MySQL):**

A stored procedure is a prepared SQL code that you can save, so the code can be reused over and over again.

So if you have an SQL query that you write over and over again, save it as a stored procedure, and then just call it to execute it.

You can also pass parameters to a stored procedure, so that the stored procedure can act based on the parameter value(s) that is passed.

Stored Procedure Syntax (Passing 1 parameter):
```
DELIMITER //

CREATE PROCEDURE procedure_name(parameter_1 INT)
BEGIN
  ...SQL code goes here...
END //

DELIMITER ;
```

Execute a Stored Procedure:
```
CALL procedure_name(1);
```

**SQL Comments:**

Comments are used to explain sections of SQL statements, or to prevent execution of SQL statements.

Single Line Comments:
```
--Select all:
SELECT * FROM Customers;
```

Multi-line Comments:
```
/*Select all the columns
of all the records
in the Customers table:*/
SELECT * FROM Customers;
```

**USEFULL LINKS**

**History:**

https://en.wikipedia.org/wiki/SQL


**SQL tutorial:**

https://www.w3schools.com/sql/default.asp

**MySQL DELIMITER:**

https://www.quackit.com/mysql/tutorial/mysql_stored_procedures.cfm