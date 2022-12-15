import sqlite3


def main():
    crear_usuario(1, "Maria", "Garcia")
    crear_usuario(2, "Juan", "Rosendo")
    crear_usuario(3, "Francisco", "Romero")
    crear_usuario(4, "Daniel", "Guardado")
    crear_usuario(5, "Carmen", "Dodero")
    crear_usuario(6, "Alejandro", "Perez")
    crear_usuario(7, "Estefania", "Jaen")
    crear_usuario(8, "Sofia", "Rodriguez")


def crear_usuario(id, username, surname):
    conn = sqlite3.connect('alumnos.db')
    cursor = conn.cursor()
    query = '''INSERT INTO alumnos(id, nombre, apellidos) VALUES(?,?,?)'''
    cursor.execute(query, (id, username, surname))

    conn.commit()
    cursor.close()
    conn.close()


if __name__ == '__main__':
    main()
