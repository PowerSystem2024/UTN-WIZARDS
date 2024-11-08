class Persona2:
    def __init__(self, nombre, apellido, edad): #esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property #decorador
    def nombre(self): # metodo getter
        print('Estamos utiliazndo el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): #metodo setter
        print('Estamos utilizando el método set')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')
if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre) #llamamos al método getter
    persona1.nombre = 'Juan Pedro' # llamamos al método setter
    print(persona1.nombre) # otra vez con el método getter
    print(persona1.mostrar_detalles()) #llamamos el método mostrar detalles
    # atributo read-only sería la edad porque no tiene el método set
    print(persona1.edad)