import math
#Dada la siguiente tupla
tupla = (13,1,8,3,2,5,8)
# Crear una lista que solo incluya los numeros menores a 5
# e imprimir por consola [1,3,2]

lista = [] # Definimos la lista
# Filtramos los elemenos menos a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Ejercicio de matemáticas

# Para sacar la raíz cuadrada de un número positivo 
numero= int(input('Digite un numero positivo ')) 
while numero < 0:
    print('Error -> Debería ser un nro positivo')
numero= int(input('Digite un nro positivo: ')) 
print(f'\nSu raíz cuadrada es: {math.sqrt(numero):.2f}')