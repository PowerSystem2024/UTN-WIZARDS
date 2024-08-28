# lista = Ariel, Liliana, Natalia, Osvaldo
# Colecciones en Python

# Las listas es lo que se conoce en otro llenguajes como arreglos o vectores

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
# con los numeros negativos -1 arrancamos desde el ultimo hacia el primero
print(nombres[-1]) #manera inversa
print(nombres[-2])

#RECUPERAR UN RANGO DE LA LISTA
print(nombres[0:2]) #solo muestra el indice 0, 1 pero no el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) # Indice a mostrar 0, 1, 2
# Desde el indice indicado hasta el final
print(nombres[1: ])
#Modificar un valor
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
#Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")


#PREGUNTAMOS CUANTO ELEMENTO TIENE UNA LISTA
print(len(nombres)) #le pasmos como parametro la lista

# Agregamos un elemnto
nombres.append("Marcelo") # se agrega al final "cola"
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Inertar un elemento en un indice especifico
nombres.insert(1,"Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)

# Eliminamos un elemento
nombres.remove("Alberto")
print(nombres)

#Eliminar el último elemento
nombres.pop()
print(nombres)

#Eliminar un indice especifico
del nombres[2] # del segnifica delete (eliminar)
print(nombres)

#Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
#print(nombres) #Aqui nos mostrara un error


#TUPLAS
#sigue el orden de los elemntos que se agregan, pero estos no se puede eliminar
#se los llaman inmutables. Esta es la gran diferencia entres lista y tuplas
#Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)

#definimos el largo de una tupla
print(len(cocina))

#Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])

#Mostramos de manera inversa
print(cocina[-1])

#Acceder a un rango
print(cocina[0:2])

#Ejemplo
verduras = ("papa",) #una tupla nesecita aun que sea de un elemento: la coma
#de lo contrario solo seria un tipo str cadena

#Recorremos los elementos de la tupla
for cocinar in cocina: # print esta usando /n para saltos de líneas
    print(cocinar, end=" ") # Usamos end= para eliminar los saltos de líneas

cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print("\n", cocina)

# del  cocina: Esto es para eliminar una tupla
