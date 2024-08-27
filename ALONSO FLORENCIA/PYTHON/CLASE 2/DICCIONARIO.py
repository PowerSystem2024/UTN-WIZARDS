# Creación de un diccionario con términos específicos

# Definición del diccionario
glosario = {
    "IDE"  : "Integrated Development Environment",
    "POO"  : "Programación Orientada a Objetos",
    "SABD" : "Sistema de Administración de Bases de Datos"
}

# Mostrar el diccionario completo
print(glosario)

# Mostrar la cantidad de elementos en el diccionario
print(len(glosario))

# Acceder a un valor usando su llave
print(glosario["IDE"])

# Alternativa para obtener un valor
print(glosario.get("POO"))
print(glosario.get("inexistente"))  # Esto devolverá 'None'

# Modificar un valor existente en el diccionario
glosario["IDE"] = "Entorno de Desarrollo Integrado"
print(glosario["IDE"])

# Recorrer el diccionario solo accediendo a las llaves
for clave in glosario:
    print(clave)

# Recorrer el diccionario obteniendo tanto las llaves como los valores
for clave, valor in glosario.items():
    print(clave, valor)

# Obtener solo las llaves del diccionario
for clave in glosario.keys():
    print(clave)

# Obtener solo los valores del diccionario
for valor in glosario.values():
    print(valor)

# Verificar si una llave existe en el diccionario
print("IDE" in glosario)  # Esto devuelve un valor booleano

# Agregar un nuevo par clave-valor al diccionario
# Si la llave ya existe, el valor será reemplazado
glosario["PK"] = "Primary Key"
print(glosario)

# Eliminar un par clave-valor específico
glosario.pop("SABD")
print(glosario)

# Vaciar todo el contenido del diccionario
glosario.clear()
print(glosario)

# Eliminar el diccionario por completo
del glosario
# Intentar imprimir el diccionario después de eliminarlo causará un error
# print(glosario)
