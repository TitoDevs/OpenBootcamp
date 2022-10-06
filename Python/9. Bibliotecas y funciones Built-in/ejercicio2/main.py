from functools import reduce


def listaimpares(x):
    if x % 2 == 0:
        return False

    return True


def suma(a, b):
    return a + b


def main():
    lista = filter(listaimpares, [1, 2, 3, 4, 5, 6, 7, 8, 9])

    res = reduce(suma, lista)
    print(f"La suma es {res}")


if __name__ == "__main__":
    main()
