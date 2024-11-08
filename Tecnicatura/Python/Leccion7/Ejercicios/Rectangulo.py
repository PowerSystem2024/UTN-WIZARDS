class Rectangulo:
    """
    Representa un rectángulo con una base y una altura.

    Atributos:
        base (int): La longitud de la base del rectángulo.
        altura (int): La altura del rectángulo.
    """

    def __init__(self, base, altura):
        """
        Inicializa un nuevo objeto Rectángulo.

        Args:
            base (int): La longitud de la base.
            altura (int): La altura del rectángulo.
        """
        self.base = base
        self.altura = altura

    def calcular_area(self):
        """
        Calcula el área del rectángulo.

        Returns:
            int: El área del rectángulo.
        """
        return self.base * self.altura

# Función para crear un rectángulo y calcular su área
def crear_rectangulo():
    base = int(input("Ingrese la base del rectángulo: "))
    altura = int(input("Ingrese la altura del rectángulo: "))
    rectangulo = Rectangulo(base, altura)
    print(f"El área del rectángulo es: {rectangulo.calcular_area()}")

# Crear tres rectángulos y calcular sus áreas
crear_rectangulo()
crear_rectangulo()
crear_rectangulo()