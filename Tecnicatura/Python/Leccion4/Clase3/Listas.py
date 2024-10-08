#Clase 3 Python

# Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set() #conjunto vacio, no inicializando
conjunto1 = {"bye", } #siempre tiene que tener ya un elemento que lo distinga
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1) #Preguntamos si el número 3 NO esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) # Nos devuelve como respuesta un booleano

#Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 # La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # Que elemento tiene en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el contjunto 1 y no en le conjunto 2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # lementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3)) # Aquí preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) # Preguntamos is los lementos del conjunto 1 estan dentro del 3
print(conjunto3.issuperset(conjunto2)) # Si es verdadero queir edecir que el  conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) # No hay cosas en comun

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset # Esto hace que el conjunto sea totalmente inmutable
# No se puede agregar. modificar ni eliminar elementos del conjunto

# Repaso Diccionarios
diccionarioNuevo = {"Azul": "Blue", "Rojo": "red", "Verde": "Green", "Amarillo": "Yellow" }
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

# Los diccionarios puede almacenar diferentes tipos de datos
diccionario2 = {"Ariel": {"Edad": 40, "Altura": 1.83}, "Osval": [45, 1.85], "Natalia": [35, 1.67]} # Las lista van con llaves []
print(diccionario2)

seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 35, "Altura": 1.70, "Precio": "50 Millones", "Posicion": "Extremo Derecho"},
    11: {"Nombre": "Ángel Di María", "Edad": 34, "Altura": 1.80, "Precio": "12 Millones", "Posicion": "Extremo Derecho"},
    24: {"Nombre": "Paulo Dybala", "Edad": 28, "Altura": 1.77, "Precio": "35 Millones", "Posicion": "Medio Punta"},
    19: {"Nombre": "Nicolás Otamendi", "Edad": 34, "Altura": 1.83, "Precio": "3.5 Millones", "Posicion": "Defensa Central"},
    1: {"Nombre": "Franco Armani", "Edad": 35, "Altura": 1.89, "Precio": "3.5 Millones", "Posicion": "Portero"},
    # Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
    9: {"Nombre": "Julian Álvarez", "Edad": 24, "Altura": 1.80, "Precio": "90 Millones", "Posicion": "Delantero"},
    4: {"Nombre": "Gonzalo Montiel", "Edad": 27, "Altura": 1.75, "Precio": "10 Millones", "Posicion": "Defensa"},
    23: {"Nombre": "Enzo Fernández", "Edad": 23, "Altura": 1.78, "Precio": "121 Millones", "Posicion": "Centro campista"},
    22: {"Nombre": "Lautaro Martínez", "Edad": 27, "Altura": 1.74, "Precio": "110 Millones", "Posicion": "Delantero"}
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print("Tenemos cargado en el diccionario la cantidad de jugadores: ", end=" ")
print(len(seleccionArgentina))

# METODO CON LISTA LLAMADO PILAS
# Pilas usando lista
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacando elementos desde el final
elementoBorrado = pila.pop() # Quita el Último elemento y los guarda en la variable
print(f"Scamos el elemento {elementoBorrado}")
print(f"La pila ahora quedo asi: {pila}")

# Colas con listas
# Estructura de datos de tipo fifo(first input / first output)
cola = ["Ariel", "Osvaldo", "Liliana", "Pilar"]

#Agregar elementos al final de la cola
cola.append("Natalia")
cola.append("Jose")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

# Clase 4
# Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f"{i} -> {seleccionArgentina[i]}")