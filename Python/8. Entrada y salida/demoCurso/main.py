numero = 511
texto = "quijote"
otromas = 1.2

# print("El numero de %d y el texto de %s y tiene %d" % (numero, texto, otromas))
print("El numero de {1} y el texto de {0} y tiene {2}"
      .format(numero, texto, otromas))

print("El numero de {n1} y el texto de {texto} y tiene {otromas}"
      .format(n1=numero, texto=texto, otromas=otromas))

print("Valor flotante %.1f" % otromas)


def suma(a, b):
    return a + b


print(f'El número es {suma(numero, numero)} y el texto es {texto.upper()} y tiene {otromas}')

txt = f'El número es {suma(numero, numero)} y el texto es {texto.upper()} y tiene {otromas}'
print(txt)

num = 511
print(type(num))

numtxt = str(num)
print(type(numtxt))

print(repr(num))
print(numtxt)
