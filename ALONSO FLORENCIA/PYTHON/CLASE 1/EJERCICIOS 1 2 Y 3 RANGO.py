'''
EJERCICIO 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
Ejemplo de ejecución: 0,3,6,9
'''
#EJERCICIO 1
print("Inicio del EJERCICIO 1")

# Usamos una lista por comprensión para encontrar los números divisibles entre 3
# Luego iteramos sobre la lista para imprimir cada número
for i in [n for n in range(11) if n % 3 == 0]:
    print(i)

print("Fin del EJERCICIO 1\n")

'''
EJERCICIO 2: Crear un rango de numeros de 2 a 6 e imprimelos
Ejemplo de ejecución: 2,3,4,5,6
'''

#EJERCICIO 2
print("Inicio del EJERCICIO 2")

# Usamos la función range con un bucle while para recorrer y mostrar los números
i = 2
while i <= 6:
    print(i)
    i += 1  # Incrementamos en 1 para avanzar al siguiente número

print("Fin del EJERCICIO 2\n")

'''
EJERCICIO 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, 
en lugar de 1 en uno en 1. Ejemplo de ejecución: 3,5,7,9
'''

#EJERCICIO 3
print("Inicio del EJERCICIO 3")

# Usamos una variable y un bucle while para manejar el incremento manualmente
i = 3
while i < 10:
    print(i)
    i += 2  # Incrementamos en 2 en cada iteración para cumplir con el ejercicio

print("Fin del EJERCICIO 3\n")
