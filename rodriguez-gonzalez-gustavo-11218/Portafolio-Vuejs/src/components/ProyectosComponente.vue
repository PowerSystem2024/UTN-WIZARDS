<script setup>
import proyecto1 from "/src/assets/annidada-tech.jpeg";
import { ref } from 'vue';

var misProyectos = ref([]);
misProyectos.value = ([
    {
        id:1,
        src: proyecto1,
        titulo: "Aplicacion de reservas para restaurantes (2024)",
        descripcion: "Cree una aplicacion móvil con flutter que permite a los usuarios reservar mesas en restaurantes locales",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:2,
        src: proyecto1,
        titulo: "Plataforma de E-learning (2024)",
        descripcion: "Diseñé y desarrolle una plataforma de educacion en línea utiliznado Django y React",
        projectoLink: "https://www.google.com.ar",
        githubLink: "https://github.com/usuario/proyecto"
    },
    {
        id:3,
        src: proyecto1,
        titulo: "Blog Personal con CMS (2024)",
        descripcion: "Construí un blog personal con un sistema de gestión (CMS) personalizada en WordPress",
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
    <div class="galeria">
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <img :src="proyecto.src" :alt="proyecto.titulo">
            <div class="proyecto-info">
                <h3>{{ proyecto.titulo }}</h3>
                <p>{{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.projectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">ver proyecto</a>
                    <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer">ver Código en GitHub</a>
                </div>     
            </div>
        </li>
    </div>
</template>

<style scoped>
/* Fondo sólido en lugar de degradado para la galería con bordes redondeados */
.galeria {
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background-color: #1F1F1F; /* Fondo sólido en lugar de degradado */
    border-radius: 12px; /* Bordes redondeados para el contenedor principal */
}

/* Estilos de los proyectos */
.proyecto {
    display: flex;
    flex-direction: column;
    border: 2px solid #ddd;
    border-radius: 8px;
    overflow: hidden;
    background-color: #c9b5b5; /* Fondo del contenedor interno */
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
    font-weight: bold;
    color: #000000; /* Color de texto para el título */
}

.proyecto-info p {
    margin: 10px 0;
    font-size: 1em;
    color: #000000; /* Color de texto para la descripción */
}

.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}

.proyecto-links .btn-ver-mas {
    background-color: #1F1F1F;
    color: #fff;
    padding: 10px 15px;
    border-radius: 5px;
    text-decoration: none;
    transition: background-color 0.3s;
}

.proyecto-links .btn-ver-mas:hover {
    background-color: #fc4d78;
}

.proyecto-links .github-link {
    color: #333;
    text-decoration: none;
    font-size: 0.9em;
}

.proyecto-links .github-link:hover {
    text-decoration: underline;
}
</style>
