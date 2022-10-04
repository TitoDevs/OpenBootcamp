from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def sonido(self):
        pass

    def diHola(self):
        print("Hola")


class Perro(Animal):
    def sonido(self):
        print("guau")


class Gato(Animal):
    def sonido(self):
        print("miuau")


p = Perro()
p.sonido()
p.diHola()

g = Gato()
g.sonido()
g.diHola()
