#language:es
@casopruebaaa
Característica: valida el monto recibido por bluepartner
  como empleado
  quiero iniciar sesion
  para validar el monto recibido

  Escenario: Caso01-Happypath-inicio sesion correcto,monto 325 soles
    Dado  que un nuevo cliente accede al carrito de compras
   Cuando el inicia sesion con email gustavo.alvaro@bluepartner.com.pe con password 44105636
    Y el da clic en rendicion de viaje lo cual busca por destino

#    Y el da clic en boton detalle
#    Entonces el valida el monto del efectivo entregado

  Escenario: Caso02-UnHappypath-inicio sesion incorrecto,monto 325 soles

    Dado  que un nuevo cliente accede al carrito de compras
   Cuando el inicia sesion con email gustavo.alvaro@bluepartner.com.pe con password 44105636
    Y el da clic en rendicion de viaje lo cual busca por destino




#    Entonces el ve los productos listado en el carro de compras

#  @CasoConEjemplos
#  Esquema del escenario: Escenario:agregar articulos al carrito de compras
#    Dado que un nuevo cliente accede al carrito de compras
#    Cuando el agrega un producto en el carro
#      | <nombreProducto> | <cantidadAgregar> |
#    Entonces el ve los productos listado en el carro de compras
#    Ejemplos:
#      | nombreProducto | cantidadAgregar |
#      | Tapabocas KN95 | 100             |
