# Dada una tupla de números
numeros = (13, 1, 8, 3, 2, 5, 8)  # Tupla inicial con varios valores

# Creamos una lista vacía para almacenar los valores que cumplan con la condición
numeros_filtrados = []

# Recorremos cada elemento en la tupla
for num in numeros:
    # Si el número es menor que 5, lo añadimos a la nueva lista
    if num < 5:
        numeros_filtrados.append(num)

# Imprimimos la lista con los números que cumplen la condición
print(numeros_filtrados)  # Debería mostrar [1, 3, 2]
