import operaciones as o


def main():
    res = o.suma(1, 3)
    resResta = o.resta(3, 4)

    print("Hola en main()", res)
    print("Como me llamo", o.como_me_llamo())


if __name__ == '__main__':
    main()
