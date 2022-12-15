def crearfichero(fichero, datos):
    f = open(fichero, 'w')

    for linea in datos:
        if not linea.endswith('\n'):
            linea += '\n'

        f.write(linea)

    f.close()


lista = [
    'Daniel',
    'Marta',
    'Cristian'
]

crearfichero('mifichero.txt', lista)
