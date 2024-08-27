# Definimos una lista con algunos nombres
nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]

# Imprimimos la lista completa
print(nombres)

# Accedemos a elementos individuales de la lista
print(nombres[0])  # Primer elemento
print(nombres[1])  # Segundo elemento
print(nombres[3])  # Cuarto elemento
print(nombres[-1])  # Último elemento
print(nombres[-2])  # Penúltimo elemento
print()

# Extraemos y mostramos partes específicas de la lista
print(nombres[0:2])  # Primer y segundo elementos
print(nombres[:3])  # Desde el inicio hasta el tercer elemento (sin incluirlo)
print(nombres[1:])  # Desde el segundo elemento hasta el final
print()

# Actualizamos algunos valores en la lista
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
print()

# Iteramos sobre cada elemento de la lista
for nombre in nombres:
    print(nombre)
else:
    print("No quedan más nombres en la lista.")
    print()

# Contamos cuántos elementos tiene la lista
print(len(nombres))
print()

# Añadimos nuevos elementos a la lista
nombres.append("Guille")
print(nombres)
print()

# Insertamos elementos en posiciones específicas de la lista
nombres.insert(1, "Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)
print()

# Eliminamos elementos específicos de la lista
nombres.remove("Alberto")
print(nombres)
print()

# Eliminamos el último elemento de la lista
nombres.pop()
print(nombres)
print()

# Eliminamos un elemento en una posición específica
del nombres[2]  # Eliminamos a "Debora"
print(nombres)
print()

# Limpiamos todos los elementos de la lista
nombres.clear()
print(nombres)
print()

# Finalmente, eliminamos la lista por completo
del nombres
# print(nombres) # Esto provocará un error porque la lista ya no existe

print("****************************************************")
print("              TRABAJANDO CON TUPLAS")
print("****************************************************")
print()

# Creamos una tupla con elementos relacionados con la cocina
utensilios = ("cuchara", "cuchillo", "tenedor")
print(utensilios)
print(len(utensilios))  # Mostramos la cantidad de elementos

# Accedemos a elementos específicos en la tupla
print(utensilios[0])  # Primer elemento
print(utensilios[-1])  # Último elemento

# Extraemos un rango de elementos de la tupla
print(utensilios[0:2])  # Primer y segundo elementos

# Ejemplo de una tupla con un solo elemento
vegetal = ("papa",)
print()

# Iteramos sobre los elementos de la tupla
for item in utensilios:
    print(item, end=" ")  # Imprimimos los elementos en la misma línea

# Convertimos la tupla en lista, modificamos un elemento y la volvemos a convertir en tupla
utensilios_lista = list(utensilios)
utensilios_lista[0] = "plato"
utensilios = tuple(utensilios_lista)
print(utensilios)
print()

# Eliminamos la tupla
del utensilios
# print(utensilios) # Esto provocará un error porque la tupla ya no existe
