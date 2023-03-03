#language: es

Característica: Reservar hospedaje

  Esquema del escenario: Reserva correcta de hospedaje

    Dado que deseo reservar alojamiento a traves del servicio de la app booking
    Y deseo ir a la cuidad de '<ciudad>'
    Y deseo viajar 14 dias a partir de hoy
    Y deseo apartar 1 habitacion (es)
    Y deseo viajar con 2 adulto y 1 menor de "5" anios
    Cuando realice la busqueda del alojamiento
    Y escoja la habitacion
    Y realice la realice la reservasion
    Y realice el pago
    Entonces habre reservado el alojamiento


    Ejemplos:

      | ciudad | fecha_ida | fecha_regreso |
      | CUSCO  |           |               |

