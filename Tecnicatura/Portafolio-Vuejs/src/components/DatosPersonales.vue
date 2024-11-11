<script setup>
    import linkedin from "/src/assets/linkedin_icon.svg";
    import instagram from "/src/assets/instagram_icon.svg";
    import github from "/src/assets/github_icon.svg";
    import cv from "/src/assets/cv_resume_icon.svg";

    const title = "Victor Alejandro Aguilar";
    const descripcion = "Tecnico Univercitario en programación - UTN";
    const residencia = "San Miguel, Tucuman, Argentica";
    const presentacion = "Hola, Bienvenido a mi portafolio de proyectos. Soy un desarrollador web con experiencia en el desarrollo de aplicaciones web y moviles"
    const redesSociales = [
    {id: 1, name: "linkedin", src: linkedin, url: "htpps://www.linkendin.com/in/jose-perez/"},
    {id: 2, name: "Intagran", src: instagram, url: "https://www.instragam.com/joseperez"},
    {id: 3, name: "github", src: github, url: "https://github.com/a-le05"},
    {id: 4, name: "curriculum", src : cv, url: ""},
    ];
    const telefono = "victoralejandroaguilar46@gmail.com"
</script>

<template>
    <section class="datos-personales">
        <div class="card">
            <h1>{{ title }}</h1>
            <h2>{{ descripcion }}</h2>
            <p>{{ presentacion }}</p>
            <ul class="container-lista">
                <li v-for="red in redesSociales" :key="red.id">
                    <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
                </li>
            </ul>
            <h3> Contacto: {{ telefono }}</h3>
            <h4>{{ residencia }}</h4>
        </div>
    </section>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Doto:wght@400;700&display=swap');
h1 {
    font-size: 2.5rem;
}

p {
    font-size: 1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
}

.card {
    
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); 
    color: #e9e7e7;
    font-family: 'Doto', sans-serif;
    background-color: rgb(50, 50, 50);
    border-radius: 10px;
    padding: 10px;
    text-align: center;
    font-weight: 800; 
    
}

.container-lista {
    display: flex;
    justify-content: center;
    list-style: none;
    padding: 0;
    margin: 0;
    text-align: center;
}

.icon-redsocial {
    align-items: center;
    background-color: aliceblue;
    border-radius: 50%;
    padding: 2px;
    margin: 5px;
    box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
    
    background-color: rgb(0, 0, 0);
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
    
    font-size: 1.2rem;
    font-weight: 600;
}

</style>