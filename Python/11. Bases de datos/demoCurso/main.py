import getpass
import sqlite3

def main():
    crear_usuario(7, "maria", "12sdf56")

def main2():
    username = input("Nombre de usuario: ")
    password = getpass.getpass("Contraseña: ")

    if verifica_credenciales(username, password):
        print("Login correcto")
    else:
        print("Login incorrecto")


def verifica_credenciales(username, password):
    conn = sqlite3.connect('miaplicacion.db')
    cursor = conn.cursor()
    query = f"SELECT id FROM users WHERE username={username} AND password={password}"
    rows = cursor.execute(query)
    data = rows.fetchone()
    cursor.close()
    conn.close()

    if data == None:
        return False

    return True


def crear_usuario(identificador,username, password):
    conn = sqlite3.connect('miaplicacion.db')
    cursor = conn.cursor()

    query = '''INSERT INTO users(id, username, password) VALUES(?,?,?)'''
    cursor.execute(query, (identificador, username, password))

    identificador += 1
    query = '''INSERT INTO users(id, username, password) VALUES(?,?,?)'''
    cursor.execute(query, (identificador, username, password))

    conn.commit()
    cursor.close()
    conn.close()


if __name__ == '__main__':
    main()
