# Ejercicio 2: OPeraciones de conjuntos de listas
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las qeu no deben haber repeticiónes)
# 1 Lista de palabras que aparecen en las lista
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista depalabras que aparecen en ambas listas
from Clase3.Listas import conjunto2

lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 2, 1, 5]
lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]
# Eliminar los elementos repetidos de ambas lista con conjutos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) # Unimos los dos conjuntos
solo1 = list(conjunto1 - conjunto2) # Solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) # Solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) # Mostramos ambas listas
print(f"Lista de palabras que aparecen en las listas: {union}")
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda: {solo1}")
print(f"lista de palabras que aparecen en la segunda lista, pero no en la primera: { solo2}")
print(f"lista depalabras que aparecen en ambas listas: {interseccion}")