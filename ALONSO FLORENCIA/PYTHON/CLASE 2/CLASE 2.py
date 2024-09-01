# Ejercicios con Set, Diccionario, Lista y Tupla

# Trabajando con Sets
print("\n--- Sets ---")
planetas = {"Marte", "Jupiter", "Venus"}

# Verificar la cantidad de elementos en el set
print("Cantidad de planetas:", len(planetas))

# Revisar si un elemento existe en el set
print("Marte está en el set:", "Marte" in planetas)

# Agregar un elemento
planetas.add("Tierra")
print("Planetas después de agregar Tierra:", planetas)

# Eliminar elementos
planetas.remove("Jupiter")  # Elimina sin error si el elemento existe
print("Planetas después de eliminar Jupiter:", planetas)
planetas.discard("Tierra")  # No arroja error si el elemento no existe
print("Planetas después de eliminar Tierra:", planetas)

# Limpiar y eliminar el set
planetas.clear()
print("Planetas después de limpiar:", planetas)
# del planetas  # Elimina el set; descomentar para ver el error si se imprime

# Trabajando con Diccionarios
print("\n--- Diccionarios ---")
diccionario = {
    "IDE": "Integrated Development Environment",
    "POO": "Programación Orientada a Objetos",
    "SABD": "Sistema de Administracion de base de Datos"
}

# Verificar la cantidad de elementos en el diccionario
print("Diccionario:", diccionario)
print("Cantidad de elementos en el diccionario:", len(diccionario))

# Acceder a elementos del diccionario
print("IDE:", diccionario["IDE"])
print("POO:", diccionario.get("POO"))
print("SABD:", diccionario.get("SABD"))

# Modificar un elemento
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print("Diccionario después de modificar IDE:", diccionario)

# Recorrer el diccionario
print("Llaves del diccionario:")
for termino in diccionario:
    print(termino)

print("Llaves y valores del diccionario:")
for termino, valor in diccionario.items():
    print(termino, valor)

# Otros métodos para acceder a llaves y valores
print("Llaves usando keys():")
for termino in diccionario.keys():
    print(termino)

print("Valores usando values():")
for valor in diccionario.values():
    print(valor)

# Comprobar existencia de un elemento
print("IDE en diccionario:", "IDE" in diccionario)

# Agregar y eliminar un elemento
diccionario["PK"] = "Primary key"
print("Diccionario después de agregar PK:", diccionario)
diccionario.pop("SABD")
print("Diccionario después de eliminar SABD:", diccionario)

# Limpiar y eliminar el diccionario
diccionario.clear()
print("Diccionario después de limpiar:", diccionario)
# del diccionario  # Elimina el diccionario; descomentar para ver el error si se imprime

# Trabajando con Listas
print("\n--- Listas ---")
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2  # Concatenar listas
print("Lista concatenada:", lista3)

# Agregar elementos a la lista
lista3.extend([7, 8, 9, 1])
print("Lista después de agregar elementos:", lista3)

# Encontrar el índice de un elemento
print("Índice de 5 en lista3:", lista3.index(5))  # Descomentar para evitar error si el elemento no está en la lista

# Contar elementos repetidos
print("Cantidad de veces que 1 aparece en lista3:", lista3.count(1))

# Invertir la lista
lista3.reverse()
print("Lista invertida:", lista3)

# Multiplicar la lista
lista = lista3 * 2
print("Lista multiplicada:", lista)

# Ordenar la lista
lista3.sort()  # Ordenar ascendentemente
print("Lista ordenada ascendentemente:", lista3)
lista3.sort(reverse=True)  # Ordenar descendentemente
print("Lista ordenada descendentemente:", lista3)

# Trabajando con Tuplas
print("\n--- Tuplas ---")
tupla = (4, "Hola", 6.78, [1, 2, 78], 4, "hola")
print("Tupla:", tupla)

# Acceso y operaciones con tuplas
print("4 está en la tupla:", 4 in tupla)
print("Contar cuántas veces aparece 4 en la tupla:", tupla.count(4))
print("Longitud de la tupla:", len(tupla))

# Convertir tupla a lista y modificar
cocinaLista = list(tupla)
cocinaLista[0] = "Plato"
tupla = tuple(cocinaLista)
print("Tupla después de convertir y modificar:", tupla)
# -----------------------------------------------------------------
# Trabajando con Listas, Tuplas y Sets

# Listas
print("\n--- Listas ---")
lista1 = ["hola", 1, 4.5, True]
lista2 = ["chauuuu", False, 1]

# Concatenar listas
lista3 = lista1 + lista2
print("Lista concatenada:", lista3)

# Agregar varios elementos a una lista
lista3.extend("h")  # Cada carácter de "h" se añade como un elemento separado
print("Lista después de agregar elementos:", lista3)

# Saber índice de algún elemento
print("Índice de 'hola':", lista3.index("hola"))

# Contar cuántos valores repetidos hay dentro de una lista
print("Cantidad de veces que 1 aparece en la lista:", lista3.count(1))

# Poner la lista al revés
lista3.reverse()
print("Lista invertida:", lista3)

# Multiplicar una lista repitiendo sus elementos
lista4 = [1, 2, 3, 4] * 2
print("Lista multiplicada:", lista4)

# Ordenar la lista
lista4.sort()  # Ordenar ascendentemente
print("Lista ordenada ascendentemente:", lista4)
lista4.sort(reverse=True)  # Ordenar descendentemente
print("Lista ordenada descendentemente:", lista4)

# Tuplas
print("\n--- Tuplas ---")
tupla = (4, "hola", 6.78, [1, 5, 2], "hola")
print("Tupla:", tupla)

# Operaciones con tuplas
print("4 está en la tupla:", 4 in tupla)
print("4 no está en la tupla:", 4 not in tupla)

# Trabajando con Sets
print("\n--- Sets ---")
planetas = {"Marte", "Jupiter", "Venus"}

# Verificar la cantidad de elementos en el set
print("Cantidad de planetas:", len(planetas))

# Revisar si un elemento existe en el set
print("Marte está en el set:", "Marte" in planetas)
print("Marte no está en el set:", "Marte" not in planetas)

# Agregar un elemento
planetas.add("Tierra")
planetas.add("Tierra")  # No se puede agregar elementos duplicados
print("Planetas después de agregar Tierra:", planetas)

# Eliminar elementos
planetas.remove("Marte")  # Arroja error si el elemento no existe
print("Planetas después de eliminar Marte:", planetas)
planetas.discard("Tierra")  # No arroja error si el elemento no existe
planetas.discard("Tierra")  # Se puede llamar varias veces sin problemas
print("Planetas después de eliminar Tierra:", planetas)

# Limpiar el set
planetas.clear()
print("Planetas después de limpiar:", planetas)

# Eliminar el set
del planetas
# print(planetas)  # Esto arrojaría un error si se descomenta, ya que el set ha sido eliminado

