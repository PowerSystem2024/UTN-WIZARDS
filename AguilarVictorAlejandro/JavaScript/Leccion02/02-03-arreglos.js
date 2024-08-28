//Clase 2
//Arreglo es de tipo objeto
//Creación de array o arreglos
//let autos = new Array("Ferrari", "Renault", "BMW"); esta es la sintaxis vieja

const autos = ["Ferrari", "Renault", "BMW"];  //BAsico para declarar un arreglo
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+" : "+autos[i]);
}

// Modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

//Agregamos nuevos valores al arreglo
autos.push("Audi"); // Agregamos el elemento al final del arreglo
console.log(autos);

//Otra formas de agregar elementos al arreglo
autos[autos.length] = "Porche"
console.log(autos);

//Tercera forma de agregar elementos teniendo CUIDADO
autos[6] = "renault";
console.log(autos);

// Como preguntar si es una Array o arreglo
console.log(Array.isArray(autos)); // Devuelve un resultado booleano

console.log(autos instanceof Array); //Pregutamos si la variable es una instancia de la clase Array
