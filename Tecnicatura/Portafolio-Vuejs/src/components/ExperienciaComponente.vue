<script setup>
import icono1 from "/src/assets/crab-svgrepo-com.svg";
import icono2 from "/src/assets/crocodile-svgrepo-com.svg";
import icono3 from "/src/assets/dinosaur-svgrepo-com.svg";
import icono4 from "/src/assets/elk-svgrepo-com.svg";
import icono5 from "/src/assets/jellyfish-svgrepo-com.svg";

import { ref } from 'vue';
const titulo = "Desarrollador Full Stack";
const fecha = "Desde octubre 2024 / Noviembre 2024";
const experiencias = ref([
    {id:1, src: icono1, parrafo: "Lideré un equipo de 5 desarrolladores en la creacion de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primenr año"},
    {id:2, src: icono2, parrafo: "Diseñe y desarrolle aplicaciones web utilizando node.js, react y mongoDB, logrando reducir el tiempo de cargar de las páginas en un 50%"},
    {id:3, src: icono3, parrafo: "Implementé soluciones de autenticación y autorización, mejorando la seguridad de sitio web y reduciendo los intentos de acceso no autorizado en un 20%"},
    {id:4, src: icono4, parrafo: "Colaboré con diseñadores de UX/UI para crear interfaces de usuarios atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%"},
    {id:5, src: icono5, parrafo: "Automaticé procesos de despliegue continuo utiliznado Jenkins y docker, reduciendo los tiempos de despliegues en un 40%"}, 
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experiencia in experiencias" :key="experiencia.id">
                <img class="imagen-svg" :src="experiencia.src" width="45rem" :alt="experiencia.parrafo">
                <p>{{ experiencia.parrafo }}</p>

            </li>
            <!-- <li class="item"><img class="imagen-svg" src="" width="" alt="">
                <p>Lideré un equipo de 5 desarrolladores en la creacion de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primenr año</p>
            </li>
            <li class="item"><img class="imagen-svg" src="" width="" alt="">
                <p>Diseñe y desarrolle aplicaciones web utilizando node.js, react y mongoDB, logrando reducir el tiempo de cargar de las páginas en un 50%</p>
            </li>
            <li class="item"><img class="imagen-svg" src="" width="" alt="">
                <p>Implementé soluciones de autenticación y autorización, mejorando la seguridad de sitio web y reduciendo los intentos de acceso no autorizado en un 20%</p>
            </li>
            <li class="item"><img class="imagen-svg" src="" width="" alt="">
                <p>Colaboré con diseñadores de UX/UI para crear interfaces de usuarios atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%</p>
            </li>
            <li class="item"><img class="imagen-svg" src="" width="" alt="">
                <p>Automaticé procesos de despliegue continuo utiliznado Jenkins y docker, reduciendo los tiempos de despliegues en un 40%</p>
            </li> -->

        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgba(255, 245, 238, 0.85); /* Más cálido y claro */
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: coral; 
}

.fecha {
    font-size: 1rem;
    color: rgb(161, 106, 34); 
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
    color: black; /* Asegurar texto negro en los items */
}
</style>
