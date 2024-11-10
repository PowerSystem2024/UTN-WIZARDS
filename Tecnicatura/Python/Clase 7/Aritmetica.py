class Aritmetica:
    """
    Esta clase representa una calculadora básica. Permite realizar operaciones aritméticas 
    simples como suma, resta, multiplicación y división sobre dos números.

    Args:
        operandoA (int o float): El primer número para realizar las operaciones.
        operandoB (int o float): El segundo número para realizar las operaciones.
    """

    def __init__(self, operandoA, operandoB):
        """
        Constructor de la clase. Inicializa los atributos operandoA y operandoB.

        Args:
            operandoA (int o float): El valor del primer operando.
            operandoB (int o float): El valor del segundo operando.
        """
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Método para sumar los operandos
    def sumar(self):
        """
        Suma los dos operandos y devuelve el resultado.

        Returns:
            int o float: La suma de operandoA y operandoB.
        """
        return self.operandoA + self.operandoB

    # Método para restar los operandos
    def resta(self):
        """
        Resta el operandoB del operandoA y devuelve el resultado.

        Returns:
            int o float: La resta de operandoA y operandoB.
        """
        return self.operandoA - self.operandoB

    # Método para multiplicar los operandos
    def multiplicar(self):
        """
        Multiplica los dos operandos y devuelve el resultado.

        Returns:
            int o float: El producto de operandoA y operandoB.
        """
        return self.operandoA * self.operandoB

    # Método para dividir los operandos
    def dividir(self):
        """
        Divide el operandoA entre el operandoB y devuelve el resultado.

        Returns:
            float: El cociente de operandoA y operandoB.

        Raises:
            ZeroDivisionError: Si el operandoB es cero.
        """
        if operandoB == 0:
            raise ZeroDivisionError("No se puede dividir por cero")
        return self.operandoA / self.operandoB

# Creamos un objeto de la clase Aritmetica con los valores 30 y 27
aritmetica1 = Aritmetica(30, 27)

# Realizamos las operaciones y mostramos los resultados
print(f"La suma de los operandos es: {aritmetica1.sumar()}")
print(f"La resta de los operando es: {aritmetica1.resta()}")
print(f"La multiplicación de los operando es: {aritmetica1.multiplicar()}")
print(f"La división de los operando es: {aritmetica1.dividir():.2f}")