from functools import reduce
from getpass import getpass

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def mifuncion(x):
    if str(x).startswith("pep"):
        return True

    return False


resultado2 = filter(mifuncion, ["pepe", "pepito", "juan"])
print(list(resultado2))


def cuadrado(x):
    return x * x


resultado = map(cuadrado, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
print(list(resultado))


def suma(a, b):
    print(f'a={a}, b={b}')
    return a + b


res = reduce(suma, [1, 2, 3, 4, 5])
print(res)

cursos = ['Java', 'Python', 'Git']
asistentes = [15, 20, 4]
demo = zip(cursos, asistentes)
print(list(demo))

listaA = [1 == 1, 2 == 2, 3 == 4]
res = any(listaA)
print(res)

res1 = all(listaA)
print(res1)

a = 5.5
b = 5.4
c = 5.6

print(round(a))
print(round(b))
print(round(c))

print(min(2, 3, 4, 5, 6, 1))
print(pow(2, 4))
print(2**4)

lista = ['z', 'c', 'd', 'a']
ordenada = sorted(lista, reverse=True, key=lambda x: str(x).startswith('a'))
print(ordenada)

# user = input("username: ")
# passwd = getpass("password: ")

# print(user, passwd)


secreto = 50

valor = 0
while valor != secreto:
    valor = int(input("Introduce un numero: "))

    if valor > secreto:
        print("Muy alto")
        continue


    if valor < secreto:
        print("Muy bajo")
        continue

print("Acertaste!")
