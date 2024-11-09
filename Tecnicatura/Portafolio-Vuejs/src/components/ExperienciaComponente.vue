<script setup>
import icono1 from "/src/assets/crab-svgrepo-com.svg";
import icono2 from "/src/assets/crocodile-svgrepo-com.svg";
import icono3 from "/src/assets/dinosaur-svgrepo-com.svg";
import icono4 from "/src/assets/elk-svgrepo-com.svg";
import icono5 from "/src/assets/jellyfish-svgrepo-com.svg";

import { ref } from 'vue';
const titulo = "Desarrollador Tv Digital DVB - Tv OTT";
const fecha = "Desde octubre 2019 / Noviembre 2024";
const experiencias = ref([
    {id:1, src: icono1, parrafo: "Implementación de 2 CDN LilacF5 con capasidad de 20Gbps para el transporte de contenido VOD y Tv Live"},
    {id:2, src: icono2, parrafo: "Implementación de monitores de networking en redes locales, integración con notificaciones en Telegram"},
    {id:3, src: icono3, parrafo: "Impulse el despliegue de plataforma Tv OTT en San Rafael, como middleware Minerva Network"},
    {id:4, src: icono4, parrafo: "Desarrolle el vínculo IPTV entre 3 ciudades diferente, con el protocolo SRT con la compañía Flussonic"},
    {id:5, src: icono5, parrafo: "Implemente la migración de Tv analógica tradicional 6 mhz a moduladores IP con 32 portadoras en unificadas"}, 
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
.card{
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(28, 41, 52);
    border-radius: 15px;
}
.titulo{
    font-size: 1.5rem;
    color: coral;
}
.fecha{
    font-size: 1rem;
    color: burlywood;
    margin-bottom: 1rem;
}
.listado{
    display: flex;
    flex-direction: column;
}
.item{
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}
</style>