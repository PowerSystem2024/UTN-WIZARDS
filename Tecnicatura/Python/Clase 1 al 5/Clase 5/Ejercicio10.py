# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego 
# meter los caracteres en una lista sin repetir caracteres.

cadena = input("Digite una cadena: ")  # Pedir la cadena al usuario
caracteres_unicos = []  # Lista para almacenar caracteres sin repetir

for caracter in cadena:
    if caracter not in caracteres_unicos:  # Verificar si el carácter no está en la lista
        caracteres_unicos.append(caracter)  # Agregar el carácter a la lista

# Mostrar la lista de caracteres sin repetir
print("\nLista de caracteres sin repetir ninguno:")
print(caracteres_unicos)
