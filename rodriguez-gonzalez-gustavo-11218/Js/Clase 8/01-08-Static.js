class Persona {
  static contadorPersona = 0; // Atributo estático que lleva la cuenta de las instancias de Persona
  // email = 'Valor default email'; // Atributo no estático (comentado)

  static get MAX_OBJ() {
    // Método que simula una constante
    return 5; // Retorna el valor máximo de objetos permitidos
  }

  constructor(nombre, apellido) {
    this._nombre = nombre; // Asigna el nombre a la propiedad privada _nombre
    this._apellido = apellido; // Asigna el apellido a la propiedad privada _apellido
    if (Persona.contadorPersona < Persona.MAX_OBJ) {
      // Verifica si el contador es menor que el máximo permitido
      this.idPersona = ++Persona.contadorPersona; // Incrementa y asigna el ID de la persona
    } else {
      console.log("Se ha superado el máximo de objetos permitidos"); // Mensaje si se supera el límite
    }

    /*
      * Incremento del contador: Cada vez que se crea una nueva instancia de Persona, dentro del constructor, se incrementa el valor de 
      contadorPersona usando Persona.contadorPersona++. Esto lleva un control de cuántas instancias de Persona se han 
      creado.
      * contadorPersona es una propiedad estática que lleva la cuenta de cuántos objetos de la clase Persona o Empleado se han 
      creado.
      * Los métodos estáticos son llamados desde la clase, no desde las instancias.
      */
    // console.log('Se incrementa el contador: ' + Persona.contadorPersona) // Mensaje comentado
  }

  // Método getter para obtener el nombre
  get nombre() {
    return this._nombre; // Devuelve el valor del atributo _nombre
  }

  // Método getter para obtener el apellido
  get apellido() {
    return this._apellido; // Devuelve el valor del atributo _apellido
  }

  // Método setter para establecer un nuevo nombre
  set nombre(nombre) {
    this._nombre = nombre; // Asigna un nuevo valor al atributo _nombre
  }

  // Método setter para establecer un nuevo apellido
  set apellido(apellido) {
    this._apellido = apellido; // Asigna un nuevo valor al atributo _apellido
  }

  nombreCompleto() {
    return this.idPersona + " " + this._nombre + " " + this._apellido; // Retorna el ID y el nombre completo
  }
  // Sobreescribimos el método de la clase padre (Object)
  toString() {
    return this.nombreCompleto(); // Devuelve la representación en string del objeto
  }

  // --------------- Métodos Estáticos ----------------------------
  static saludar() {
    console.log("Saludos desde este método estático"); // Saludo desde un método estático
  }

  static saludar2(persona) {
    console.log(persona.nombre + " " + persona.apellido); // Saluda a la persona mostrando su nombre y apellido
  }
}

class Empleado extends Persona {
  // Clase hija que hereda de Persona
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido); // Llama al constructor de la clase padre (Persona) para inicializar _nombre y _apellido
    this._departamento = departamento; // Inicializa el atributo privado _departamento
  }

  // Método getter para obtener el departamento
  get departamento() {
    return this._departamento; // Devuelve el valor del atributo _departamento
  }

  // Método setter para establecer un nuevo departamento
  set departamento(departamento) {
    this._departamento = departamento; // Asigna un nuevo valor al atributo _departamento
  }

  // Sobreescritura: modificar el comportamiento de algún método definido en la clase padre
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento; // Retorna el nombre completo incluyendo el departamento
  }
}

// Creación de un empleado
let empleado1 = new Empleado("Valeria", "González", "Sistemas"); // Crea un objeto Empleado
console.log(empleado1); // Muestra el objeto empleado1
console.log(empleado1.nombreCompleto()); // Muestra el nombre completo del empleado

let persona1 = new Persona("Martin", "Pérez"); // Crea un objeto Persona
persona1.nombre = "Juan Carlos"; // Cambia el nombre de persona1
console.log(persona1); // Muestra el objeto persona1

// Object.prototype.toString: Esta es la manera de acceder a atributos y métodos de manera dinámica
console.log(empleado1.toString()); // Muestra la representación en string de empleado1
console.log(persona1.toString()); // Muestra la representación en string de persona1

// Los métodos estáticos se asocian con una clase pero no con un objeto, no se utiliza desde el objeto
// persona1.saludar(); // persona1.saludar no es una función
Persona.saludar(); // Llama al método estático saludar de Persona
Persona.saludar2(persona1); // Llama al método estático saludar2 pasando persona1

// Estos solo se van a mostrar desde la consola
// Heredamos el método estático a la clase hija
Empleado.saludar(); // Llama al método estático saludar de Empleado
Empleado.saludar2(empleado1); // Llama al método estático saludar2 pasando empleado1

// console.log(persona1.contadorPersona); // Esta línea está comentada porque persona1 no tiene esa propiedad
console.log(Persona.contadorPersona); // Muestra el número total de instancias de Persona
// Desde la clase hija lo llamamos
console.log(Empleado.contadorPersona); // Muestra el número total de instancias de Empleado

// Atributo estático se asocia a la clase en sí
// Atributo estático se asocia solo a los objetos
console.log(persona1.email); // Muestra el valor del atributo email de persona1
// Accediendo al objeto de la clase hija
console.log(empleado1.email); // Muestra el valor del atributo email de empleado1
// console.log(Persona.email); // No es estático, no se puede acceder desde la clase en sí (comentado)
console.log(empleado1.toString()); // Muestra la representación en string de empleado1
console.log(persona1.toString()); // Muestra la representación en string de persona1
console.log(Persona.contadorPersona); // Muestra el total de instancias de Persona

let persona3 = new Persona("Carla", "Pertosi"); // Crea un nuevo objeto Persona
console.log(persona3.toString()); // Muestra la representación en string de persona3
console.log(Persona.contadorPersona); // Muestra el total de instancias de Persona

console.log(Persona.MAX_OBJ); // Muestra el valor máximo de objetos permitidos
// Persona.MAX_OBJ = 10; // No se puede modificar, ni alterar (comentado)

let persona4 = new Persona("Juan", "Orellana"); // Crea un nuevo objeto Persona
console.log(persona4.toString()); // Muestra la representación en string de persona4
let persona5 = new Persona("Ariel", "Salinas"); // Crea un nuevo objeto Persona
console.log(persona5.toString()); // Muestra la representación en string de persona5
let persona6 = new Persona("Romina", "Ojeda"); // Crea un nuevo objeto Persona
console.log(persona6.toString()); // Muestra la representación en string de persona6
