# Revising Aggregations - The Count Function

`Query all columns for all American cities in CITY with populations larger than 100,000. The CountryCode for America is USA.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT COUNT(*) FROM CITY
WHERE POPULATION > 100000;
```

<br>

# Revising Aggregations - The Sum Function

`Query the total population of all cities in CITY where the District is California.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT SUM(POPULATION) FROM CITY
WHERE DISTRICT = 'California';
```

<br>

# Revising Aggregations - Averages

`Query the average population of all cities in CITY where the District is California.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT AVG(POPULATION) FROM CITY
WHERE DISTRICT = 'California';
```

<br>

# Average Population

`Query the average population for all cities in CITY, rounded down to the nearest integer.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT ROUND(AVG(POPULATION)) FROM CITY;
```

<br>

# Japan Population

`Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT SUM(POPULATION) FROM CITY
WHERE COUNTRYCODE = 'JPN';
```

<br>

# Population Density Difference

`Query the difference between the maximum and minimum populations in CITY.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT (MAX(POPULATION) - MIN(POPULATION)) FROM CITY;
```

<br>

# The Blunder

`Query the difference between the maximum and minimum populations in CITY.`

The CITY table is described as follows:
| Field       | Type         |
| :--         |  :--         |
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

```
SELECT CEIL((AVG(SALARY) - AVG(REPLACE(SALARY, '0', '')))) FROM EMPLOYEES;
```

<br>

# Weather Observation Station 2

`Query the following two values from the STATION table: The sum of all values in LAT_N rounded to a scale of  decimal places. The sum of all values in LONG_W rounded to a scale of 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT CONCAT(ROUND(SUM(LAT_N),2), ' ', ROUND(SUM(LONG_W),2)) 
FROM STATION;
```

<br>

# Weather Observation Station 13

`Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345 . Truncate your answer to 4  decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT TRUNCATE(SUM(LAT_N),4) FROM STATION
WHERE LAT_N> 38.7880 AND LAT_N< 137.2345;
```

<br>

# Weather Observation Station 14

`Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345. Truncate your answer to 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT TRUNCATE(LAT_N,4) AS value FROM STATION
WHERE LAT_N < 137.2345
ORDER BY value DESC
LIMIT 1;
```

<br>

# Weather Observation Station 15

`Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345 . Round your answer to 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT ROUND(LONG_W, 4) AS value FROM STATION
WHERE LAT_N < 137.2345
ORDER BY LAT_N DESC
LIMIT 1;
```

<br>

# Weather Observation Station 16

`Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.7780 . Round your answer to 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT ROUND(LAT_N,4) AS answer FROM STATION
WHERE LAT_N > 38.7780
ORDER BY answer 
LIMIT 1;
```

<br>

# Weather Observation Station 17

`Query the Western Longitude (LONG_W)where the smallest Northern Latitude (LAT_N) in STATION is greater than 38.7780 . Round your answer to 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT ROUND(LONG_W,4) FROM STATION
WHERE LAT_N > 38.7780
ORDER BY LAT_N
LIMIT 1;
```

<br>

# Weather Observation Station 18

`Consider P1 and P2  to be two points on a 2D plane.` <br>
 `a happens to equal the minimum value in Northern Latitude (LAT_N in STATION).` <br>
 `b happens to equal the minimum value in Western Longitude (LONG_W in STATION).`<br>
 `c happens to equal the maximum value in Northern Latitude (LAT_N in STATION).` <br>
 `d happens to equal the maximum value in Western Longitude (LONG_W in STATION).` <br>
`Query the Manhattan Distance between points P1 and P2  and round it to a scale of  decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT
  ROUND(
      (MAX(LAT_N) - MIN(LAT_N))+(MAX(LONG_W)- MIN(LONG_W))
    ,4
  )
FROM STATION;
```

<br>

# Weather Observation Station 19

`Consider P1(a,c) and P2(c,d) to be two points on a 2D plane where (a,b) are the respective minimum and maximum values of Northern Latitude (LAT_N) and (c,d) are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION. Query the Euclidean Distance between points P1 and P2  and format your answer to display 4 decimal digits.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT 
TRUNCATE(
  SQRT(POWER((MAX(LONG_W)-MIN(LONG_W)),2) + POWER((MAX(LAT_N)-MIN(LAT_N)),2))
  ,4)
FROM STATION;
```

<br>

# Weather Observation Station 20

`A median is defined as a number separating the higher half of a data set from the lower half. Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to 4 decimal places.`

The CITY table is described as follows:

| Field       |   Type     |
| :--         |    :--     |
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |

```
SELECT ROUND(LAT_N, 4) FROM 
(
  SELECT LAT_N, ROW_NUMBER() OVER (ORDER BY LAT_N) AS row_rank 
  FROM STATION 
) AS station 
WHERE row_rank = ( SELECT CEIL(COUNT(*) / 2) FROM STATION );
```

<br>
