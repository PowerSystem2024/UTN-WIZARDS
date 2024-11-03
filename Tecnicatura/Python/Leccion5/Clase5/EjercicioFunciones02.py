#CLASE 5
# Ejercicio 2: Funcion con *args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo numérico, utilizango argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicacion de todos los valores pasados como argumentos.

#DEfinimos la funcion para multiplicar
def multiplicar_valores(*numeros): # El mas utilizado es *args
    resultado = 1 # El cero no nos ayuda a multiplicar
    for numero in numeros:
        resultado *= numero
    return resultado

# Llamamos la función
print(multiplicar_valores(3, 5, 15, 3)) # Le psamos los argumentos