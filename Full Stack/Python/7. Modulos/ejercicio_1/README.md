# Modulos:

###  Encunciado del ejercicio:
En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.
Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas. Los resultados tenéis que mostrarlos por consola.

### Solución:
```kotlin
import operaciones
from operaciones import sumar, restar, multiplicar, dividir

def main():
    s = operaciones.sumar.sumar(2, 3)
    print(s)
    r = operaciones.restar.restar(5, 3)
    print(r)
    m = operaciones.multiplicar.multiplicar(5, 6)
    print(m)
    d = operaciones.dividir.dividir(10, 5)
    print(d)

if __name__ == '__main__':
    main()
```
