class Persona2:
    
    def __init__(self, nombre, apellido, edad):  # Constructor encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        
    def mostrar_detalles(self):
        print(f"Información personal: {self._nombre} {self._apellido}, tiene {self._edad} años.")
        
    # *Método Getter: Acceso indirecto a los atributos mediante decoradores
    @property
    def nombre(self):
        return self._nombre
    
    @property
    def apellido(self):
        return self._apellido
    
    @property
    def edad(self):
        return self._edad
    
    @nombre.setter
    def nombre(self, nombre):  # Método setter para nombre
        self._nombre = nombre
        
    @apellido.setter
    def apellido(self, apellido):  # Método setter para apellido
        self._apellido = apellido
        
    @edad.setter
    def edad(self, edad):  # Método setter para edad
        self._edad = edad
        
# *Creación de objetos
# Objeto 1
persona1 = Persona2('Florencia', 'Irupe', 25)
print(" ")
print(" OBJETO 1 ".center(60, '='))
print(" Accediendo a los atributos usando el método getter ".center(60, '='))
print(" ")
print(f"Nombre del primer objeto: {persona1.nombre}")
print(f"Apellido del primer objeto: {persona1.apellido}")
print(f"Edad del primer objeto: {persona1.edad}")
print(" ")
print(" Modificando atributos con el método setter ".center(60, '='))
print(" ")
persona1.nombre = 'Federico'
persona1.apellido = 'Martínez'
persona1.edad = 31
print(f"Nombre actualizado del primer objeto: {persona1.nombre}")
print(f"Apellido actualizado del primer objeto: {persona1.apellido}")
print(f"Edad actualizada del primer objeto: {persona1.edad}")
print(" ")
print(persona1.mostrar_detalles())
print(" ")

# Objeto 2
persona2 = Persona2('Luciana', 'Gómez', 28)
print(" ")
print(" OBJETO 2 ".center(60, '='))
print(" Accediendo a los atributos usando el método getter ".center(60, '='))
print(" ")
print(f"Nombre del segundo objeto: {persona2.nombre}")
print(f"Apellido del segundo objeto: {persona2.apellido}")
print(f"Edad del segundo objeto: {persona2.edad}")
print(" ")
print(" Modificando atributos con el método setter ".center(60, '='))
print(" ")
persona2.nombre = 'Ramiro'
persona2.apellido = 'Domínguez'
persona2.edad = 38
print(f"Nombre actualizado del segundo objeto: {persona2.nombre}")
print(f"Apellido actualizado del segundo objeto: {persona2.apellido}")
print(f"Edad actualizada del segundo objeto: {persona2.edad}")
print(" ")
print(persona2.mostrar_detalles())
print(" ")

# Objeto 3
persona3 = Persona2('Micaela', 'López', 22)
print(" ")
print(" OBJETO 3 ".center(60, '='))
print(" Accediendo a los atributos usando el método getter ".center(60, '='))
print(" ")
print(f"Nombre del tercer objeto: {persona3.nombre}")
print(f"Apellido del tercer objeto: {persona3.apellido}")
print(f"Edad del tercer objeto: {persona3.edad}")
print(" ")
print(" Modificando atributos con el método setter ".center(60, '='))
print(" ")
persona3.nombre = 'Nicolás'
persona3.apellido = 'Pereira'
persona3.edad = 44
print(f"Nombre actualizado del tercer objeto: {persona3.nombre}")
print(f"Apellido actualizado del tercer objeto: {persona3.apellido}")
print(f"Edad actualizada del tercer objeto: {persona3.edad}")
print(" ")
print(persona3.mostrar_detalles())
print(" ")
