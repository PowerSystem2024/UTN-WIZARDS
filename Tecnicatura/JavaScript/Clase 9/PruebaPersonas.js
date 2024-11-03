// Clase base Persona
class Persona {
  // Contador estático para asignar un ID único a cada persona
  static contadorPersona = 0;

  // Constructor que inicializa el nombre, apellido y edad de la persona
  constructor(nombre, apellido, edad) {
    this._idPersona = ++Persona.contadorPersona; // Incrementa y asigna un ID único
    this._nombre = nombre; // Inicializa el nombre
    this._apellido = apellido; // Inicializa el apellido
    this._edad = edad; // Inicializa la edad
  }

  // Getters para acceder a los atributos privados
  get idPersona() {
    return this._idPersona; // Devuelve el ID de la persona
  }

  get nombre() {
    return this._nombre; // Devuelve el nombre de la persona
  }

  get apellido() {
    return this._apellido; // Devuelve el apellido de la persona
  }

  get edad() {
    return this._edad; // Devuelve la edad de la persona
  }

  // Setters para modificar los atributos privados
  set nombre(nombre) {
    this._nombre = nombre; // Establece un nuevo nombre
  }

  set apellido(apellido) {
    this._apellido = apellido; // Establece un nuevo apellido
  }

  set edad(edad) {
    this._edad = edad; // Establece una nueva edad
  }

  // Método para representar la información de la persona en forma de cadena
  toString() {
    return `${this._idPersona} ${this._nombre} ${this._apellido} ${this._edad}`; // Devuelve una cadena con todos los datos de la persona
  }
}

// Clase Empleado que hereda de Persona
class Empleado extends Persona {
  // Contador estático para asignar un ID único a cada empleado
  static contadorEmpleado = 0;

  // Constructor que inicializa los atributos de empleado
  constructor(nombre, apellido, edad, sueldo) {
    super(nombre, apellido, edad); // Llama al constructor de la clase base
    this._idEmpleado = ++Empleado.contadorEmpleado; // Incrementa y asigna un ID único
    this._sueldo = sueldo; // Inicializa el sueldo
  }

  // Getters para acceder a los atributos privados de Empleado
  get idEmpleado() {
    return this._idEmpleado; // Devuelve el ID del empleado
  }

  get sueldo() {
    return this._sueldo; // Devuelve el sueldo del empleado
  }

  // Setter para modificar el sueldo
  set sueldo(sueldo) {
    this._sueldo = sueldo; // Establece un nuevo sueldo
  }

  // Método para representar la información del empleado en forma de cadena
  toString() {
    return `${super.toString()} ${this._idEmpleado} ${this._sueldo}`; // Devuelve una cadena con todos los datos del empleado
  }
}

// Clase Cliente que hereda de Persona
class Cliente extends Persona {
  // Contador estático para asignar un ID único a cada cliente
  static contadorCliente = 0;

  // Constructor que inicializa los atributos de cliente
  constructor(nombre, apellido, edad, fechaRegistro) {
    super(nombre, apellido, edad); // Llama al constructor de la clase base
    this._idCliente = ++Cliente.contadorCliente; // Incrementa y asigna un ID único
    this._fechaRegistro = fechaRegistro; // Inicializa la fecha de registro
  }

  // Getters para acceder a los atributos privados de Cliente
  get idCliente() {
    return this._idCliente; // Devuelve el ID del cliente
  }

  get fechaRegistro() {
    return this._fechaRegistro; // Devuelve la fecha de registro del cliente
  }

  // Setter para modificar la fecha de registro
  set fechaRegistro(fechaRegistro) {
    this._fechaRegistro = fechaRegistro; // Establece una nueva fecha de registro
  }

  // Método para representar la información del cliente en forma de cadena
  toString() {
    return `${super.toString()} ${this._idCliente} ${this._fechaRegistro}`; // Devuelve una cadena con todos los datos del cliente
  }
}

// Prueba clase Persona
let persona1 = new Persona("Ana", "Gonzalez", 29); // Crea una nueva instancia de Persona
console.log(persona1.toString()); // Imprime la información de la persona

let persona2 = new Persona("Luis", "Fernandez", 34); // Crea otra instancia de Persona
console.log(persona2.toString()); // Imprime la información de la persona

// Prueba clase Empleado
let empleado1 = new Empleado("Sofia", "Martinez", 25, 6000); // Crea una nueva instancia de Empleado
console.log(empleado1.toString()); // Imprime la información del empleado

let empleado2 = new Empleado("Carlos", "Lopez", 45, 9000); // Crea otra instancia de Empleado
console.log(empleado2.toString()); // Imprime la información del empleado

// Prueba clase Cliente
let cliente1 = new Cliente("Elena", "Romero", 50, new Date()); // Crea una nueva instancia de Cliente
console.log(cliente1.toString()); // Imprime la información del cliente

let cliente2 = new Cliente("Diego", "Castro", 38, new Date()); // Crea otra instancia de Cliente
console.log(cliente2.toString()); // Imprime la información del cliente
