# Ejercicio 3: Funcion Recursiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5 debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el numero 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan numeros negativos no imprime nada

# Definimos la función recursiva imprimir_numeros_descendentes
def imprimir_numeros_descendentes(numero):
    # Caso base: si el número es menor o igual a 0, no hacemos nada
    if numero <= 0:
        return
    # Imprimimos el número actual
    print(numero)
    # Llamamos recursivamente a la función con el número decrementado
    imprimir_numeros_descendentes(numero - 1)

# Probamos la función con diferentes valores
print("Imprimiendo números del 5 al 1:")
imprimir_numeros_descendentes(5)

print("\nImprimiendo números del 3 al 1:")
imprimir_numeros_descendentes(3)

print("\nProbando con un número negativo:")
imprimir_numeros_descendentes(-2)