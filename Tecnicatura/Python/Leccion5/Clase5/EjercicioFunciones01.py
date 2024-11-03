#CLASE 5
# Ejercicio 01: Crear una funcion para suamr los valores recibidos de tipo
# numericos, utilizando argumentos variables *args como parametro
# de la Funcion y agregar como resultado la suma de todos los valores
# como argumentos.

# Definimos una función
def sumar_valor(*args):  #REcibimos una cantidad de aprametros indefinidos
    resultado = 0
    # Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado


# Llamamos a la función
print(sumar_valor(3, 5, 9,2, 1))
