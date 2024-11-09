class Persona: #creamos una clase
     def __init__(self, nombre, apellido, edad, *args, **kwargs): # se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
     def mostrar_detalle(self):
         print(f'La clase Persona tiene los siguientes datos:  {self.nombre} {self.apellido} {self._dni{self.edad}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}')


persona1 = Persona('Ariel', 'Betancud',45454545, 40) #necesitamos enviar argumentos
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}')
persona2 = Persona('Osvaldo', 'Giordanini',2926262, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los métodos son: el comportameinto que van a tener los objetos(accoines)
persona1.mostrar_detalle() #la referencia en este caso se pasa de manera automática
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # debemos pasarle una referencia para el self o dará error
persona1.telefono = '5454545'
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') #hemos creado un atributo de un objeto

# print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero',45454545, 22, 'Teléfono', '2645545454', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura= 1.83, Peso = 105, CFavorito = 'Azul', Auto = 'Citroen', Modelo = 2021)
persona3.mostrar_detalle()
print(persona3._dni) #esto dno se debe utilizar(esta encapsulado), esto dice q lo desconocemos python