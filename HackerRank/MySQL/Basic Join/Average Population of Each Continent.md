# Question

**Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.**

**Note: CITY.CountryCode and COUNTRY.Code are matching key columns.**

*The CITY and COUNTRY tables are described as follows:*

### CITY
| Field       | Type         |
|-------------|--------------|
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |  
  
<br>

### COUNTRY
| Field           | Type         |
|-----------------|--------------|
| CODE            | VARCHAR2(3)  |
| NAME            | VARCHAR2(44) |
| CONTINENT       | VARCHAR2(13) |
| REGION          | VARCHAR2(25) |
| SURFACEAREA     | NUMBER       |
| INDEPYEAR       | VARCHAR2(5)  |
| POPULATION      | NUMBER       |
| LIFEEXPECTANCY  | VARCHAR2(4)  |
| GNP             | NUMBER       |
| GNPOLD          | VARCHAR2(9)  |
| LOCALNAME       | VARCHAR2(44) |
| GOVERNMENTFORM  | VARCHAR2(44) |
| HEADOFSTATE     | VARCHAR2(32) |
| CAPITAL         | VARCHAR2(4)  |
| CODE2           | VARCHAR2(2)  |

# Answer

    SELECT COUNTRY.Continent, FLOOR(AVG(CITY.Population))
    FROM COUNTRY
    LEFT JOIN CITY
    ON CITY.CountryCode = COUNTRY.Code
    WHERE CITY.Population IS NOT NULL
    GROUP BY COuntry.continent;