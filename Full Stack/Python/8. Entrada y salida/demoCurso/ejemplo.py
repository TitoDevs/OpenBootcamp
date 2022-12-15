def main():
    usuarios = listarUsuarios()
    print(usuarios)
    for usuario in usuarios:
        print(f'Usuario: {usuario}')


def listarUsuarios():
    f = open('/etec/passwd', 'r')
    datos = f.readlines()
    f.close()

    resultado = []

    for linea in datos:
        if linea[0] == '#':
            continue

        if linea[0] == '_':
            continue

        partes = linea.split(':')
        print(linea)
        print(partes)
        print(partes[0])
        resultado.append(partes[0])


    return resultado


if __name__ == '__main__':
    main()
