Type of Triangle

SELECT
    CASE
        WHEN A=B AND B=C AND A=C THEN 'Equilateral'
        WHEN (A+B <= C OR B+C <= A Or A+C <=B) THEN 'Not A Triangle'
        WHEN A=B OR B=C OR A=C THEN 'Isosceles'
        ELSE 'Scalene'
    END AS Triangle_Type
FROM TRIANGLES
;km;ll
