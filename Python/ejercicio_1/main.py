import operaciones
from operaciones import sumar, restar, multiplicar, dividir


def main():
    s = operaciones.sumar.sumar(2, 3)
    print(s)
    r = operaciones.restar.restar(5, 3)
    print(r)
    m = operaciones.multiplicar.multiplicar(5, 6)
    print(m)
    d = operaciones.dividir.dividir(10, 5)
    print(d)


if __name__ == '__main__':
    main()
