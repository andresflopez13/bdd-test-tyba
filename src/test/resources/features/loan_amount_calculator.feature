# language: es

Característica: Calcular el crédito para vivienda
  Como usuario de metro cuadrado, quiero conocer cuánto dinero me prestan para adquirir una vivienda a través de los
  simuladores de la página web

  Esquema del escenario: Calcular el monto máximo que puede prestar según los ingresos y el tiempo del crédito
    Dado que Andres ingresa al portal web de metro cuadrado
    Y se dirige a la calculadora de crédito para saber cuanto le prestan
    Cuando ingresa el valor de su salario <salario> mensual y el plazo <plazo> en años
    Entonces verifica que debe tener una inicial de <inicial> para poder prestar al banco <monto> con un salario de <salario>

    Ejemplos:
      | salario | plazo | inicial  | monto     |
      | 908527  | 20    | 12274349 | 28640148  |
      | 6000000 | 10    | 58872544 | 137369269 |