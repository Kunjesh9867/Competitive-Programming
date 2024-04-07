# Revising the Select Query I

`Query all columns for all American cities in CITY with populations larger than 100,000. The CountryCode for America is USA.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT * FROM CITY 
WHERE POPULATION > 100000 AND COUNTRYCODE = 'USA';
```
<br>

# Revising the Select Query II

`Query the names of all American cities in CITY with populations larger than 120,000. The CountryCode for America is USA.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT NAME FROM CITY
WHERE POPULATION > 120000 AND CountryCode = 'USA';
```
<br>

# Select All

`Query all columns (attributes) for every row in the CITY table.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT * FROM CITY;
```
<br>

# Select By ID

`Query all columns for a city in CITY with the ID 1661.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT * FROM CITY
WHERE ID = 1661;
```
<br>

# Japanese Cities' Attributes

`Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT * FROM CITY
WHERE COUNTRYCODE = 'JPN';
```
<br>

# Japanese Cities' Names

`Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.`

The CITY table is described as follows:
| Field       | Type         |
|:--          |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT NAME FROM CITY
WHERE COUNTRYCODE = 'JPN';
```
<br>

# Weather Observation Station 1

`Query a list of CITY and STATE from the STATION table.`


The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT CITY,STATE FROM STATION;
```
<br>

# Weather Observation Station 3

`Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.`


The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT(CITY) FROM STATION
WHERE ID%2=0;
```
<br>

# Weather Observation Station 4

`Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT COUNT(CITY) - COUNT(DISTINCT(CITY)) FROM STATION;
```
<br>

# Weather Observation Station 5

`Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.`


The STATION table is described as follows:

| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

Note:
You can write two separate queries to get the desired output. It need not be a single query.

```
SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY) ASC, CITY 
LIMIT 1;

SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY
LIMIT 1;
```
<br>

# Weather Observation Station 6

`Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY LIKE 'A%' OR
CITY LIKE 'E%' OR
CITY LIKE 'I%' OR
CITY LIKE 'O%' OR
CITY LIKE 'U%';
```

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^a|^e|^i|^o|^u';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,1,1) IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
LEFT(CITY,1) IN ('A','E','I','O','U');
```
<br>

# Weather Observation Station 7

`Query the list of CITY names ending with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY LIKE '%A' OR
CITY LIKE '%E' OR
CITY LIKE '%I' OR
CITY LIKE '%O' OR
CITY LIKE '%U';
```

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP 'a$|e$|i$|o$|u$';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,LENGTH(CITY),1) IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
RIGHT(CITY,1) IN ('A','E','I','O','U');
```
<br>

# Weather Observation Station 8

`Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[AEIOU].*[AEIOU]$';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,1,1) IN ('A','E','I','O','U')
AND
SUBSTRING(CITY,LENGTH(CITY),1) IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
LEFT(CITY,1) IN ('A','E','I','O','U')
AND
RIGHT(CITY,1) IN ('A','E','I','O','U');
```
<br>

# Weather Observation Station 9

`Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY NOT LIKE 'A%' AND
CITY NOT LIKE 'E%' AND
CITY NOT LIKE 'I%' AND
CITY NOT LIKE 'O%' AND
CITY NOT LIKE 'U%';
```

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY NOT REGEXP '^a|^e|^i|^o|^u';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,1,1) NOT IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
LEFT(CITY,1) NOT IN ('A','E','I','O','U');
```
<br>

# Weather Observation Station 10

`Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY NOT LIKE '%A' AND
CITY NOT LIKE '%E' AND
CITY NOT LIKE '%I' AND
CITY NOT LIKE '%O' AND
CITY NOT LIKE '%U';
```

```
SELECT DISTINCT CITY FROM STATION
WHERE CITY NOT REGEXP 'a$|e$|i$|o$|u$';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,LENGTH(CITY),1) NOT IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
RIGHT(CITY,1) NOT IN ('A','E','I','O','U');
```
<br>

# Weather Observation Station 11

