# > Mayor
# >= Mayor o igual
# == Exactamente igual
# <= Menor o igual
# < Menor

a = 5
b = 6
c = 7

resultado = (a > 5 and c < 7)
# resultado = (False and c < 7)
# resultado = (False and False)
# resultado = (False)
print(resultado)

# TABLAS DE LA VERDAD
# AND -> True, False
print("1 y 1", True and True)
print("1 y 0", True and False)
print("0 y 1", False and True)
print("0 y 0", False and False)

print()

# OR -> True, False
print("1 y 1", True or True)
print("1 y 0", True or False)
print("0 y 1", False or True)
print("0 y 0", False or False)

print()

# XOR -> True, False
print("1 y 1", True ^ True)
print("1 y 0", True ^ False)
print("0 y 1", False ^ True)
print("0 y 0", False ^ False)

d = 5
e = 6
f = 7

resultado = (d >= 5 or f > 7)
resultado = (True or False)
resultado = (True)

resultado = ((d >= 5 or f > 7) and (e == 5))
resultado = ((True or False) and (False))
resultado = (True and False)
resultado = (False)

# a > b
# (a > b) and (c >= b) and (a > c) or (b >= c)
# (False) and (True) and (False or False)
# False and True and False
# False and False
# False