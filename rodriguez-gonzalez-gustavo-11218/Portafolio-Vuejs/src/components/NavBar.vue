<template>
  <nav class="navbar">
    <div class="navbar-menu">
      <ul>
          <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item">{{nav.nombre}}</a> 
      </ul>
    </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue';
/*Tenemos creado un arreglo de objetos*/
const navegacion = ref([
{id:1, nombre:'Educación', enlace:'#educacion'},
{id:2, nombre:'Experiencia', enlace:'#experiencia'},
{id:3, nombre:'Proyectos', enlace:'#proyectos'},
{id:4, nombre:'Habilidades', enlace:'#habilidades'},
{id:5, nombre:'Intereses', enlace:'#intereses'}
]);
</script>

<style scoped>
/* Cambiamos el color de fondo de la barra de navegación */
.navbar {
background-color: #1F1F1F; /* Color pastel rosa */
color: #D4A5A5; /* Color de texto oscuro */
padding: 0.5rem 1rem;
align-items: center;
border-radius: 8px; /* Bordes redondeados */
}

/* Estilos para los elementos de la barra de navegación */
.nav-item {
color: #D4A5A5; /* Color de texto oscuro */
text-decoration: none;
margin-right: 1rem;
border: 1px solid #FA95AF; /* Borde pastel para los enlaces */
padding: 5px;
border-radius: 5px;
transition: 0.4s;
}

/* Estilo para el menú de la barra de navegación */
.navbar-menu {
display: flex;
justify-content: flex-end;
}

/* Quitar estilo de lista */
.nav-list {
list-style: none;
}

/* Estilo para los enlaces */
a {
text-decoration: none;
color: #1F1F1F;
}

/* Cambiar el color de fondo al pasar el mouse */
a:hover {
background-color: #FFB4C7; /* Fondo en tono pastel más claro al hacer hover */
color: #ffffff; /* Texto blanco al hacer hover */
}

@media (max-width: 768px) {
.navbar-menu {
  display: flex;
  justify-content: flex-end;
  width: 100%;
}
}
</style>
