//CLASE 4
let x = 10; //variable de tipo primitiva
console.log(x.length);

console.log("Tipos primitivos");
//Creamo un objeto (persona)
let persona = {
    nombre: "Carlos", 
    apellido: "Gil",
    email: "cgi@gmail.com",
    edad: 30,
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido; //método o función en JavaScript
    }
        
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log("Ejecutando con un ojjeto");
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "45353535";
console.log(persona2.telefono);

console.log("Creamos un nuevo objeto");
//acceder a las propiedades de los objetos. Se accederá a los objetos como si fueran un arreglo.
console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

console.log("Usamos un ciclo for in");
//for in y accedemos al objeto como si fuera un arreglo
for(propieda in persona){
    console.log(propieda);
    console.log(persona[propieda]);
}

//como agregar y eliminar propiedades de un objeto. Cuando trbajamos con objetos een JavaScript 
//observamos que es muy flexible, muy sencillo
console.log("cambiamo y leiminamos un error");
persona.apellido = "Betancut"; //Cambiamos dinamicamente un valor del objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);

// las distintas formas de imprimir un objeto
// Numero1: es la mas sencilla: concatenar cada valor de cada porpiedad
console.log("Distina forma de imprimir un objeto: forma1")
console.log(persona.nombre+", "+persona.apellido);
console.log("Distina forma de imprimir un objeto: forma2");
//Numero 2: Através del ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
console.log("Distina forma de imprimir un objeto: forma3");
//Numero 3: La función object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizaremos el método JSON.stringify
console.log("Distina forma de imprimir un objeto: forma4");
let personaString = JSON.stringify(persona);
console.log(personaString);
