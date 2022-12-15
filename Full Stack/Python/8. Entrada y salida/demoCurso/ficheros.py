f = open('', 'r')
datos = f.read()
datos = f.readline()


while datos != "":
    datos = f.readline()
    print(datos)

f.close()


print(datos)
# r: lectura
# a: append
# w: escritura
# x: create

# t: texto
# b: binary

# +