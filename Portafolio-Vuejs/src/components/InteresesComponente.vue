<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Desarrollo de Software y Tecnología: Disfruto crear proyectos en GitHub y GitLab, colaborando en la implementación de sistemas y aplicaciones con un enfoque en eficiencia y agilidad.',
    'Educación y Mentoría: Me gusta compartir mis conocimientos en tecnología, especialmente en programación y redes, ayudando a otros a desarrollarse profesionalmente.',
    'Mercados Financieros: Con experiencia en asesoramiento financiero, también estoy interesado en cómo la tecnología puede innovar en el sector financiero.',
    'Automatización y Calidad: Me interesa la QA automation, buscando optimizar y asegurar la calidad en procesos de desarrollo.',
    'Videojuegos y Realidad Virtual: Me fascina la creación de efectos visuales y experiencias interactivas, aplicando elementos de simulación y realidad aumentada.',
    'Juegos de Estrategia: Juego TCG y disfruto de la estrategia, lo que también se refleja en mi interés en la planificación de proyectos tecnológicos y análisis de datos.'
]);

</script>

<template>
    <div class="intereses-contenedor">
        <FondoLava />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
    <!-- <div class="intereses-contenedor">
        <ul class="contenedor-lista">
            <li class="item">
                Desarrollo de Software de Código Abierto: Contribuyo a proyectos en GitHub, colaborando con otros
                desarrolladores para mejorar herramientas y librerías populares.
            </li>
            <li class="item">
                Deportes al Aire Libre: Disfruto del senderismo y el ciclismo de montaña, actividades que practico
                regularmente para mantener un equilibrio entre el trabajo y la vida personal.
            </li>
            <li class="item">
                Tecnología de Innovación: Me apasiona explorar nuevas tendencias tecnológicas como la inteligencia
                artificial y el desarrollo de aplicaciones móviles.
            </li>
            <li class="item">
                Fotografía: Practico la fotografía como un hobby, lo que me ayuda a mantener una perspectiva creativa
                tanto en mi vida profesional como personal.
            </li>
        </ul>
    </div> -->
</template>

<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1); /*sombra */
}

.item {
    margin-bottom: 1rem;
}
</style>