<template>
    <nav class="navbar">
      <div class="navbar-menu">
        <ul>
            <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item" >{{nav.nombre}}</a> 
        </ul>
      </div>
    </nav>
</template>

<script setup>
import { ref } from 'vue';
/*Tenemos creado un arreglo de objetos*/
const navegacion= ref([
 {id:1, nombre:'Educación', enlace:'#educacion'},
 {id:2, nombre:'Experiencia', enlace:'#experiencia'},
 {id:3, nombre:'Proyectos', enlace:'#proyectos'},
 {id:4, nombre:'Habilidades', enlace:'#habilidades'},
 {id:5, nombre:'Intereses', enlace:'#intereses'}
]);
</script>

<style scoped>
.navbar {
  background-color: rgba(255, 245, 238, 0.85); /* Fondo claro */
  color: #333; /* Texto oscuro para el nav */
  padding: 0.5rem 1rem;
  align-items: center;
}

.navbar-item {
  color: #333; /* Texto oscuro para los elementos del navbar */
  text-decoration: none;
  margin-right: 1rem;
}

.navbar-menu {
  display: flex;
  justify-content: flex-end;
}

.nav-list {
  list-style: none;
}

a {
  color: #333; /* Texto oscuro para los enlaces */
  border: 1px solid;
  border-color: hsla(160, 100%, 37%, 0.2);
  border-radius: 5px;
  text-decoration: none; /* Eliminar subrayado */
  transition: 0.4s; /* Transición suave */
  padding: 5px; /* Espaciado dentro del botón */
}

a:hover {
  background-color: hsla(160, 100%, 37%, 0.2); /* Fondo en hover */
  color: #000; /* Color más oscuro en hover para resaltar */
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}
</style>
