# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
print("Rango de 0 a 10 con números divisibles entre 3:")
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2: Crear un rango de números de 2 a 6 e imprimirlos
print("\nRango con valores de inicio = 2 y fin = 6:")
for i in range(2, 7):
    print(i)

# Ejercicio 3: Crear un rango de 3 a 10 con incremento de 2 en 2
print("\nRango con valores de inicio = 3, fin = 10, incremento = 2:")
for i in range(3, 11, 2):
    print(i)

# Tuplas: Crear una lista con números menores a 5 a partir de una tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
print("\nLista con números menores a 5 de la tupla:")
lista = [elemento for elemento in tupla if elemento < 5]
print(lista)

# Listas: Definir una lista y realizar varias operaciones
nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print("\nLista de nombres:")
print(nombres)

# Acceder a elementos de la lista
print("Primer elemento:", nombres[0])
print("Segundo elemento:", nombres[1])
print("Último elemento:", nombres[-1])
print("Penúltimo elemento:", nombres[-2])

# Recuperar un rango de la lista
print("Rango de la lista (0:2):", nombres[0:2])
print("Desde inicio hasta índice 2:", nombres[:3])
print("Desde índice 1 hasta el final:", nombres[1:])

# Modificar valores en la lista
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print("Lista después de modificaciones:", nombres)

# Iterar sobre la lista
print("Iterando sobre la lista:")
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

# Consultar la cantidad de elementos en la lista
print("Cantidad de elementos en la lista:", len(nombres))

# Agregar elementos a la lista
nombres.extend(["Marcelo", [1, 2, 3], True, 10.45, [4, 5], 7])
print("Lista después de agregar elementos:", nombres)

# Insertar elementos en índices específicos
nombres.insert(1, "Alberto")
nombres.insert(3, "Debora")
print("Lista después de insertar elementos:", nombres)

# Eliminar elementos
nombres.remove("Alberto")
print("Lista después de eliminar 'Alberto':", nombres)
nombres.pop()  # Elimina el último elemento
print("Lista después de eliminar el último elemento:", nombres)
del nombres[2]  # Elimina el elemento en el índice 2
print("Lista después de eliminar el índice 2:", nombres)

# Limpiar la lista y eliminarla
nombres.clear()
print("Lista después de limpiar:", nombres)
del nombres
# print(nombres)  # Esto daría un error porque la lista ha sido eliminada

# Tuplas: Definir y operar sobre tuplas
cocina = ("cuchara", "cuchillo", "tenedor")
print("\nTupla de cocina:", cocina)
print("Longitud de la tupla:", len(cocina))
print("Primer elemento de la tupla:", cocina[0])
print("Último elemento de la tupla:", cocina[-1])
print("Rango de la tupla (0:2):", cocina[0:2])

# Recorremos los elementos de la tupla
print("Recorriendo la tupla:")
for item in cocina:
    print(item, end=" ")
print()  # Nueva línea después de la impresión en una línea

# Convertir tupla a lista para modificarla y luego volver a tupla
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print("Tupla después de la modificación:", cocina)
