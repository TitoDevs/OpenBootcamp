print("Introduzca su peso")
peso = float(input())
print("Introduzca su estatura")
estatura = float(input())
resultado = round(peso / estatura, 2)
print(f"Tu indice de masa corporal es: {resultado}")