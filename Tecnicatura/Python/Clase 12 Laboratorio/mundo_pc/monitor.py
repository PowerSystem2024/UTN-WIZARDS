class Monitor:

    contador_monitores = 0

    def __init__(self, marca, tamano):
        Monitor.contador_monitores += 1
        self._id_monitores = Monitor.contador_monitores
        self._marca = marca
        self._tamano = tamano
        

    def __str__(self):
        return f'Id: {self._id_monitores}, Marca: {self._marca}, Tamaño: {self._tamano} '


if __name__ == '__main__':
    monitor1 = Monitor('HP', '15 Pulgadas')
    print(monitor1)
    monitor2 = Monitor('Lenovo', '27 pulgadas')
    print(monitor2)