`Query the list of CITY names from STATION that neither start with vowels nor do not end with vowels. Your result cannot contain duplicates.`

The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY
FROM STATION
WHERE (CITY NOT LIKE 'A%' AND CITY NOT LIKE 'E%' AND CITY NOT LIKE 'I%' AND CITY NOT LIKE 'O%' AND CITY NOT LIKE 'U%')
   OR (CITY NOT LIKE '%A' AND CITY NOT LIKE '%E' AND CITY NOT LIKE '%I' AND CITY NOT LIKE '%O' AND CITY NOT LIKE '%U');
```

```
SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '^[AEIOU].*[AEIOU]$';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,1,1) NOT IN ('A','E','I','O','U')
OR
SUBSTRING(CITY,LENGTH(CITY),1) NOT IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
LEFT(CITY,1) NOT IN ('A','E','I','O','U')
OR
RIGHT(CITY,1) NOT IN ('A','E','I','O','U');
```
<br>


# Weather Observation Station 12

`Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.`


The STATION table is described as follows:
| Field       |   Type     |
| :--         |:--         |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

where LAT_N is the northern latitude and LONG_W is the western longitude.

```
SELECT DISTINCT CITY
FROM STATION
WHERE (CITY NOT LIKE 'A%' AND CITY NOT LIKE 'E%' AND CITY NOT LIKE 'I%' AND CITY NOT LIKE 'O%' AND CITY NOT LIKE 'U%')
   AND (CITY NOT LIKE '%A' AND CITY NOT LIKE '%E' AND CITY NOT LIKE '%I' AND CITY NOT LIKE '%O' AND CITY NOT LIKE '%U');
```

```
SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '^[AEIOU]'
AND CITY NOT REGEXP '[AEIOU]$';
```

```
SELECT DISTINCT CITY FROM STATION WHERE
SUBSTRING(CITY,1,1) NOT IN ('A','E','I','O','U')
AND
SUBSTRING(CITY,LENGTH(CITY),1) NOT IN ('A','E','I','O','U');
```

```
SELECT DISTINCT CITY FROM STATION WHERE
LEFT(CITY,1) NOT IN ('A','E','I','O','U')
AND
RIGHT(CITY,1) NOT IN ('A','E','I','O','U');
```
<br>


# Higher Than 75 Marks

`Query the Name of any student in STUDENTS who scored higher than 75 Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.`

The STUDENTS table is described as follows:
| Column     |     Type    |
| :--        | :--         |
| ID         | INTEGER     |
| Name       | STRING      |
| Marks      | INTEGER     |

The Name column only contains uppercase (A-Z) and lowercase (a-z) letters.


```
SELECT NAME FROM STUDENTS
WHERE MARKS > 75
ORDER BY RIGHT(NAME,3), ID;
```
<br>


# Employee Names
`Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.`

The Employee table containing employee data for a company is described as follows:

| Column      |   Type     |
| :--         | :--        |
| employee_id | INTEGER    |
| name        | STRING     |
| months      | INTEGER    |
| salary      | INTEGER    |

where employee_id is an employee's ID number, name is their name, months is the total number of months they've been working for the company, and salary is their monthly salary.


```
SELECT NAME FROM EMPLOYEE
ORDER BY NAME;
```
<br>

# Employee Salaries 
`Write a query that prints a list of employee names (i.e.: the name attribute) for employees in Employee having a salary greater than 2000 per month who have been employees for less than 10 months. Sort your result by ascending employee_id.`

The Employee table containing employee data for a company is described as follows:

| Column      |   Type     |
| :--         | :--        |
| employee_id | INTEGER    |
| name        | STRING     |
| months      | INTEGER    |
| salary      | INTEGER    |

where employee_id is an employee's ID number, name is their name, months is the total number of months they've been working for the company, and salary is their monthly salary.

```
SELECT NAME FROM EMPLOYEE
WHERE SALARY > 2000 AND MONTHS < 10
ORDER BY EMPLOYEE_ID;
```
<br>
