# Ejercicio 11: Agencia telefónica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor 
# sea el teléfono, el programa tendrá el siguiente menú de opciones:
#   1. Nuevo Contacto.
#   2. Borrar Contacto.
#   3. Ver Contactos existentes.
#   4. Salir.

agenda = {}  # Diccionario para los contactos

while True:
    # Mostrar el menú
    print("\t Menu:")
    print("1. Nuevo Contacto.")
    print("2. Borrar Contacto.")
    print("3. Ver Contactos existentes.")
    print("4. Salir.")
    
    # Pedir la opción del menú al usuario
    opcion = int(input("Digite una opcion del menu: "))
    
    if opcion == 1:
        # Agregar un nuevo contacto
        nombre = input("Digite nombre del contacto: ")
        telefono = input("Digite el numero de telefono: ")
        
        if nombre not in agenda:
            agenda[nombre] = telefono  # Añadir el contacto
            print("Contacto agregado exitosamente!")
        else:
            print("Ese nombre de contacto ya existe.")
    
    elif opcion == 2:
        # Borrar un contacto
        nombre = input("Cual es el nombre del contacto: ")
        
        if nombre in agenda:
            del agenda[nombre]  # Eliminar el contacto
            print("Se ha eliminado exitosamente.")
        else:
            print("Este contacto no existe en la agenda.")
    
    elif opcion == 3:
        # Mostrar contactos existentes
        print("Agenda de contactos:")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    
    elif opcion == 4:
        # Salir del programa
        print("Gracias por utilizar su agenda de contacto.")
        break  # Romper el ciclo para salir
    
    else:
        # Opción incorrecta
        print("Se equivoco de opcion.")


