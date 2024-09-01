// Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3.

const rango = [...Array(11).keys()]; // Crea un array con los números de 0 a 10.
for (let num of rango) { // Itera sobre el array usando for...of.
    if (num % 3 === 0) { // Verifica si el número es divisible entre 3.
        console.log(num); // Si es divisible, lo imprime.
    }
}

// Ejercicio 2: Crear un rango de 2 a 6 e imprimirlos.

let i = 2;
while (i <= 6) { // El bucle se ejecuta mientras i sea menor o igual a 6.
    console.log(i); // Imprime el valor actual de i.
    i++; // Incrementa i en 1 en cada iteración.
}

// Crear un rango de 3 a 10 pero con incremento de 2 en 2.

let j = 3;
do {
    console.log(j); // Imprime el valor actual de j.
    j += 2; // Incrementa j en 2 en cada iteración.
} while (j <= 10); // El bucle se ejecuta mientras j sea menor o igual a 10.

// Dada la siguiente lista, crear una nueva lista que solo incluya los números menores a 5 e imprimirla por consola.

const lista = [13, 1, 8, 3, 2, 5, 8];
const listaNueva = lista.filter(num => num < 5); //Usa el método filter para crear una nueva lista con los números menores a 5.
console.log(listaNueva); // Imprime la nueva lista filtrada.
