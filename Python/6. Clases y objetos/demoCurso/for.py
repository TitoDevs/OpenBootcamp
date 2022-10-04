lista = [1, 2, 3, 'a', 5]

for valorActual in lista:
    print(valorActual)

for numero in range(5, 10):
    print(numero)

longitud = len(lista)
print("La lista tiene ", longitud, " items")

for numero in range(longitud):
    print(lista[numero])

lista = ["hola", "mensaje", "adios"]

for palabra in lista:
    print("Palabra actual ", palabra)
    if palabra == "mensaje":
        print("He encontrado la palabra mensaje")
        break

lista = ["hola", "mensaje", "adios"]

for palabra in lista:
    if palabra == "mensaje":
        print("He encontrado la palabra mensaje")
        continue
else:
    print("No encuentro nada")

# Tenemos una lista de palabras y vamos a buscar
# la mas cercana con el algoritmo de Naive String Search
#
# TODO: Implementar el bucle
for palabra in lista:
    pass
