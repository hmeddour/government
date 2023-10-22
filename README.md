# government API

## Objective

The objective of this test is to create a RESTful API that takes a postal code as input and returns the corresponding town name(s) and population. 

## Swagger

After the application has started (by default on port 8080), go to this URL to visualize all API routes with Swagger.

http://localhost:8080/swagger-ui/index.html

**GET**

To retrieve the details of a town with postal code 78000 

http://localhost:8080/v1/communes?codePostal=78000

This is an example of the result :
 ```
[
  {
    "nom": "Versailles",
    "population": 83583
  }
]
 ```