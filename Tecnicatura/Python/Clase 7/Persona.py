class Persona:
    """
    Representa a una persona con atributos básicos y la posibilidad de agregar información adicional.

    Args:
        nombre (str): El nombre de la persona.
        apellido (str): El apellido de la persona.
        edad (int): La edad de la persona.
        *args: Otros datos que se almacenarán en una tupla.
        **kwargs: Otros datos que se almacenarán en un diccionario.
    """

    def __init__(self, nombre, apellido, edad, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.otros_datos = (*args, **kwargs)  # Almacenamos datos adicionales en una tupla y un diccionario

    def mostrar_detalle(self):
        """
        Muestra los detalles de la persona, incluyendo los datos adicionales.
        """
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Edad: {self.edad}")
        print(f"Otros datos: {self.otros_datos}")

# Crear objetos
persona1 = Persona("Juan", "Pérez", 23)
persona2 = Persona("Ana", "García", 30, "Calle Falsa 123", ciudad="Buenos Aires")
persona3 = Persona("Carlos", "López", 25, teléfono="123456789", email="carlos@example.com")

# Mostrar detalles
persona1.mostrar_detalle()
persona2.mostrar_detalle()
persona3.mostrar_detalle()