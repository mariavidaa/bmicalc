![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

Firstly test for the bmi method are defined. Considering the result of the function bmi it is developed the following tests:

1.	For different inputs (mass and height) the result from the function should be equal 
	to the actual bmi and should not be for incorrect bmi (we try this adding 1 to the correct solution).

2.	For different inputs the result from the function cannot be 0. i test this checking that bmi is not equal to 0.

3.	For different inputs the result from the function cannot be negative. I test that checking that bmi/bmi
	is not equal to -1. 

Secondly test for category function. In this case, parameterized test are used for each category.
With this type of test we write less code as it allows us to associate itself with parameters and pass them through a variable.

4.	For a standard valor, such as 10, and the limits 18.4, the test check that the function return underweight.

5	For a standard valor, such as 20, and the limits 18.5 and 24.9, the test check that the function return normal. 

6.	For a standard valor, such as 28, and the limit 25.0 and 29.9, the test check that the function return overweight.

7.	For a standard valor, such as 60, and the limit 30, the test check that the function return obese. 
  

