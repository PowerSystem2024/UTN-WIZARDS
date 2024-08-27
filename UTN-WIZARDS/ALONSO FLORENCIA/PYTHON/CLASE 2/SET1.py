# Las listas son mutables, las tuplas son inmutables
# Los conjuntos (sets) no tienen un orden específico y son inmutables, pero se pueden agregar o eliminar elementos
# No conservan un índice y su orden es aleatorio

# Definición de un conjunto (set) que no mantiene un orden fijo
planetas = {"Marte", "Júpiter", "Venus"}
print(len(planetas))  # Usamos la función len para obtener la cantidad de elementos

# Comprobar si un elemento está presente en el conjunto
print("Marte" in planetas)  # Retorna un valor booleano si "Marte" está en el conjunto
print("Marte" not in planetas)

# Agregar un nuevo elemento al conjunto
planetas.add("Tierra")
planetas.add("Tierra")  # No se permiten duplicados en un conjunto
print(planetas)

# Los conjuntos son útiles cuando queremos evitar elementos duplicados, como en una lista de DNI

# Eliminar un elemento del conjunto, puede causar un error si el elemento no existe
planetas.remove("Marte")  # Lanza un error si el elemento no está presente
print(planetas)

# Eliminar un elemento usando discard, que no lanza error si el elemento no existe
planetas.discard("Tierra")
planetas.discard("Tierra")  # No hace nada si "Tierra" ya fue eliminado
print(planetas)

# Vaciar el conjunto
planetas.clear()  # Deja el conjunto vacío
print(planetas)

# Eliminar completamente el conjunto
del planetas
# Intentar imprimir después de eliminar el conjunto causará un error
# print(planetas)
