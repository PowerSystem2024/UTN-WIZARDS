# Clase 5
# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

cadena = input("Digite una cadena: ")
lista = [] #Creamos uan lista vacia
for i in cadena:
    if i not in lista: # si el caracter aun no esta en la lista
        lista.append(i) # Lo agregamos a la lista

print(f"\tLista de caracteres si repetir ninguno: \t {lista}")