import _thread
import time


def horaActual(nombre_thread, tiempo_de_espera):
    count = 0

    while count < 5:
        time.sleep(tiempo_de_espera)
        count += 1
        print(f"hilo: {nombre_thread} - {time.ctime(time.time())}")


_thread.start_new_thread(horaActual, ("thread_uno", 1))
_thread.start_new_thread(horaActual, ("thread_dos", 2))

print("He disparado ya los hilos")

while True:
    pass
