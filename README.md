# cambio-moneda-backend-api
App de prueba tecnica para la empresa CRD

## Siga las siguientes instrucciones:
### 1. Para cambiar de moneda: <br/>
  a. consuma el endpoint:  http://localhost:8080/api/v1/currency 
     y elija el tipo de metodo : POST, 
     de preferencia en postman o desde algun frontend que consuma API. <br/>
  b. Agregue un cuerpo válido en JSON, for example: { "currency": "USD", "amount": 1.00 }
     donde currency es el tipo de cambio y amount la cantidad. <br/>
  c. Le llegará un responseEntity con la moneda cambiada. <br/>
  d. Por ahora solo tenemos implementado tipo de cambio para dolares y soles. Use solo (USD or PEN) respectivamente.
