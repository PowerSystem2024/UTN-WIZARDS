// --- CREACIÓN DE ARRAY O ARREGLOS ---

// Forma recomendada de declarar un arreglo (array) en JavaScript.
// Se crea un array llamado 'autos' con tres elementos iniciales.
let autos = ["Ferrari", "Volkswagen", "BMW"];
console.log(autos); // Imprime el array completo en la consola.


// --- RECORREMOS LOS ELEMENTOS DEL ARREGLO ---

// Imprime el primer elemento del array (índice 0).
console.log(autos[0]);  // Ferrari

// Imprime el tercer elemento del array (índice 2).
console.log(autos[2]);  // BMW

// Recorre el array con un bucle for. 'i' es el índice del array.
// El bucle se ejecuta desde 'i = 0' hasta 'i < autos.length', donde '.length' es la longitud del array.
for (let i = 0; i < autos.length; i++) {
    // Imprime el índice (comenzando en 1) y el elemento correspondiente del array.
    console.log(`${i + 1}: ${autos[i]}`);
}


// --- MODIFICAMOS LOS ELEMENTOS DEL ARREGLO ---

// Cambia el primer elemento del array (índice 0) a "Porsche".
autos[0] = "Porsche";

// Cambia el segundo elemento del array (índice 1) a "Volvo".
autos[1] = "Volvo";

// Imprime el array actualizado con los cambios.
console.log(autos);


// --- AGREGAR NUEVOS VALORES AL ARRAY ---

// Agrega "Audi" al final del array usando el método 'push'.
autos.push("Audi");
console.log(autos); // Imprime el array con el nuevo elemento agregado.

// Otra forma de agregar elementos al final del array usando su longitud.
// 'autos.length' devuelve el número de elementos en el array, por lo que el nuevo valor se coloca en la última posición.
autos[autos.length] = "Fiat";
console.log(autos); // Imprime el array con "Fiat" agregado al final.

// CUIDADO: Esta forma puede crear huecos en el array si se elige un índice mayor que la longitud actual.
// Aquí se agrega "Renault" en la posición 6, dejando huecos vacíos (undefined) entre las posiciones 4 y 5.
autos[6] = "Renault";
console.log(autos); // Muestra los elementos del array, incluyendo los huecos vacíos.


// --- ELIMINAR EL ÚLTIMO ELEMENTO ---

// Elimina el último elemento del array usando el método 'pop'.
autos.pop();
console.log(autos); // Imprime el array después de eliminar el último elemento.


// --- CÓMO PREGUNTAR SI ES UN ARRAY ---

// Creamos una variable llamada 'prueba' que contiene un valor numérico.
let prueba = 1;

// Verifica si 'autos' es un array utilizando 'Array.isArray()', que devuelve true si lo es.
console.log(Array.isArray(autos));   // true

// Verifica si 'prueba' es un array utilizando 'Array.isArray()', que devuelve false ya que 'prueba' es un número.
console.log(Array.isArray(prueba));  // false

// Otra forma de verificar si 'autos' es un array, usando el operador 'instanceof'.
console.log(autos instanceof Array); // true
