anyo = 2001


def es_bisiesto(anyo):
    print("Es bisiesto" if not anyo % 4 and (anyo % 100 or not anyo % 400) else "No es bisiesto")


es_bisiesto(anyo)
