# Comenzamos con funciones
# mi_funcion() # No se puede llamar antes de definir una función
# Definimos una función
def mi_funcion(): # Para identificar a la función utilizamos paréntesis
    print("Saludos a todos los alumnos de la tecnicatura")

mi_funcion() # Estamos llamando a la función
mi_funcion # Se puede llamar a una función N cantidad de veces

# Desempaquetado de listas o list unpacking
def show(name, lastname):
    print(name+" "+lastname)
person = ["Ariel","Betancud"]
show(person[0],person[1]) # Pasamos uno por uno los datos de la lista a la función
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Osvaldo", "Giordanini") # Desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastname":"Lucero", "name": "Natalia"}
show(**person3) # Desempaquetamos un diccionario

# Ejemplo de uso de for-else
numbers = [1, 2, 3, 4, 5] # Aun con la lista vacía se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la única manera para que no se ejecute el else
else:
    print("Esto se terminó")

# List comprehension: lista de comprensión
names = ["Paolo","Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0]== "P"] # Esto regresa una nueva lista con nombres que empiezan con "P"
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "MX"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"] # Filtramos cervezas de Argentina
print(Arg)
print(bottleC)

# Paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a través del canal de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge","Lucero")
mi_funcion2("Ariel","Betancud")
mi_funcion2("Analia","Pedrosa")

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a,b):
    return a+b
#resultado = sumar(78,22)
#print(f"El resultado de la suma es : {resultado}")
print(f"El resultado de la suma es : {sumar(55,45)}")

def sumar2(a = 0, b = 0): # Le damos un valor por defecto
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

# Argumentos variables en funciones
def listaNombres(*nombres): # Normalmente se utiliza *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listaNombres("Lucas","Jose","Claudia","Rosa","Maria")
listaNombres("Marcos","Daniel","Romina","Pepe","Marcela","Carlos")

def listarTerminos(**terminos): # Lo más utilizado es **kwargs para recibir argumentos
    for llave, valor in terminos.items(): # kwargs significa: keyword arguments
        print(f"{llave}: {valor}")

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE = "Integrated Development Environment", PK = "Primary Key")
listarTerminos(Nombre = "Lionel Messi")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito","Pedro","Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
#desplegarNombres(10,11) # NO es un objeto iterable
desplegarNombres((10,11)) # La convertimos a una tupla, en un solo elemento no olvidar la coma
desplegarNombres([22,55]) # La convertimos en una lista

# Funciones Recursivas
def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero - 1) # Caso Recursivo
    
numeroFactorial = int(input("Digite el número para calcular el factorial: "))
resultado = factorial(numeroFactorial) # Calculamos el factorial
print(f"El factorial del número {numeroFactorial} es: {resultado}") # Mostramos el resultado