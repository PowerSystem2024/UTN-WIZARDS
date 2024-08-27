#LISTAS
# Las listas pueden almacenar diferentes tipos de datos
mi_lista = ["saludo", 1, 4.5, True]

# Unir dos listas en una sola
otra_lista = ["despedida", False, 1]

lista_combinada = mi_lista + otra_lista

print(lista_combinada)

# Agregar un elemento individual a la lista combinada
lista_combinada.append("h")
print(lista_combinada)

# Encontrar la posición de un elemento en la lista
print(lista_combinada.index("saludo"))

# Contar cuántas veces aparece un valor en la lista
print(lista_combinada.count(1))

# Invertir el orden de los elementos en la lista
lista_combinada.reverse()
print(lista_combinada)

# Duplicar los elementos de una lista
duplicada = [1, 2, 3, 4] * 2
print(duplicada)

# Ordenar los elementos de una lista de menor a mayor
duplicada.sort()
print(duplicada)

# Ordenar los elementos de una lista de mayor a menor
duplicada.sort(reverse=True)
print(duplicada)

#USO DE LISTAS Y OPERACIONES BASICAS
# Creación de una lista con distintos tipos de datos
lista_mixta = ["hola", 1, 4.5, True]

# Concatenación de dos listas diferentes
otra_lista = ["adios", False, 1]

lista_final = lista_mixta + otra_lista

print(lista_final)

# Añadir un elemento a la lista final
lista_final.append("h")
print(lista_final)

# Obtener el índice de un elemento específico
print(lista_final.index("hola"))

# Contar cuántas veces aparece un elemento en la lista
print(lista_final.count(1))

# Revertir el orden de los elementos en la lista
lista_final.reverse()
print(lista_final)

# Multiplicar los elementos de una lista
lista_multiplicada = [1, 2, 3, 4] * 2
print(lista_multiplicada)

# Ordenar los elementos de la lista en orden ascendente
lista_multiplicada.sort()
print(lista_multiplicada)

# Ordenar los elementos de la lista en orden descendente
lista_multiplicada.sort(reverse=True)
print(lista_multiplicada)


#TUPLAS
#Recordar siempre que son inmutables y no pueden ser modificadas

mi_tupla = (4, "saludo", 6.78, [1, 5, 2], "saludo")
print(mi_tupla)

# Verificar si un elemento está presente en la tupla
print(4 in mi_tupla)

# Verificar si un elemento no está presente en la tupla
print(4 not in mi_tupla)
