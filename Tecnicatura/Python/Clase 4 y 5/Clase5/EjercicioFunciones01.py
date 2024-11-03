# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parámetro de la
# función y agregar como resultado la suma de todos los valores pasados
# como argumentos.

# Definimos la función sumar_valores que acepta un número variable de argumentos
def sumar_valores(*args):
    # Inicializamos una variable para almacenar la suma
    suma_total = 0
    # Iteramos sobre cada argumento recibido
    for valor in args:
        # Sumamos el valor actual a la suma total
        suma_total += valor
    # Devolvemos el resultado de la suma
    return suma_total

# Llamamos a la función con diferentes cantidades de argumentos
print(f"La suma de 5, 3, 2 es: {sumar_valores(5, 3, 2)}")
print(f"La suma de 10, 20, 30, 40 es: {sumar_valores(10, 20, 30, 40)}")
print(f"La suma de 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 es: {sumar_valores(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)}")
