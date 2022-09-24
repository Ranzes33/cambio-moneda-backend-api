# cambio-moneda-backend-api
App de prueba tecnica para la empresa CRD

## Siga las siguientes instrucciones:
### 1. Para cambiar de soles a dolares:
  a. consuma el endpoint:  http://localhost:8080/api/v1/currency/dolares
     de preferencia en postman o desde algun frontend que recepcione API.
  b. Agregue un cuerpo válido en JSON, for example: { "currency": "USD", "amount": 1.00 }
     donde currency es el tipo de cambio y amount la cantidad.
  c. Le llegará un responseEntity con la moneda cambiada.
### 2. Para cambiar de dolares a soles:
  a. consuma el endpoint:  http://localhost:8080/api/v1/currency/soles
     de preferencia en postman o desde algun frontend que recepcione API.
  b. Agregue un cuerpo válido en JSON, for example: { "currency": "PEN", "amount": 1.00 }
     donde currency es el tipo de cambio y amount la cantidad.
  c. Le llegará un responseEntity con la moneda cambiada.
