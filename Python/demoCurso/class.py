class Dino:
    _encendido = True

    def enciende(self):
        self._encendido = True

    def apaga(self):
        self._encendido = False

    def isEncendido(self):
        return self._encendido


d = Dino()
d.apaga()
print(d.isEncendido())

d1 = Dino()
d1.enciende()
print(d1.isEncendido())


# Clase estática
class Estatica:
    numero = 1

    def incrementa():
        Estatica.numero += 1


Estatica.incrementa()
print(Estatica.numero)


class Opciones:
    ServidorSeguro = True
    Reiniciar = False


if (Opciones.ServidorSeguro):
    print(Opciones.ServidorSeguro)

d2 = Estatica()


class Juguete:
    _encendido = True

    def __init__(self):
        print("Estoy en el constructor de juguete")

    def enciende(self):
        self._encendido = True

    def apaga(self):
        self._encendido = False

    def isEncendido(self):
        return self._encendido

    def quitarOreja(self):
        pass

    def ponerOreja(self):
        pass


# Herencia

class Robot(Juguete):

    def __init__(self):
        Juguete.__init__(self)
        # super().__init__(nombre)

    def verEscamas(self):
        pass


p = Robot()
p.enciende()
print(p.isEncendido())
print(dir(p))


# Constructor

class Constructor:
    color = "Verde"

    def __init__(self, nombre):
        self.color = "Verde"
        self.nombre = nombre
        print("Estoy en el constructor", nombre)

    def __del__(self):
        print("Estoy en el destructor de la clase", self.__class__)

    def verEscamas(self):
        pass


c = Constructor("Tito")
del c

