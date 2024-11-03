# Ejercicio 05: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius a fahrenheit y viceversa.
# Investigar las fórmulas

# Función para convertir de Celsius a Fahrenheit
def celsius_a_fahrenheit(celsius):
    # Aplicamos la fórmula de conversión
    fahrenheit = (celsius * 9/5) + 32
    # Devolvemos el resultado redondeado a 2 decimales
    return round(fahrenheit, 2)

# Función para convertir de Fahrenheit a Celsius
def fahrenheit_a_celsius(fahrenheit):
    # Aplicamos la fórmula de conversión
    celsius = (fahrenheit - 32) * 5/9
    # Devolvemos el resultado redondeado a 2 decimales
    return round(celsius, 2)

# Solicitamos al usuario que elija la conversión
print("Seleccione la conversión que desea realizar:")
print("1. Celsius a Fahrenheit")
print("2. Fahrenheit a Celsius")
opcion = int(input("Ingrese su opción (1 o 2): "))

# Realizamos la conversión según la opción elegida
if opcion == 1:
    temp_celsius = float(input("Ingrese la temperatura en Celsius: "))
    resultado = celsius_a_fahrenheit(temp_celsius)
    print(f"{temp_celsius}°C es igual a {resultado}°F")
elif opcion == 2:
    temp_fahrenheit = float(input("Ingrese la temperatura en Fahrenheit: "))
    resultado = fahrenheit_a_celsius(temp_fahrenheit)
    print(f"{temp_fahrenheit}°F es igual a {resultado}°C")
else:
    print("Opción no válida. Por favor, elija 1 o 2.")