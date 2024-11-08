// Definición de la clase Persona
class Persona {
  // Clase padre
  // Constructor que inicializa los atributos nombre y apellido
  constructor(nombre, apellido) {
    this._nombre = nombre; // Almacena el nombre en la propiedad privada _nombre
    this._apellido = apellido; // Almacena el apellido en la propiedad privada _apellido
  }

  // Método getter para obtener el nombre
  get nombre() {
    return this._nombre; // Retorna el valor de la propiedad _nombre
  }

  // Método setter para establecer un nuevo nombre
  set nombre(nombre) {
    this._nombre = nombre; // Asigna un nuevo valor a la propiedad _nombre
  }

  // Método getter para obtener el apellido
  get apellido() {
    return this._apellido; // Retorna el valor de la propiedad _apellido
  }

  // Método setter para establecer un nuevo apellido
  set apellido(apellido) {
    this._apellido = apellido; // Asigna un nuevo valor a la propiedad _apellido
  }
}

// Definición de la clase Empleado que hereda de Persona
class Empleado extends Persona {
  // Clase hijo
  // Constructor que inicializa los atributos nombre, apellido y departamento
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido); // Llama al constructor de la clase padre para inicializar nombre y apellido
    this._departamento = departamento; // Almacena el departamento en la propiedad privada _departamento
  }

  // Método getter para obtener el departamento
  get departamento() {
    return this._departamento; // Retorna el valor de la propiedad _departamento
  }

  // Método setter para establecer un nuevo departamento
  set departamento(departamento) {
    this._departamento = departamento; // Asigna un nuevo valor a la propiedad _departamento
  }
}

// Creación de una instancia de Persona
let persona1 = new Persona("Gabriel", "Martínez"); // Se crea un nuevo objeto persona1 con nombre y apellido
console.log(persona1.nombre); // Muestra el nombre inicial: Gabriel
persona1.nombre = "Alejandro"; // Cambia el nombre a 'Alejandro'
console.log(persona1.nombre); // Muestra el nuevo nombre: Alejandro

console.log(persona1.apellido); // Muestra el apellido inicial: Martínez
persona1.apellido = "Hernández"; // Cambia el apellido a 'Hernández'
console.log(persona1.apellido); // Muestra el nuevo apellido: Hernández
// console.log(persona1);  // Descomentar para ver la información completa de persona1

// Creación de otra instancia de Persona
let persona2 = new Persona("Lucía", "González"); // Se crea un nuevo objeto persona2 con nombre y apellido
console.log(persona2.nombre); // Muestra el nombre inicial: Lucía
persona2.nombre = "Sofía"; // Cambia el nombre a 'Sofía'
console.log(persona2.nombre); // Muestra el nuevo nombre: Sofía

console.log(persona1.apellido); // Muestra el apellido actual de persona1: Hernández
persona1.apellido = "Ramírez"; // Cambia el apellido a 'Ramírez'
console.log(persona1.apellido); // Muestra el nuevo apellido: Ramírez
// console.log(persona2); // Descomentar para ver la información completa de persona2

// Creación de una instancia de Empleado
let empleado1 = new Empleado("Ricardo", "Sánchez", "Recursos Humanos"); // Se crea un nuevo objeto empleado1 con nombre, apellido y departamento
console.log(empleado1); // Muestra la información completa de empleado1
console.log(empleado1.nombre); // Muestra el nombre del empleado: Ricardo
