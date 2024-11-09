
<script setup>
import { ref } from 'vue';
const fechacolor = ref ([]);
fechacolor.value= [
    {color: "#41516c"},
    {color: "#FBCA3E"},
    {color: "#E24A68"},
    {color: "#1B5F8C"},
    {color: "#4CADAD"}
];
const educacion = ref ([]);
educacion.value = [
    {fecha: "2024", title: "Técnicatura Universitaria en Programacion", descripcion: "Incumbencias Profecionales: Operacion y programacion de computadoras, desarrollo de programa en distintos lenguajes, analisis y control de sistema informaticos", enlace:"https://www.youtube.com/"},
    {fecha: "2023", title: "Ingenieria en Sistemas UdeMM", descripcion:"Actualmente me encuentro cursando el segundo año de la carrera de referencia, ampliando conocimientos en las bases de los sistemas y el desarrollo de aplicaciones, ganando aptitudes en el manerjo de herramietas como UML", enlace: "https://udemm.edu.ar"},
    {fecha: "2022", title: "Intership en Desarrollo web", descripcion: "Realice una pasantia en ABC solutions, contribuyendo en la creacion de interfaces de usuarios y optimizaciión de sitios web", enlace: "http:www.direccion.com"},
    {fecha: "2021", title: "Proyecto personal - Aplicacion de Gestion de tareas", descripcion: "Desarrolle una aplicacion apra la gestión de tareas diarias usando HTML, CSS y JavaScript, implementando funcionalidades como lista de tareas y recordatorios", enlace: "http:www.direccion.com"},
    {fecha: "2020", title: "Curso de instruccion a la Programación", descripcion: "Compelte u ncurso en liena sobre fundamentos de programcion, donde aprendí leanguajes como python y java", enlace: "http:www.direccion.com"}
]
</script>

<template>
    <ul>
        <li v-for="(item, index) in educacion" :key="index" :style="{'--fecha-color': fechacolor[index].color}">
            <div class="fecha">{{ item.fecha }}</div>
            <h3 class="title">{{ item.title }}</h3>
            <div class="descripcion">{{ item.descripcion }}</div>
            <!--Aqui vemos en el uso de b-vind (:) que bindeamos el atributo href de html en el item.enlace-->
            <a class="enlace" :href="item.enlace" target="_blank">saber más</a>
        </li>
    </ul>
</template>

