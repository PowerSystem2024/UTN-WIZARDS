# Ejercicio 2: Funcion con *args para multiplicar 
# Crear una funcion para multiplicar los valores recibidos
# de tipo numerico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos

# Definimos la función multiplicar_valores que acepta un número variable de argumentos
def multiplicar_valores(*args):
    # Inicializamos el resultado con 1 (elemento neutro de la multiplicación)
    resultado = 1
    # Iteramos sobre cada argumento recibido
    for valor in args:
        # Multiplicamos el valor actual por el resultado acumulado
        resultado *= valor
    # Devolvemos el resultado final
    return resultado

# Probamos la función con diferentes conjuntos de números
print(f"El resultado de multiplicar 3, 4, 5 es: {multiplicar_valores(3, 4, 5)}")
print(f"El resultado de multiplicar 2, 2, 2, 2 es: {multiplicar_valores(2, 2, 2, 2)}")
print(f"El resultado de multiplicar 1, 2, 3, 4, 5 es: {multiplicar_valores(1, 2, 3, 4, 5)}")