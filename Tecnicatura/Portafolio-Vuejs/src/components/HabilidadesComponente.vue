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

//Se importa ref de vue para poder usarlo
import { ref } from 'vue';
//Se crea un array de objetos con las habilidades
//Este es un array de objetos con habilidades que se pueden modificar o agregar
const habilidades = ref([
    {// Se crea un objeto con id, nombre y habilidades
        id: 1, nombre: 'Lenguajes de Programación', habilidades: [
            //Se crea un objeto con id, nombre, nivel e icono
            { id: 1, nombre: 'JavaScript', nivel: 'Principiantes', icono: imagen1},
            { id: 2, nombre: 'Python', nivel: 'Principiantes', icono: imagen2},
            { id: 3, nombre: 'HTML/CSS', nivel: 'Intermedio', icono: imagen3},
            { id: 4, nombre: 'Java', nivel: 'Principiantes', icono: imagen4},
            { id: 5, nombre: 'SQL', nivel: 'Intermedios', icono: imagen5}
        ]
    },
    {
        id: 2, nombre: 'Frameworks y Librerías', habilidades: [            
            { id: 2, nombre: 'Vue.js', nivel: 'Principiantes', icono: imagen7 },
            { id: 3, nombre: 'Node.js', nivel: 'Principiantes', icono: imagen8 },            
            { id: 5, nombre: 'Bootstrap', nivel: 'Intermedios', icono: imagen10 },
            { id: 5, nombre: 'Django', nivel: 'Intermedios', icono: imagen9 },
            { id: 5, nombre: 'React', nivel: 'Intermedios', icono: imagen6 }


        ]
    },
    {
        id: 3, nombre: 'Herramientas y Software', habilidades: [
            { id: 1, nombre: 'Git', nivel: 'Avanzado', icono: imagen11 },
            { id: 2, nombre: 'Docker', nivel: 'Principiantes', icono: imagen12 },
            { id: 3, nombre: 'Cypress', nivel: 'Principiantes', icono: imagen13 },
            { id: 4, nombre: 'Figma', nivel: 'Principiantes', icono: imagen14 },
            { id: 5, nombre: 'Visual Studio Code', nivel: 'Avanzados', icono: imagen15 }
        ]
    },
    {
        id: 4, nombre: 'Bases de Datos', habilidades: [
            { id: 1, nombre: 'MongoDB', nivel: 'Avanzado', icono: imagen16 },
            { id: 2, nombre: 'MySQL', nivel: 'Intermedio', icono: imagen17 },
            { id: 3, nombre: 'PostgreSQL', nivel: 'Intermedios', icono: imagen18 }
            
        ]
    },
    {
        id: 5, nombre: 'Idiomas', habilidades: [
            { id: 1, nombre: 'Español', nivel: 'Nativo', icono: imagen19 },
            { id: 2, nombre: 'Inglés', nivel: 'Intermedios (B1)', icono: imagen20 }
        ]
    }
]);
</script>

<template>
    <!--Este componente vue funciona de esta forma:-->
    <div class="skills-contenedor">
        <!--Se recorre el array habilidades con v-for y se asigna la key habilidad.id-->
        <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
            <!--Se muestra el nombre de la habilidad-->
            <h3>{{ habilidad.nombre }}</h3>
            <ul class="skills">
                <!--Se recorre el array habilidades con v-for y se asigna la key habilidad.id-->
                <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
                    <!--Se muestra el icono de la habilidad y el nombre de la habilidad con su nivel-->
                    <img :src="habilidad.icono" :alt="habilidad.nombre">
                    <!--Se muestra el icono de la habilidad y el nombre de la habilidad con su nivel-->
                    <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>
                </li>
            </ul>
        </div>
    </div>
    <!-- <div class="skills-contenedor">
        <div class="skills-categoria">
            <h3>Lenguajes de Programación</h3>
            <ul class="skills">
                <li class="skill">
                    <img src="/src/components/icons/js.svg" alt="JavaScript">
                    <span>JavaScript: Avanzado</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/python.svg" alt="Python">
                    <span>Python: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/html-css.svg" alt="HTML/CSS">
                    <span>HTML/CSS: Avanzado</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/java.svg" alt="Java">
                    <span>Java: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/sql.svg" alt="SQL">
                    <span>SQL: Intermedio</span>
                </li>
            </ul>
        </div>

        <div class="skills-categoria">
            <h3>Frameworks y Librerías</h3>
            <ul class="skills">
                <li class="skill">
                    <img src="/src/components/icons/react.svg" alt="React.js">
                    <span>React.js: Avanzado</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/vue.svg" alt="Vue.js">
                    <span>Vue.js: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/node.svg" alt="Node.js">
                    <span>Node.js: Avanzado</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/django.svg" alt="Django">
                    <span>Django: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/bootstrap.svg" alt="Bootstrap">
                    <span>Bootstrap: Avanzado</span>
                </li>
            </ul>
        </div>

        <div class="skills-categoria">
            <h3>Herramientas y Software</h3>
            <ul class="skills">
                <li class="skill">
                    <img src="/src/components/icons/git.svg" alt="Git">
                    <span>Git: Avanzado</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/docker.svg" alt="Docker">
                    <span>Docker: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/cypress.svg" alt="Cypress">
                    <span>Cypress: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/figma.svg" alt="Figma">
                    <span>Figma: Intermedio</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/visual.svg" alt="Visual Studio Code">
                    <span>Visual Studio Code: Avanzado</span>
                </li>
            </ul>
        </div>

        <div class="skills-categoria">
            <h3>Bases de Datos</h3>
            <ul class="skills">
                <div class="skill">
                    <img src="/src/components/icons/mongo.svg" alt="MongoDB">
                    <span>MongoDB: Avanzado</span>
                </div>
                <div class="skill">
                    <img src="/src/components/icons/mysql.svg" alt="MySQL">
                    <span>MySQL: Intermedio</span>
                </div>
                <div class="skill">
                    <img src="/src/components/icons/postgres.svg" alt="PostgreSQL">
                    <span>PostgreSQL: Intermedio</span>
                </div>
            </ul>
        </div>

        <div class="skills-categoria">
            <h3>Idiomas</h3>
            <ul class="skills">
                <li class="skill">
                    <img src="/src/components/icons/arg.svg" alt="Español">
                    <span>Español: Nativo</span>
                </li>
                <li class="skill">
                    <img src="/src/components/icons/eeuu.svg" alt="Inglés">
                    <span>Inglés: Avanzado (C1)</span>
                </li>
            </ul>
        </div>
    </div> -->
</template>

<style scoped>

.skills-contenedor {
    padding: 2rem;
    background: linear-gradient(-45deg, #FF7E5F, #FEB47B, #FF9E80, #FFDDE1); /* Nuevo gradiente */
}

.skills-categoria h3 {
    display: flex;
    justify-content: left;
    margin-bottom: 10px;
    font-size: 1.5em;
    color: #fff; /* Blanco puro */
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
    background-color: rgba(255, 245, 238, 0.85); /* Más cálido y claro */
    padding: 0.3em;
    border-radius: 8px;
    box-shadow: 0px 4px 12px rgba(255, 122, 89, 0.9); /* Sombras más cálidas */
    flex: 1 1 200px;
    max-width: 250px;
}

.skill:hover {
    background-color: rgba(255, 87, 34, 0.85); /* Color hover más vibrante */
}

.skill img {
    width: 35px;
    height: 35px;
}

.skill span {
    font-size: 1em;
    color: #333;
}

.skill:hover {
    font-size: 1.3em;
    transition: 2s ease;
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