
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
    {fecha: "2024", title: "Técnicatura Universitaria en Programacion", descripcion: "Cursando en UTN San Rafael", enlace:"https://www.frsr.utn.edu.ar"},
    {fecha: "2023", title: "Ingenieria en Sistemas", descripcion:"Hasta tercer año completo", enlace: "https://udemm.edu.ar/carreras/ingenieria/"},
    {fecha: "2023", title: "Experto Universitario en Hacking Etico", descripcion: "Curso completo sobre seguridad en empresas", enlace: "https://www.frba.utn.edu.ar/"},
    {fecha: "2020", title: "Contador Público Nacional", descripcion: "Cursado completo", enlace: "https://www.unq.edu.ar/"},
    {fecha: "2013", title: "Bachiller en Gestión Empresarial", descripcion: "Centro de Educación Media N°89", enlace: ""}
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
/* Reset and General Styles */
*,
*::before,
*::after {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    --color: #FFFFFF; /* Texto en blanco */
    --bgcolor: #0D0D0D; /* Fondo oscuro */
    font-family: "Poppins", sans-serif;
    color: var(--color);
    background: var(--bgcolor);
}

/* Style for the list */
ul {
    margin-top: 2rem;
    display: grid;
    grid-template-columns: 0.25rem 1fr;
    column-gap: 2rem;
    list-style: none;
    width: min(60rem, 90%);
    margin-inline: auto;
}

/* Vertical connecting line */
ul::before {
    content: "";
    grid-column: 1;
    grid-row: 1 / span 20;
    background: rgba(255, 255, 255, 0.2); /* Lighter line color */
    border-radius: 0.125rem;
}

/* List items */
ul li {
    grid-column: 2;
    margin-bottom: 2rem;
    display: grid;
    grid-template-rows: min-content min-content min-content;
}

/* Date section */
ul li .fecha {
    background-color: var(--fecha-color);
    color: #FFFFFF;
    font-size: 1.25rem;
    font-weight: 700;
    text-align: center;
    display: grid;
    place-content: center;
    border-radius: 1.5rem 0 0 1.5rem;
    padding: 0.5rem 1rem;
    position: relative;
}

/* Date connector circle */
ul li .fecha::after {
    content: "";
    position: absolute;
    width: 1rem;
    height: 1rem;
    background: #0D0D0D;
    border: 0.3rem solid var(--fecha-color);
    border-radius: 50%;
    top: 50%;
    transform: translate(50%, -50%);
    right: calc(100% + 1rem);
}

/* Title and description */
ul li .title {
    font-size: 1.1rem;
    font-weight: 600;
    padding: 1rem 0;
}

ul li .descripcion {
    font-size: 1rem;
    font-weight: 300;
    padding-bottom: 1rem;
    color: rgba(255, 255, 255, 0.75); /* Lighter text color for description */
}

/* Links */
ul li .enlace {
    color: #3B82F6;
    text-decoration: none;
    font-weight: 500;
}

ul li .enlace:hover {
    color: #2563EB;
}

/* Responsive adjustments */
@media (min-width: 40rem) {
    ul {
        grid-template-columns: 1fr 0.25rem 1fr;
    }
    ul::before {
        grid-column: 2;
    }
    ul li:nth-child(odd) {
        grid-column: 1;
    }
    ul li:nth-child(even) {
        grid-column: 3;
    }
    ul li:nth-child(odd) .fecha::after {
        left: calc(100% + 1rem);
        right: auto;
    }
}
</style>
