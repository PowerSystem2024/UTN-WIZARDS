#Clase 5

#Desempaquetado listas o list Unpanking
def show(name, lastName):
    print(name+" "+lastName)
person = ["Ariel", "Betancud"] # Creamos una lista
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la función
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Osvaldo", "Giordanini") # desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"} #Diccionario
show(**person3)

#REPASO DEL CICLO FOR ELSE
numbers = [1, 2, 3, 4, 5] # Aun con el la lista vacía se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termino")

# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#Paso de ARgumentos (funciones)
def mi_funcion2(name, lastName): #Paremetros
    print("Saludos a todos los que ven a través del canal de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero") #Argumentos
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "Pedrosa")

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
#print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55, 45)}")

# Funciones: valores por default en argumentos
def sumar2(a = 0, b = 0): #Le damos un valor por default
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

# Argumentos, variables en funciones
def listarNombres(*nombres):
    for nombre in nombres: #Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas", "Jose", "Claudia", "Rosa", "Maria")
listarNombres("Marcos", "Daniel", "Romina", "Pepe", "Marcela", "Carlos")


#Argumentos variables para un diccionario

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): #Reccorrer diccionatios items, kwargs significa: key word argument
        print(f"{llave} : {valor}")

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE="Integrated Develoment Enviroment", PK="Primaruy Key")
listarTerminos(Nombre="Leonel Messi")

# Lista de elementos con funciones (convertir)
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

nombres2 = ["Tito", "Prdro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
#desplegarNombres(10, 11) # No es un objeto iterable
desplegarNombres((10,)) # Doble parentecis los convierte un una tupla # La covertimos en uan tupla # En un solo elemento no olvidar la coma
desplegarNombres([22, 55]) # LA convertimos en una lista

#Funciones recursivas
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) # Caso recursivo
numeroFactorial = int(input("Digite el número para calcular el factorial: "))
resultado = factorial(numeroFactorial) # Lo hacemos en código duro
print(f"El factorial del número {numeroFactorial} es: {resultado}")