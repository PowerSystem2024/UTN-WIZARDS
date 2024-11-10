class Cubo:
    """
    Representa un cubo en el espacio tridimensional.

    Esta clase permite crear objetos que representan cubos y calcular su volumen.

    Atributos:
        ancho (int): La longitud de una de las aristas del cubo.
        altura (int): La longitud de otra arista del cubo (igual al ancho en un cubo).
        profundidad (int): La longitud de la tercera arista del cubo (igual al ancho en un cubo).
    """

    def __init__(self, ancho, altura, profundidad):
        """
        Constructor de la clase Cubo.

        Inicializa un nuevo objeto Cubo con los valores proporcionados para el ancho, altura y profundidad.

        Args:
            ancho (int): La longitud de una de las aristas del cubo.
            altura (int): La longitud de otra arista del cubo.
            profundidad (int): La longitud de la tercera arista del cubo.
        """
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        """
        Calcula el volumen del cubo.

        El volumen de un cubo se calcula multiplicando el ancho, la altura y la profundidad.

        Returns:
            int: El volumen del cubo.
        """
        return self.ancho * self.altura * self.profundidad

# Pedimos al usuario que ingrese las dimensiones del cubo
ancho = int(input("Ingrese el ancho del cubo: "))
altura = int(input("Ingrese la altura del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))

# Creamos un objeto Cubo con las dimensiones ingresadas
cubo1 = Cubo(ancho, altura, profundidad)

# Calculamos y mostramos el volumen del cubo
volumen = cubo1.calcular_volumen()
print(f"El volumen del cubo es: {volumen}")