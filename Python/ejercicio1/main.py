class Vehiculo:
    color = "Verde"
    ruedas = 4
    puertas = 5


class Coche(Vehiculo):
    velocidad = 100
    cilindrada = 120


c = Coche()
print("Color: ", c.color)
print("Rueda: ", c.ruedas)
print("Puertas: ", c.puertas)
print("Velocidad: ", c.velocidad)
print("Cilindrada: ", c.cilindrada)