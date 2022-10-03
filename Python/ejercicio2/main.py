class Alumnos:
    nombre = None
    nota = None

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
        if nota >= 5:
            print("Aprobado")

        else:
            print("Suspendido")


a = Alumnos("Daniel", 4)