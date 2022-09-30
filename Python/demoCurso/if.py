a = 5
b = 6

if a >= 5 and b <= 6:
    print("A es mayor o igual que 5 y B es menor o igual que 6")
elif a >= 6:
    print("A es mayor o igual que 6")
else:
    print("No cumplió NADA de lo anterior")

print("Fin del IF")

lista = [1, 2, 3, 'a', 5]

if "mensaje" in lista:
    print("He encontrado la palabra mensaje")

if "mensaje" not in lista:
    print("No hay palabra mensaje")

lista = [2, 5, 3, 6]
print(lista)

listaOrdenada = sorted(lista, reverse=True)
print(listaOrdenada)