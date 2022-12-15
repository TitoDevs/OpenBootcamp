# Modulos:

###  Encunciado del ejercicio:
En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa. Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.
En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, haréis una operación para calcular el tiempo que queda de trabajo.

### Solución:
```kotlin
import time

def main():
    # Horario de trabajo: 10:00 am a 19:00 pm
    date_formater = "%H:%M"
    real_time = time.localtime()
    time_to_exit = time.strptime("19:00", date_formater)

    if (real_time.tm_hour == time_to_exit.tm_hour and real_time.tm_min > time_to_exit.tm_min) \
            or (real_time.tm_hour > time_to_exit.tm_hour):
        print("Es tiempo de salir")

    else:
        if time_to_exit.tm_min > real_time.tm_min:
            print("Te quedan", time_to_exit.tm_hour - real_time.tm_hour, "horas", time_to_exit.tm_min - real_time.tm_min,
                  "minutos para salir")
        else:
            print("Te quedan", time_to_exit.tm_hour - real_time.tm_hour - 1, "horas", 60 + time_to_exit.tm_min - real_time.tm_min,
                  "minutos para salir")


if __name__ == '__main__':
    main()
```
