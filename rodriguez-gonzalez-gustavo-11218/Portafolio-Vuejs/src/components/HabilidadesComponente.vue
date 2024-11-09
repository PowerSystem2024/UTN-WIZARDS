<script setup>
import imagen1 from "/src/components/icons/js.svg";
import imagen2 from "/src/components/icons/python.svg";
import imagen3 from "/src/components/icons/html-css.svg";
import imagen4 from "/src/components/icons/java.svg";
import imagen5 from "/src/components/icons/sql.svg";
import imagen6 from "/src/components/icons/react.svg";
import imagen7 from "/src/components/icons/vue.svg";
import imagen8 from "/src/components/icons/node.svg";
import imagen9 from "/src/components/icons/django.svg";
import imagen10 from "/src/components/icons/bootstrap.svg";
import imagen11 from "/src/components/icons/git.svg";
import imagen12 from "/src/components/icons/docker.svg";
import imagen13 from "/src/components/icons/cypress.svg";
import imagen14 from "/src/components/icons/figma.svg";
import imagen15 from "/src/components/icons/visual.svg";
import imagen16 from "/src/components/icons/mongo.svg";
import imagen17 from "/src/components/icons/mysql.svg";
import imagen18 from "/src/components/icons/postgres.svg";
import imagen19 from "/src/components/icons/arg.svg";
import imagen20 from "/src/components/icons/eeuu.svg";
import { ref } from 'vue';

const habilidades = ref([
    {
        id: 1, nombre: 'Lenguajes de Programación', habilidades: [
            { id: 1, nombre: 'JavaScript', nivel: 'Avanzado', icono: imagen1},
            { id: 2, nombre: 'Python', nivel: 'Intermedio', icono: imagen2},
            { id: 3, nombre: 'HTML/CSS', nivel: 'Avanzado', icono: imagen3},
            { id: 4, nombre: 'Java', nivel: 'Intermedio', icono: imagen4},
            { id: 5, nombre: 'SQL', nivel: 'Intermedio', icono: imagen5}
        ]
    },
    {
        id: 2, nombre: 'Frameworks y Librerías', habilidades: [
            { id: 1, nombre: 'React.js', nivel: 'Avanzado', icono: imagen6 },
            { id: 2, nombre: 'Vue.js', nivel: 'Intermedio', icono: imagen7 },
            { id: 3, nombre: 'Node.js', nivel: 'Avanzado', icono: imagen8 },
            { id: 4, nombre: 'Django', nivel: 'Intermedio', icono: imagen9 },
            { id: 5, nombre: 'Bootstrap', nivel: 'Avanzado', icono: imagen10 }
        ]
    },
    {
        id: 3, nombre: 'Herramientas y Software', habilidades: [
            { id: 1, nombre: 'Git', nivel: 'Avanzado', icono: imagen11 },
            { id: 2, nombre: 'Docker', nivel: 'Intermedio', icono: imagen12 },
            { id: 3, nombre: 'Cypress', nivel: 'Intermedio', icono: imagen13 },
            { id: 4, nombre: 'Figma', nivel: 'Intermedio', icono: imagen14 },
            { id: 5, nombre: 'Visual Studio Code', nivel: 'Avanzado', icono: imagen15 }
        ]
    },
    {
        id: 4, nombre: 'Bases de Datos', habilidades: [
            { id: 1, nombre: 'MongoDB', nivel: 'Avanzado', icono: imagen16 },
            { id: 2, nombre: 'MySQL', nivel: 'Intermedio', icono: imagen17 },
            { id: 3, nombre: 'PostgreSQL', nivel: 'Intermedio', icono: imagen18 }
        ]
    },
    {
        id: 5, nombre: 'Idiomas', habilidades: [
            { id: 1, nombre: 'Español', nivel: 'Nativo', icono: imagen19 },
            { id: 2, nombre: 'Inglés', nivel: 'Avanzado (C1)', icono: imagen20 }
        ]
    }
]);
</script>

<template>
    <div class="skills-contenedor">
        <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
            <h3>{{ habilidad.nombre }}</h3>
            <ul class="skills">
                <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
                    <img :src="habilidad.icono" :alt="habilidad.nombre">
                    <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>
                </li>
            </ul>
        </div>
    </div>
</template>

<style scoped>
/* Fondo sólido en lugar de degradado para el contenedor */
.skills-contenedor {
    padding: 2rem;
    background-color: #1F1F1F; /* Color de fondo sólido */
    border-radius: 12px; /* Bordes redondeados */
}

.skills-categoria {
    margin-bottom: 20px;
}

.skills-categoria h3 {
    display: flex;
    justify-content: left;
    margin-bottom: 10px;
    font-size: 1.5em;
    color: #D4A5A5; /* Color pastel en el título */
    font-weight: bold;
}

.skills {
    display: flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
    gap: 20px;
}

.skill {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 10px;
    background-color: #333333; /* Fondo oscuro para los contenedores de habilidad */
    padding: 0.3em;
    border-radius: 8px;
    box-shadow: 0px 4px 12px rgba(212, 165, 165, 0.5); /* Sombra con color pastel */
    flex: 1 1 200px;
    max-width: 250px;
    transition: background-color 0.3s ease;
}

.skill:hover {
    background-color: #FA95AF; /* Color pastel en el hover */
    color: white;
}

.skill img {
    width: 35px;
    height: 35px;
}

.skill span {
    font-size: 1em;
    color: #cccccc; /* Color gris claro para el texto */
}

.skill:hover span {
    color: #ffffff; /* Color blanco para el texto al hacer hover */
}

@media (max-width: 768px) {
    .skills-categoria h3 {
        justify-content: center;
    }

    .skill {
        justify-content: center;
    }
}
</style>
