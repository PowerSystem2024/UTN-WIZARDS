// Métodos get y set
// Formas de llamar a una función

// Método Get
// Get -> Obtener
// Permite acceder a los valores de las propiedades
let persona = {
  nombre: "Carlos",
  apellido: "González",
  email: "carlosg@gmail.com",
  edad: 25,
  idioma: "en",
  get lang() {
    // toUpperCase() -> Convierte todos los caracteres alfabéticos en un
    //              String para convertirlos a mayúscula
    return this.idioma.toUpperCase();
  },
  set lang(lang) {
    this.idioma = lang.toUpperCase();
  },
  nombreCompleto: function () {
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    return "El nombre es: " + this.nombre + ", la edad es: " + this.edad;
  },
};
console.log("Comienza el uso del método get");
console.log(persona.nombreEdad);

// Método Set
// Set -> Establecer o Modificar
// Permite modificar a los valores de los atributos de los objetos

console.log("Comienza el uso del método get y set para idiomas");
persona.lang = "fr";
console.log(persona.lang);

// Constructores de objetos
// Es un método para la creación de objetos
// Es una función especial que se llama a través de la palabra reservada 'new' para reservar
// espacio en la memoria del objeto que se va a crear

// Definición de una función
// Es recomendable que las funciones se creen con mayúscula
// Dentro de lo que es el constructor, se puede hacer una pre-asignación
function Persona(nombre, apellido, email) {
  // Constructor
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  // Agregar métodos al constructor del objeto
  this.nombreCompleto = function () {
    return this.nombre + " " + this.apellido;
  };
}
let padre = new Persona("Javier", "Pérez", "javierp@gmail.com");
// padre.nombre = 'Francisco'; <- se puede modificar sin problemas
padre.telefono = "54 11 1234-5678"; // Propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona("Lucía", "Martínez", "luciam@gmail.com");
console.log(madre);
console.log(madre.telefono); // La propiedad no está definida
console.log(madre.nombreCompleto());

// Distintas formas de crear objetos
// 1. Caso Objeto - Sintaxis formal
let miObjeto1 = new Object();
// 2. Caso Objeto - Sintaxis simplificada y recomendada
let miObjeto2 = {};

// 1. Caso String - Sintaxis formal
// let miCadena1 = new('Hola');
// 2. Caso String - Sintaxis simplificada y recomendada
let miCadena2 = "Hola";

// 1. Caso con Números - Sintaxis formal (No recomendable)
let miNumero = new Number(1);
// 2. Caso con Números - Sintaxis recomendada
let miNumero2 = 1;

// 1. Caso Booleano - Sintaxis formal
let miBoolean = new Boolean(false);
// 2. Caso Booleano - Sintaxis recomendada
let miBoolean2 = false;

// 1. Caso Arreglos - Sintaxis formal
let miArreglo1 = new Array();
// 2. Caso Arreglos - Sintaxis recomendada
let miArreglo2 = [];

// 1. Caso Funciones - Todo después de new es considerado objeto
let miFuncion1 = new (function () {})();
// 2. Caso Funciones - Sintaxis simplificada y recomendada
let miFuncion2 = function () {};

// El uso de prototype
Persona.prototype.telefono = "54 11 9876-5432";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "54 11 8765-4321";
console.log(madre.telefono);

// El uso de call
// Permite llamar a un método desde un objeto que se encuentra dentro de otro objeto
let persona2 = {
  nombre: "Esteban",
  apellido: "López",
  nombreCompleto2: function (titulo, telefono) {
    return titulo + ": " + this.nombre + " " + this.apellido + ", " + telefono;
    //return this.nombre+' '+this.apellido;
  },
};

let persona3 = {
  nombre: "Claudia",
  apellido: "Sánchez",
};
console.log(persona2.nombreCompleto2("Ingeniero", "54 11 2345-6789"));
console.log(
  persona2.nombreCompleto2.call(persona3, "Ingeniera", "54 11 8765-6789")
);

// El uso de apply
// Permite llamar a un método desde un objeto que no tiene definido cierto método
let arreglo = ["Ingeniera", "54 11 8765-6789"];
console.log(persona2.nombreCompleto2.apply(persona3, arreglo));
