# Clases y objetos:

###  Encunciado del ejercicio:
En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:
- Color
- Ruedas
-Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

- Velocidad
- Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

### Solución:
```kotlin
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
```
