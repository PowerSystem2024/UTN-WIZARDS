//CLASE3
/*
Basicamente una función es un codigo reutilizable que se ejecutara cada
vez que sea llamada
*/

miFunsion(8, 2); // Esto se  le conoce como hosting

function miFunsion(a, b){
    //console.log("Sumamos: "+ (a+b));
    return a + b;
}

//Llamando la función
miFunsion(5, 4);

let resultado = miFunsion(6, 7);
console.log(resultado);

//FUNCIÓNES DE TIPO EXPRESIÓN
/*
funciones expresión o anónimas. La función puede ser asignada a una 
variable y así evitar poner un nombre a la función. En una función de 
tipo expresión se debe poner sí o sí el punto y coma debido a que va en 
una sóla línea y cada línea de código debe ser cerrada
*/

//DECLARAMOS UNA FUNCION DE TIPO EXPRESIÓN O ANONIMA
let x = function(a, b){ return a + b}; //necesita cierre con punto y coma
resultado = x(5, 6);//al llamarla se pone la vaiable y parentesis
console.log(resultado);

//FUNSIONES DE TIPO SELF Y INVOKING
/*
Las funsiónes de tipo self y invoking. en ell la función está definida pero
no se le asigna a ninguna variable. También es una función anónima, pero
se puede llamar a sí misma antes de cerrar la función con punto y coma.
Se llama a si misma al comienzo con parámetros y al final con los argumentos.
Ésta función no se puede reutilizar por que no se le esta asignando a ninguna
variable y tampoco se le asigna ningun nombre, sólo se manda a llamar así misma
una única vez.
*/

(function(a, b){
    console.log("Ejecutando la función: "+ (a + b));
})(9, 6);

//TIPOS DE DATOS DE UNA FUNCIÓN
/*
Una función es un tipo de dato. Las funciónes pueden ser descriptas como objetos.
Arguments sólo puede utilizarse dentro del bloque de la función, el método toString
es un método que nos permite comprobar que la funciones pueden ser descriptas
como objetos, convierte a la función en texto. Hay que recordad que la función
y método son exáctamente lo mismo.
*/

console.log(typeof miFunsion);
function miFunsionDos(a, b){
    console.log(arguments.length);
}

miFunsionDos(5, 7);

//toString
var miFunsionTexto = miFunsionDos.toString();
console.log(miFunsionTexto);

//FUNCIÓNES FLECHA
/*
Las funcióne flechas son equivalentes a la funciónes expresión. Su símbolo
se construye con dos caracteres: el de = y el de mayor que..., el operador queda
de esta manera: =>, recordar que ésta función no utiliza la palabra reservada function,
ni la palabra reservada return y tampoco usa llaves
*/

const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); // Agignamos el valor a una variable
console.log(resultado);

//ARGUMENTOS Y PARAMETROS
/*
Cuando se define una función la variables que recibira se conocen como
parámetros y cuando se llama la función se pone los argumentos que son 
valores de los parámetros.
*/
//Función de tipo exprecion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //muestra el parametro de: a
    console.log(arguments[1]); //muestra el parametro de: b
    
    return a + b + arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado);

//CONCEPTO HOISTING
/*
Ahora se vera lo que es sumar con todos los argumentos, en JavaScript, siempre
que no utilicemos la función en flecha, se puede aplicar el concepto de Hoisting,
es decir se puede usar la función en una parte del archivo antes de haberla declarado
*/

//Sumar todo los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; // Arguments es para arreglos
    }
    return suma;
} 

//PASO POR VALOR
/*
Paso por valor se dá cuando utilizamos tipos que no son objetos; como por ejemplo:
tipo numérico, tipo booleano, etc. en el paso por valor la variable no subre ningún cambio,
la variable sólo pasó una copia.
*/

let k = 10;
function cambiarValor(a){ //Paso por valor
    a = 20;
}

cambiarValor(k);
console.log(k);

//PASO POR REFERENCIA
/*
Paso por referencia primero debe crearce un objeto, debido a que a un objeto
se lo puede asociar a propiedades y métodos. A la función o la método le
pasamos la referencia hexadecimal del espacio de memoria donde está alojado 
el objeto
*/

//paso por referencia
const persona = {
    nombre: "Juan",
    apellido: "Lepez"
}
console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio";
    p1.apellido = "Perez";
}

cambiarValorObjeto(persona);
console.log(persona);