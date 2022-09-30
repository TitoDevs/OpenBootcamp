contador = 0

while contador <= 10:
    if contador % 2 == 0:
        print("Contador valor", contador)
    if contador == 6:
        break
    if contador == 2:
        continue
    contador += 1
print("Fin del bucle")
