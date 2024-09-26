let x = 10; //variable de tipo primitiva
console.log(x.lenght);
console.log("Tipo primitivos");
//Objeto
let persona= {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    idioma: "es",
    get lang(){
    return this.idioma.toUpperCase()
    },
    nombreCompleto: function (){ //Método o función en JS
        return this.nombre+ " "+this.apellido;
    },
    set lang(lang){
        this.idioma = lang.toUpperCase(); //convierte las minúsculas a mayúsculas
    },
    get nombreEdad(){
    return "El nombre es: "+this.nombre+ ", su edad es: " +this.edad;
    }

}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");

let persona2 = new Object(); //Se debe crear un nuevo objeto en la memoria
persona2.nombre = "Juan";
persona2.direccion = "Calle falsa 123";
persona2.telefono = "695738598273";
console.log(persona2.telefono)
console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]); //Accedemos como si fuese un arreglo

//for in y accedemos al objeto ocmo si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log("Cambiamos y eliminamos un error")
persona.apellido= "Gomila"; //cambiamos dinámicamente el valor del objeto
//En vez de cambiar el valor agregué un apellido nuevo por error

persona.apellida= "Gomila"; //cambiamos dinámicamente el valor del objeto
delete persona.apellida; //borramos el error
console.log(persona)

//Formas distintas de imprimir un objeto
console.log("Formas distintas de imprimir un objeto")

//N*1 CONCATENAR cada valor de cada propiedad
console.log("Forma 1:")

console.log(persona.nombre+", "+persona.apellido)

//N*2 A TRAVÉS DEL CICLO FOR IN
console.log("Forma 2:")

for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
//N*3 Object.values
console.log("Forma 3:")

let personaArray= Object.values(persona);
console.log(personaArray);

//N*4 Utilizamos el método Json, stringfy
console.log("Forma 4:")

let personaString = JSON.stringify(persona);
console.log(personaString)

console.log(persona.nombreEdad);

console.log("Comenzamos con el método get y set para idiomas");
persona.lang = "en"
console.log(persona.lang);
function persona3(nombre="Luis",apellido,email){ //contructor
    this.nombre= nombre;
    this.apellido= apellido;
    this.email= email;
    this.nombreCompleto= function(){
        return this.nombre+" "+this.apellido;
    } 
}
let padre= new persona3("Leo","López","lopezl@gmail.com");
padre.nombre= "Lucas" //Modificamos el nombre 
padre.telefono= "2345678789876543"; //propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //utilizamos la función

let madre= new persona3("Laura","Báez","lbaez@gmail.com");
console.log(madre);
console.log(madre.nombreCompleto());
console.log(madre.telefono) //propiedad indefinida
//Diferentes formas de crear objetos
//Caso objeto 1
let miObjeto = new Object(); // esta opción es formal
//caso objeto 2
let miObjeto2 = {}; // esta opción es breve y recomendada
//caso String 1
let miCaddena1 =new String("Hola"); //Sintaxis formal
//caso String 2
let miCaddena2 ="Hola"; //Sintaxis simplificada y recomendada

//caso con números 1
let miNumero = new Number(1); //Formal, no recomendada
//caso con números 2
let miNumero2 = 1; // Recomendada

//caso 1 boolean
let miBoolean = new Boolean(false); //Formal
//caso 2 boolean
let miBoolean2 = false; //Formal

//caso 1 Arreglos
let miArreglo1 = new Array(); //Formal
//caso 2 Arreglos
let miArreglo2 = []; //Sintaxis recomendada

//caso 1 function
let miFuncion1 = new function(){}; //Todo despues de new se considera objeto

//caso 2 function
let miFuncion2 = function(){}; //simplificada y recomendada

//Uso de prototype
persona3.prototype.telefono = "2604123456";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "5492604123456";
console.log(madre.telefono)
//Uso de call
let persona4 = {
    nombre: "Juan",
    apellido: "Pérez",
    nombreCompleto2: function(titulo,telefono){
        return titulo+": "+ this.nombre+" "+this.apellido+" "+telefono;
        // return this.nombre+ " "+this.apellido;
    }
}
let persona5 = {
    nombre: "Carlos",
    apellido: "Lara",
}
console.log(persona4.nombreCompleto2("Lic","2604080809"))
console.log(persona4.nombreCompleto2.call(persona5, "Ing","2604652347"));

//Método Apply
let arreglo = ["ing", "2604652347"]
console.log(persona4.nombreCompleto2.apply(persona5,arreglo))
