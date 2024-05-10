[# PRATICA-4-TECPROG](https://github.com/mromamui/PRATICA-4-TECPROG.git)

Pracatica 4 

Este codigo consiste de varias clases que simulan el "problema de parar" de Alan Turin 

El codigo se divide en varias clases distintas

- La clase Main es la clase principal que se ejecuta al iniciar el programa, se encarga de procesar los argumentos de entrada y ejecutar el programa correspondiente.

- La clase Countdown es una subclase de Program que implementa un conteo regresivo. Cuando se ejecuta, cuenta hacia atrás desde un número de entrada hasta cero.

- La clase Countup es una subclase de Program que implementa un conteo ascendente. Cuando se ejecuta, cuenta hacia arriba desde un número de entrada indefinidamente.

- La clase HaltChecker es una clase toma como entradas el código de un programa y una entrada específica para ese programa y que verifica si el programa dado se detendrá o no. Devuelve true si el programa se detendrá, false en caso contrario.

- La clase Reverser es una clase que verifica si un programa dado se detendrá o no. Si el programa se detendrá, entra en un bucle infinito. Si no, termina inmediatamente.

- La clase Program es una clase abstracta que representa un programa genérico. Define una estructura para las clases que implementan programas específicos.

- La clase TestCodigo es una clase de prueba que verifica la funcionalidad de las otras clases. Contiene varios métodos de prueba que se ejecutan para comprobar el comportamiento esperado de las clases.

