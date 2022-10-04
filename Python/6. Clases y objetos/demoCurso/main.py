import pprint

import operaciones.sumador.suma as s
import operaciones.restador.resta as r

from operaciones import restador, sumador


def main():
    resta = restador.resta.resta(5, 6)
    suma = sumador.suma.suma(2, 4)


if __name__ == '__main__':
    main()

pprint.pprint(globals())
