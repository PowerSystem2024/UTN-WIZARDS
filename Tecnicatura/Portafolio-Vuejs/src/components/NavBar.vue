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
  background-color: var(--vt-c-indigo);
  color: #000000;
  padding: 0.5rem 1 rem;
  align-items: center;
}
.navbar-item {
  color: #0c0c0c;
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
  font-size: 1.2rem;
  font-weight: 600;
  color: #c8cc8d;
  border: 1px solid;
  border-color: hsla(0, 0%, 0%, 0.534);
  border-radius: 16px;
  /*Eliminar el subrayado de los enlaces y elmentos con clase "green" */
  font-family: 'Doto', sans-serif;
  /* Añade una transición suave para los cambios de estilo */
  
  /* Añade padding alrededor del contenido */
  padding: 9px;
}

a:hover {
  /* Cambia el color de fondo al pasar el mause sobre un enlace */
  background-color: rgb(28, 41, 52);
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}

</style>