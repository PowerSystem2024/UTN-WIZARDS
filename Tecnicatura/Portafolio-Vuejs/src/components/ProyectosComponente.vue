<script setup>
import proyecto1 from "/src/assets/annidada-tech.jpeg";

//Este componente muestra una galeria de proyectos con información sobre cada proyecto
import { ref } from 'vue';
//.ref es una función que se utiliza pra crear una referencia reactiva en vue 3
var misProyectos = ref([]);
//.value es una propiedad que se utiliza para acceder al valor de una referencia reactiva en vue 3
misProyectos.value = ([
    //esto es un array de objetos que contiene información sobre proyectos
    
    {
        id:1,
        src: proyecto1,
        titulo: "Sistema de reservas para clínicas locales (2024)",
        descripcion: "Creamos una aplicacion webapp con Java y Maven que permite a los usuarios reservar turnos en distintas especialidades.",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:2,
        src: proyecto1,
        titulo: "Plataforma de MarketPlace (2024)",
        descripcion: "Diseñamos y desarrollamos una plataforma de compras en línea utiliznado Django y React",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:3,
        src: proyecto1,
        titulo: "ERP para supermercados (2024)",
        descripcion: "Construimos un ERP para supermercados con Springboot y Vue donde podran llevar un control mas preciso de su stock y economia con un sistema de cajas",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:4,
        src: proyecto1,
        titulo: "Aplicacion de reservas para restaurantes (2024)",
        descripcion: "Cree una aplicacion móvil con flutter que permite a los usuarios reservar mesas en restaurantes locales",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
])
</script>

<template>
    <!--Aqui va el código HTML de la galeria de proyecto-->
    <div class="galeria">
        <!-- Itera sobre cada proyecto en la lista de misProyectos-->
        <!-- Key es una propiedad especial que se utiliza para identificar de forma única cada elemento en una lista de vue.js-->
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <!-- Muestra la imagen del proyecto utilizando : que es una directiva de enlace de atributo en vue.js-->
            <img :src="proyecto.src" :alt="proyecto.titulo">
            <div class="proyecto-info">
                <!-- Muestra el titulo y la descripcion del proyecto utiliznado la iterpolación de vue.js-->
                <h3>{{ proyecto.titulo }}</h3>
                <p> {{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.projectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer"> ver proyecto</a>
                    <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer"> ver Código en GitHub</a>
                </div>     
            </div>
        </li>
        <!-- <div class="proyecto">
            <img src="/src/assets/annidada-tech.jpeg" alt="Proyecto 1">
            <div class="proyecto-info">
                <h3>Ecomerce </h3>
                <p>Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el
                    primer año.</p>
                <div class="proyecto-links">
                    <a href="https://proyecto1.com" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver
                        Proyecto</a>
                    <a href="https://github.com/usuario/proyecto1" class="github-link" target="_blank"
                        rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </div>
        <div class="proyecto">
            <img src="/src/assets/annidada-tech.jpeg" alt="Proyecto 1">
            <div class="proyecto-info">
                <h3>Ecomerce </h3>
                <p>Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el
                    primer año.</p>
                <div class="proyecto-links">
                    <a href="https://proyecto1.com" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver
                        Proyecto</a>
                    <a href="https://github.com/usuario/proyecto1" class="github-link" target="_blank"
                        rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </div>
        <div class="proyecto">
            <img src="/src/assets/annidada-tech.jpeg" alt="Proyecto 1">
            <div class="proyecto-info">
                <h3>Ecomerce </h3>
                <p>Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el
                    primer año.</p>
                <div class="proyecto-links">
                    <a href="https://proyecto1.com" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver
                        Proyecto</a>
                    <a href="https://github.com/usuario/proyecto1" class="github-link" target="_blank"
                        rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </div> -->
    </div>
</template>

<style scoped>
/* .galeria{
    width: 100%;
    height: 100vh;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: center;
    background-image: url('/src/assets/fondo-proyectos.jpg');
    background-size: cover;
    background-position: center;
    background-repeat: no;
} */

/* Estilos Fondo Animado de Css de la galería */
/* La clase 'galeria' es el contenedor principal de la galería de proyectos */
.galeria {
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background: linear-gradient(-45deg, #f8a5c2, #fbc7d4, #f9f1f0, #fde3f0);
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

.proyecto {
    display: flex;
    flex-direction: column;
    border: 2px solid #ffdddd;
    border-radius: 8px;
    overflow: hidden;
    background-color: #fff8f5; /* Fondo claro para contraste */
    max-width: 222px;
    flex: 1 1 300px;
}

.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

.proyecto-info {
    padding: 15px;
    text-align: center;
}

.proyecto-info h3 {
    margin: 10px 0;
    font-size: 1.3em;
    color: #ff6b81; /* Títulos en rosa intenso */
}

.proyecto-info p {
    margin: 10px 0;
    font-size: 1em;
    color: #ff9f9f; /* Texto en rosa suave */
}

.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}

.proyecto-links .btn-ver-mas {
    background-color: #ffcccc; /* Botones en rosa pálido */
    padding: 10px 15px;
    border-radius: 5px;
    text-decoration: none;
    transition: background-color 0.3s;
}

.proyecto-links .btn-ver-mas:hover {
    background-color: #ff6b81; /* Hover más fuerte */
}

.proyecto-links .github-link {
    color: #555; /* Texto de enlace más oscuro */
    text-decoration: none;
    font-size: 0.9em;
}

.proyecto-links .github-link:hover {
    text-decoration: underline;
}

</style>