<style scoped>
/*Estilos generales*/
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap");
*,
*::before,
*::after {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Estilo para el cuerpo de la página */
body {
    --color: rgba(30, 30, 30);
    --bgcolor: rgba(245, 245, 245);
    min-height: 100vh;
    display: grid;
    align-content: center;
    gap: 2rem;
    font-family: "Poppins", sans-serif;
    color: var(--color);
    background: var(--bgcolor);
}

/*Estilo para la lista */
ul {
    margin-top: 2rem;
    --col-gap: 2rem;
    --row-gap: 4rem;
    --line-w: 0.25rem;
    display: grid;
    grid-template-columns: 1fr var(--line-w) 1fr; /* Define tres columnas */
    column-gap: var(--col-gap);
    list-style: none;
    width: min(60rem, 90%);
    margin-inline: auto;
    position: relative;
}

/* Estilo para la línea vertical de la línea de tiempo */
ul::before {
    content: "";
    grid-column: 2;
    grid-row: 1 / span 20;
    background: rgb(200, 200, 200);
    width: var(--line-w);
    border-radius: calc(var(--line-w) / 2);
}

/* Estilo para los elementos de la lista con espacio alternado */
ul li:not(:last-child) {
    margin-bottom: var(--row-gap);
}

/* Estilo para cada ítem de la lista */
ul li {
    --inlineP: 1.5rem;
    margin-inline: var(--inlineP);
    display: grid;
    grid-template-rows: min-content min-content min-content;
    position: relative;
}

/* Alineación alternada para los ítems */
ul li:nth-child(odd) {
    grid-column: 1;
    margin-top: 2rem; /* Desfase para los ítems impares */
}

ul li:nth-child(even) {
    grid-column: 3;
    margin-bottom: 2rem; /* Desfase para los ítems pares */
}

/* Estilo para la fecha */
ul li .fecha {
    --dateH: 3rem;
    height: var(--dateH);
    margin-inline: calc(var(--inlineP) * -1);
    text-align: center;
    background-color: var(--fecha-color);
    color: white;
    font-size: 1.25rem;
    font-weight: 700;
    display: grid;
    place-content: center;
    position: relative;
    border-radius: calc(var(--dateH) / 2) 0 0 calc(var(--dateH) / 2);
}

/* Estilo para el triángulo y el círculo de conexión en elementos impares */
ul li:nth-child(odd) .fecha::before {
    content: "";
    width: var(--inlineP);
    aspect-ratio: 1;
    background: var(--fecha-color);
    background-image: linear-gradient(rgba(0, 0, 0, 0.2) 100%, transparent);
    position: absolute;
    top: 100%;
    clip-path: polygon(0 0, 100% 0, 100% 100%);
    left: 0;
}

ul li:nth-child(odd) .fecha::after {
    content: "";
    position: absolute;
    width: 1rem;
    aspect-ratio: 1;
    background: var(--bgcolor);
    border: 0.3rem solid var(--fecha-color);
    border-radius: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    left: calc(100% + var(--col-gap) + var(--line-w) / 2);
}

/* Estilos para elementos pares */
ul li:nth-child(even) .fecha {
    border-radius: 0 calc(var(--dateH) / 2) calc(var(--dateH) / 2) 0;
    background-color: var(--fecha-color); /* Color para elementos pares */
}

ul li:nth-child(even) .fecha::before {
    content: "";
    width: var(--inlineP);
    aspect-ratio: 1;
    background: var(--fecha-color);
    background-image: linear-gradient(rgba(0, 0, 0, 0.2) 100%, transparent);
    position: absolute;
    top: 100%;
    clip-path: polygon(0 0, 100% 0, 0 100%);
    right: 0;
}

/* Estilos de título y descripción */
ul li .title,
ul li .descripcion {
    background: var(--bgcolor);
    position: relative;
    padding-inline: 1.5rem;
}

ul li .title {
    overflow: hidden;
    padding-block-start: 1.5rem;
    padding-block-end: 1rem;
    font-weight: 500;
}

ul li .descripcion {
    padding-block-end: 1.5rem;
    font-weight: 300;
}

/* Sombras en el título y descripción */
ul li .title::before,
ul li .descripcion::before {
    content: "";
    position: absolute;
    width: 90%;
    height: 0.5rem;
    background: rgba(0, 0, 0, 0.3);
    left: 50%;
    border-radius: 50%;
    filter: blur(4px);
    transform: translate(-50%, 50%);
}

ul li .title::before {
    bottom: calc(100% + 0.125rem);
}

ul li .descripcion::before {
    z-index: -1;
    bottom: 0.25rem;
}

/* Colores pastel para cada año */
ul li:nth-child(1) .fecha { --fecha-color: #D4A5A5; /* Rosa pastel */ }
ul li:nth-child(2) .fecha { --fecha-color: #BFA5D4; /* Lila pastel */ }
ul li:nth-child(3) .fecha { --fecha-color: #F3B4D4; /* Rosa claro */ }
ul li:nth-child(4) .fecha { --fecha-color: #D4A5B5; /* Lila rosado */ }
ul li:nth-child(5) .fecha { --fecha-color: #d1a9f1; /* Lila rosado */ }

/* Media query para pantallas anchas */
@media (min-width: 40rem) {
    ul {
        grid-template-columns: 1fr var(--line-w) 1fr;
    }
    ul::before {
        grid-column: 2;
    }
}
</style>
