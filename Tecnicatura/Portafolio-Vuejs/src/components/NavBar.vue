<template>
    <nav class="navbar">
      <div class="navbar-menu">
        <ul>
            <a v-for="nav in navegacion" :key="nav.nombre" href="nav.enlace" class="nav-item" >{{nav.nombre}}</a> 
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
 {id:4, nombre:'Habilidades', enlace:'#habilidades'}
]);
</script>

<style scoped>
.navbar {
  background-color: var(--vt-c-indigo);
  color: #fff;
  padding: 0.5rem 1 rem;
  align-items: center;
}
.navbar-item {
  color: #fff;
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
  border: 1px solid;
  border-color: hsla(160, 100%, 37%, 0.2);
  border-radius: 5px;
  /*Eliminar el subrayado de los enlaces y elmentos con clase "green" */
  text-decoration: none;
  /* Añade una transición suave para los cambios de estilo */
  transition: 0.4s;
  /* Añade padding alrededor del contenido */
  padding: 5px;
}

a:hover {
  /* Cambia el color de fondo al pasar el mause sobre un enlace */
  background-color: hsla(160, 100%, 37%, 0.2);
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}

</style>