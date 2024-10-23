<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/EducacionComponente.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue'
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
</script>

<template>
  <header>
    <!--Barra de Navegacion-->
    <NavBar />
    <!--Componentes Datos Personales-->
    <DatosPersonales/>
  </header>
  <main>
    <!--el estilo css de section se encuentra en base.css-->
    <section id="educacion"><h2>Educación - Cursos</h2>
    <Educacion/>
    </section>
    <section id="experiencia"><h2>Experiencia</h2>
    <ExperienciaComponente/>
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <!--Componente proyectos-->
      <ProyectosComponente/>
    </section>
    <section id="habilidades">
      <!--Componente Habilidades-->
      <h2>Habilidades</h2>
      <HabilidadesComponente/>
    </section>
    <section id="intereses"><h2>Intereses</h2></section>
  </main>
</template>

<!--Le damos estilo-->
<style scoped>

</style>
