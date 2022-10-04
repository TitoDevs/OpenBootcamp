# Introducción a los tipos de objetos:

###  Encunciado del ejercicio:
Escribe un programa en la consola de python que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal 
y lo almacene en una variable, e imprima por pantalla la frase. Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.

### Solución:
`kotlin`
print("Introduzca su peso")
peso = float(input())
print("Introduzca su estatura")
estatura = float(input())
resultado = round(peso / estatura, 2)
print(f"Tu indice de masa corporal es: {resultado}")
