class Motor:
    tipo = "Diesel"


class Ventanas:
    cantidad = 5

    def cambiarCantidad(self, valor):
        self.cantidad = valor


class Ruedas:
    cantidad = 4


class Carroceria:
    ventanas = Ventanas()
    ruedas = Ruedas()


class Coche:
    motor = Motor()
    carroceria = Carroceria()


c = Coche()
print("Motor es", c.motor.tipo)
print("Ventanas: ", c.carroceria.ventanas)

c.carroceria.ventanas.cambiarCantidad(3)
print("Ventanas:", c.carroceria.ventanas.cantidad)
