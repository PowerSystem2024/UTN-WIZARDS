class Persona:
    """
    Clase que representa a una persona.

    Esta clase define los atributos básicos de una persona y un método para mostrar sus datos.
    """

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        """
        Constructor de la clase.

        Inicializa los atributos de la instancia.

        Args:
            nombre (str): Nombre de la persona.
            apellido (str): Apellido de la persona.
            dni (int): Documento Nacional de Identidad.
            edad (int): Edad de la persona.
            *args: Argumentos posicionales adicionales (se almacenan en una tupla).
            **kwargs: Argumentos de palabra clave adicionales (se almacenan en un diccionario).
        """

        self.nombre = nombre
        self._apellido = apellido  # Encapsulado sugerido para apellido
        self._dni = dni  # Encapsulado sugerido para dni
        self.edad = edad
        self.args = args  # Tupla para almacenar argumentos posicionales adicionales
        self.kwargs = kwargs  # Diccionario para almacenar argumentos de palabra clave adicionales

    def mostrar_detalle(self):
        """
        Muestra los detalles de la persona.

        Imprime por pantalla los atributos de la instancia, incluyendo los argumentos adicionales.
        """

        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self._apellido} {self._dni} {self.edad}, "
              f"la dirección es: {self.args}, los datos importantes son: {self.kwargs}")

# Creación de instancias de la clase Persona

# Instancia con valores predeterminados
persona1 = Persona("Juan", "Zalazar", 40454542, 22)

# Acceso a los atributos de la instancia
print(persona1.nombre)  # Imprime "Juan"
print(persona1._apellido)  # Imprime "Zalazar" (acceso al atributo encapsulado)
print(persona1.edad)  # Imprime 22

# Instancia con valores diferentes
persona2 = Persona("Ana", "Gómez", 38943235, 30)

# Acceso a los atributos de la segunda instancia
print(persona2.nombre)  # Imprime "Ana"
print(persona2._apellido)  # Imprime "Gómez" (acceso al atributo encapsulado)
print(persona2.edad)  # Imprime 30

# Instancia con valores adicionales
persona3 = Persona("Osvaldo", "Giordanini", 27432876, 45, "Calle Falsa 123", ciudad="Buenos Aires", país="Argentina")
print(f"El objeto3 de la clase persona: {persona3.nombre} {persona3._apellido} Su edad es: {persona3.edad}")
# TAREA
class Persona:
    """
    Representa a una persona con atributos como nombre, apellido, DNI, edad y otros datos opcionales.
    """

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        """
        Inicializa una instancia de la clase Persona.

        Args:
            nombre (str): Nombre de la persona.
            apellido (str): Apellido de la persona.
            dni (int): Documento Nacional de Identidad.
            edad (int): Edad de la persona.
            *args: Otros datos posicionales (e.g., dirección).
            **kwargs: Otros datos de palabra clave (e.g., altura, peso).
        """
        self.nombre = nombre
        self._apellido = apellido  # Encapsulado: no se modifica directamente desde fuera de la clase
        self._dni = dni  # Encapsulado: no se modifica directamente desde fuera de la clase
        self.edad = edad
        self.otros_datos = (*args, **kwargs)  # Almacenamos los datos adicionales en una tupla y un diccionario

    def mostrar_detalle(self):
        """
        Muestra la información de la persona de forma detallada.
        """
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self._apellido}")
        print(f"DNI: {self._dni}")
        print(f"Edad: {self.edad}")
        print(f"Otros datos: {self.otros_datos}")

# Crear instancias
persona1 = Persona("Juan", "Zalazar", 40334543, 22)
persona2 = Persona("Ana", "Gómez", 38943235, 30, "Calle Falsa 123", ciudad="Buenos Aires")
persona3 = Persona("Rogelio", "Romero", 35789456, 22, "Telefono", "256787878",
                    "Calle Lopez", 823, "Manzana", 77, "Casa", 18, Altura=1.83, peso=105,
                    CFavorito="Azul", Auto="Citroen", Modelo=2021)

# Modificar atributos
persona1.nombre = "Liliana"
# persona1._apellido = "Buccella"  # Esto no es recomendado debido al encapsulamiento

# Mostrar detalles
persona1.mostrar_detalle()
persona2.mostrar_detalle()
persona3.mostrar_detalle()
