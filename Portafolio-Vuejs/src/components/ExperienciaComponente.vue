<script setup>
import icono1 from "/src/assets/crab-svgrepo-com.svg";
import icono2 from "/src/assets/crocodile-svgrepo-com.svg";
import icono3 from "/src/assets/dinosaur-svgrepo-com.svg";
import icono4 from "/src/assets/elk-svgrepo-com.svg";
import icono5 from "/src/assets/jellyfish-svgrepo-com.svg";

import { ref } from 'vue';
const titulo = "A través de mi vida laboral";
const fecha = "Desde Enero 2013 / Noviembre 2024";
const experiencias = ref([
    {id:1, src: icono1, parrafo: "Implementación en empresa de sistema de control de bateas en APPSHEET"},
    {id:2, src: icono2, parrafo: "Implementación de diversos sistemas de facturación en empresas"},
    {id:3, src: icono3, parrafo: "Implementación de diversos sistemas ERP en empresas"},
    {id:4, src: icono4, parrafo: "Responsable de administración con 10 personas a cargo"},
    {id:5, src: icono5, parrafo: "Socio Adjunto de Estudio Contable Cardozo"}, 
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
    background-color: #1A1A1A; /* Fondo oscuro */
    border-radius: 15px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Sombra suave */
}

.titulo {
    font-size: 1.5rem;
    color: #3B82F6; /* Azul vibrante para el título */
    font-weight: bold;
    margin-bottom: 0.5rem;
}

.fecha {
    font-size: 1rem;
    color: #9CA3AF; /* Color gris claro para la fecha */
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
    color: #FFFFFF; /* Color blanco para el texto */
    background-color: #2D2D2D; /* Fondo gris oscuro para cada item */
    border-radius: 10px;
    transition: background-color 0.3s ease, transform 0.2s ease;
}

.item:hover {
    background-color: #3B82F6; /* Azul en hover */
    transform: translateY(-3px); /* Efecto de elevación en hover */
    color: #FFFFFF;
}
</style>
