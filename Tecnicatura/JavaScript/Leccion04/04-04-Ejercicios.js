//Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar numero,tambien cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion);
//Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afteroon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/
let horaDia = 22;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night"
}
console.log(mensaje);
//Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
un error que se sobreescribe
*/

var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre = 'Natalia';
    console.log(nombre);
}
console.log(nombre); //Aqui no se leeel dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
//console.log(edad); //En la funcion funciono correctamente, en la estructura if fallo


/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = 'Ariel';
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento);


/*evitar repetir tu codigo*/
//let days = ['Lunes', 'Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];

let days = 'Sábado';
switch (days) {
    case "Lunes":
        console.log('hoy es '+days);
        break;
    case 'Martes':
        console.log('hoy es '+days);
        break;
    case 'Miercoles':
        console.log('Hoy es: '+days);
        break;
    case 'Jueves':
        console.log('Hoy es: '+days);
        break;
    case 'Viernes':
        console.log('Hoy es: '+days);
        break;
    case 'Sábado':
        console.log('hoy es '+days);
        break;
    case 'Domingo':
        console.log('hoy es: '+days);
        break;
    default:
        console.log("Error en el ingreso del día de la semana");
        break;

}

let days2 = ['Lunes', 'Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n-1];
}
console.log(getDay(5));



let mes1 = 'Enero';
switch (mes1) {
    case "Enero":
        console.log('Mes: '+mes1);
        break;
    case 'Febrero':
        console.log('Mes: '+mes1);
        break;
    case 'Marzo':
        console.log('Mes: '+mes1);
        break;
    case 'Abril':
        console.log('Mes: '+mes1);
        break;
    case 'Mayo':
        console.log('Mes: '+mes1);
        break;
    case 'Junio':
        console.log('Mes: '+mes1);
        break;
    case 'Julio':
        console.log('Mes: '+mes1);
        break;
    case 'Agosto':
        console.log('Mes: '+mes1);
        break;
    case 'Septiembre':
        console.log('Mes: '+mes1);
        break;
    case 'Octubre':
        console.log('Mes: '+mes1);
        break;
    case 'Noviembre':
        console.log('Mes: '+mes1);
        break;
    case 'Diciembre':
        console.log('Mes: '+mes1);
        break;
    default:
        console.log("Error en el ingreso del mes");
        break;
}

let mes3 = ['Enero', 'Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
function getMes(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return mes3[n-1];
}
console.log(getMes(5));