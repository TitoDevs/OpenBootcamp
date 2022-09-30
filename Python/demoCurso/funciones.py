def mifuncion():
    print("Nombre")
    print("Mas lineas")

    for i in range(1, 6):
        print(i)


print("Antes")
mifuncion()
print("Despues")


def otrafuncion(nombre):
    print("Hola", nombre)


otrafuncion("Tito")


def matematicas(a, b):
    def suma(a, b):
        print(a + b)

    def resta(a, b):
        print(a - b)

    suma(a, b)
    resta(a, b)


matematicas(1, 2)


def suma(a, b):
    print(a + b)


suma(1, 2)


def funcionnombre(nombre="Juan"):
    print("Hola", nombre)


funcionnombre("Tito")


def suma(a, b, c=4):
    print(a + b + c)


suma(3, 4)
suma(b=4, c=3, a=1)


def suma(*args):
    print(args)


suma(2, 3, 4, 5, 3, 3)


def suma(**kwargs):
    for key, value in kwargs.items():
        print(key, value)


def suma1(**kwargs):
    if 'coche' in kwargs and kwargs['coche'] == 'bonito':
        print("Tu coche es bonito")


suma(vivienda="piso", coche="rojo")


def suma2(a, b):
    return a + b


resultado = suma2(2, 4)

print(resultado)


def operaciones(a, b):
    return a + b, a - b, a * b, a / b


suma, resta, multi = operaciones(4, 5)
res = operaciones(5, 6)

print(suma)
print(resta)
print(multi)

print(res[0])


def sumador(**kwargs):
    inicial = kwargs['inicio'] if 'inicio' in kwargs else 0
    final = kwargs['final'] if 'final' in kwargs else inicial

    resultado = 0
    for x in range(inicial, final + 1):
        resultado += x

    return resultado


print(sumador(final=15))

# funcion anonima
anonima = lambda nombre, nombre2: print("hola", nombre, "adios", nombre2)
anonima("pepe", "juan")


def sumatoria(x):
    return x + x


sumatoria = lambda x: x + x
print(sumatoria(2))
