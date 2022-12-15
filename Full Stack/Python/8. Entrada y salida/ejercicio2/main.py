import pickle


# Creamos la clase Vehiculo
class Vehiculo:
    ruedas = 4
    puertas = 5

    def __init__(self, ruedas, puertas):
        self.ruedas = ruedas
        self.puertas = puertas

    def getRuedas(self):
        return self.ruedas


# Objeto de la clase Vehiculo
v = Vehiculo(4, 5)

# Guardamos en un archivo
f = open('datos.bin', 'wb')
pickle.dump(v, f)
f.close()

# Leemos el archivo
f = open('datos.bin', 'rb')
volvo = pickle.load(f)
f.close()

# Imprimimos el ejemplo
print(volvo.getRuedas())
