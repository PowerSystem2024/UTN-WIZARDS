// let persona3 = new Persona('Carla', 'Ponce'); // Esto no se debe hacer: Persona no está definido

class Persona {
  // Clase padre
  constructor(nombre, apellido) {
    this._nombre = nombre; // Asigna el nombre a la propiedad privada _nombre
    this._apellido = apellido; // Asigna el apellido a la propiedad privada _apellido
  }

  get nombre() {
    return this._nombre; // Método getter para obtener el nombre
  }

  set nombre(nombre) {
    this._nombre = nombre; // Método setter para modificar el nombre
  }

  get apellido() {
    return this._apellido; // Método getter para obtener el apellido
  }

  set apellido(apellido) {
    this._apellido = apellido; // Método setter para modificar el apellido
  }

  nombreCompleto() {
    return this._nombre + " " + this._apellido; // Retorna el nombre completo concatenando nombre y apellido
  }
  // Sobreescribiendo el método de la clase padre (Object)
  toString() {
    // Regresa un string
    // Se aplica el polimorfismo que significa = múltiples formas en tiempo de ejecución
    // El método que se ejecuta depende si es una referencia de tipo padre o hija
    return this.nombreCompleto(); // Retorna el nombre completo usando el método de la clase padre
  }
}

class Empleado extends Persona {
  // Clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido); // Llama al constructor de la clase padre
    this._departamento = departamento; // Asigna el departamento a la propiedad privada _departamento
  }

  get departamento() {
    return this._departamento; // Método getter para obtener el departamento
  }

  set departamento(departamento) {
    this.departamento = departamento; // Método setter para modificar el departamento
  }

  // Sobreescritura
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento; // Retorna el nombre completo incluyendo el departamento
  }
}

let persona1 = new Persona("Lucas", "Mendoza"); // Crea un objeto Persona con nombre 'Lucas' y apellido 'Mendoza'
console.log(persona1.nombre); // Muestra el nombre de persona1
persona1.nombre = "Juan Carlos"; // Cambia el nombre de persona1 a 'Juan Carlos'
console.log(persona1.nombre); // Muestra el nuevo nombre de persona1

let persona2 = new Persona("Sofía", "Torres"); // Crea un objeto Persona con nombre 'Sofía' y apellido 'Torres'
console.log(persona2.nombre); // Muestra el nombre de persona2
persona2.nombre = "Maria Laura"; // Cambia el nombre de persona2 a 'Maria Laura'
console.log(persona2.nombre); // Muestra el nuevo nombre de persona2

let empleado1 = new Empleado("Ricardo", "Vega", "Desarrollo"); // Crea un objeto Empleado con nombre 'Ricardo', apellido 'Vega' y departamento 'Desarrollo'
console.log(empleado1); // Muestra el objeto empleado1
console.log(empleado1.nombreCompleto()); // Muestra el nombre completo de empleado1 incluyendo el departamento

// Object.prototype.toString // Esta es la manera de acceder a atributos y métodos de manera dinámica
console.log(empleado1.toString()); // Muestra la representación en string de empleado1 (polimorfismo)
console.log(persona1.toString()); // Muestra la representación en string de persona1 (polimorfismo)
