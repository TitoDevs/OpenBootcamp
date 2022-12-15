def main():
    lista = input("Escriba una lista de paises: ")
    newlista = sorted(set(lista.lower().replace(" ", "").split(",")))

    res = ", ".join(newlista)
    print(res)


if __name__ == "__main__":
    main()
