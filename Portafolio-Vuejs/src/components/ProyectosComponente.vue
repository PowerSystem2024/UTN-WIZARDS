<script setup>
import proyecto1 from "/src/assets/114shots_so.png";
import proyecto2 from "/src/assets/885shots_so.png";
import proyecto3 from "/src/assets/891shots_so.png";
import proyecto4 from "/src/assets/108shots_so.png";

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
        titulo: "Aplicacion monitores de networking en redes locales (2023)",
        descripcion: "Vincule todos los los servidores en una sola plataforma de monitoreo de networking en redes públicas y locales ",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:2,
        src: proyecto2,
        titulo: "Plataforma IPTV",
        descripcion: "Diseñe el vinculo entre servidores de video por SRT mas 700Mbps en video",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:3,
        src: proyecto3,
        titulo: "Implemente Nginx Proxy manager",
        descripcion: "implemente Servidor Debian con Nginx para crear certificado SSL en web personales",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:4,
        src: proyecto4,
        titulo: "Implemente Servidores con proxmox",
        descripcion: "Implemente microservicio para ahorro de hardware",
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
/* Contenedor principal de la galería de proyectos */
.galeria {
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background: #0D0D0D; /* Fondo oscuro sólido */
}

/* Animación de fondo degradado opcional */
@keyframes gradient {
    0% { background-position: 0% 50%; }
    50% { background-position: 100% 50%; }
    100% { background-position: 0% 50%; }
}

/* Contenedor individual de cada proyecto */
.proyecto {
    display: flex;
    flex-direction: column;
    background-color: #1A1A1A; /* Fondo oscuro para cada proyecto */
    border: 1px solid #333; /* Borde oscuro */
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.3); /* Sombra suave */
    max-width: 250px;
    flex: 1 1 300px;
    transition: transform 0.3s ease;
}

.proyecto:hover {
    transform: scale(1.05); /* Efecto de escala en hover */
}

/* Estilo para las imágenes dentro del contenedor del proyecto */
.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

/* Contenedor de la información del proyecto */
.proyecto-info {
    padding: 15px;
    text-align: center;
    color: #FFFFFF; /* Texto blanco */
}

.proyecto-info h3 {
    margin: 10px 0;
    font-size: 1.3em;
    color: #3B82F6; /* Azul vibrante para los títulos */
}

.proyecto-info p {
    margin: 10px 0;
    font-size: 1em;
    color: #9CA3AF; /* Gris claro para el texto descriptivo */
}

/* Organización de los enlaces y botones del proyecto */
.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}

/* Estilo para el botón "Ver Más" */
.proyecto-links .btn-ver-mas {
    background-color: #3B82F6; /* Azul vibrante */
    color: #FFFFFF;
    padding: 10px 15px;
    border-radius: 5px;
    text-decoration: none;
    transition: background-color 0.3s ease;
    text-align: center;
}

.proyecto-links .btn-ver-mas:hover {
    background-color: #2563EB; /* Azul más oscuro en hover */
}

/* Enlace a GitHub */
.proyecto-links .github-link {
    color: #9CA3AF; /* Gris claro para el enlace */
    text-decoration: none;
    font-size: 0.9em;
    text-align: center;
}

.proyecto-links .github-link:hover {
    text-decoration: underline;
}
</style>
