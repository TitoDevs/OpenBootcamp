class Juguete:
    nombre = ""
    precio = 0.0

    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"Ni nombre es {self.nombre} y mi precio {self.precio}"

    def __repr__(self):
        return f"Potato ({self.nombre}, {self.precio})"

    def getNombre(self):
        return self.nombre


j1 = Juguete("Potato", 10.5)
print(str(j1))

demo = j1
print(type(demo))
print(demo)
print(repr(j1))

j2 = Juguete("Dino", 3.4)
print(j2)

import pprint

pprint.pprint(dir(''))

cadena = "en un lugar de la manchA"
print(cadena.capitalize())
print(cadena.title())
print(cadena.count('a'))
print(cadena.lower().count('a'))

numero = "5"
print(numero.isdigit())

cadena1 = "      en un lugar de la mancha         "
print(cadena1)
print(cadena1.lstrip())
print(cadena1.rstrip())

j3 = Juguete("Potato", 10.5)
print(j3.getNombre())

import pickle

f = open('datos.bin', 'wb')
pickle.dump(j3, f)
f.close()

f = open('datos.bin', 'rb')
potato = pickle.load(f)
f.close()

print(type(potato))
print(potato.getNombre(), "precio: ", potato.precio)

class Estado:
    players = Players()
    status = Status()
    life_remaining = 12
    armor = False


f = open('gamestatus.dat', 'wb')
e = pickle.load(f)
f.close()