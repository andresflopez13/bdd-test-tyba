# language: es

Característica: Calcular la cuota mensual para el prestamo de una vivienda
  Como usuario de metro cuadrado, quiero conocer el valor de la cuota mensual para decidir si accedo a un credito de determinado valor

  Esquema del escenario: Calcular el valor de las cuotas segun el monto del prestamo y el tiempo del credito
    Dado que Andres ingresa al portal web de metro cuadrado
    Y se dirige a la calculadora de cuotas para conocer el valor del canon mensual
    Cuando ingresa el valor del credito que desea <monto> y el plazo <plazo> en años
    Entonces verifica que debe tener ingresos de <ingresos> con una inicial de <inicial>

    Ejemplos:
      | monto     | plazo | inicial  | ingresos |
      | 100000000 | 20    | 42857143 | 3172215  |  