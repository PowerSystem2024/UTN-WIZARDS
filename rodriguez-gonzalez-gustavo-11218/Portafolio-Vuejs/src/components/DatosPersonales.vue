<script setup>
    import linkedin from "/src/assets/linkedin_icon.svg";
    import instagram from "/src/assets/instagram_icon.svg";
    import github from "/src/assets/github_icon.svg";
    import cv from "/src/assets/cv_resume_icon.svg";

    const title = "Gustavo Rodriguez";
    const descripcion = "Tecnico Univercitario en programación - UTN";
    const residencia = "San Antonio Oeste, Rio Negro, Argentina";
    const presentacion = "Hola, Bienvenido a mi portafolio de proyectos. Soy un desarrollador web con algo de experiencia en el desarrollo de palicaciones web y moviles"
    const redesSociales = [
    {id: 1, name: "linkedin", src: linkedin, url: ""},
    {id: 2, name: "Intagran", src: instagram, url: ""},
    {id: 3, name: "github", src: github, url: ""},
    {id: 4, name: "curriculum", src : cv, url: ""},
    ];
    const telefono = "+54 9 2920 29 1315"
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
            <h3>Mi teléfono personal: {{ telefono }}</h3>
            <h4>{{ residencia }}</h4>
        </div>
    </section>
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
}

p {
    font-size: 1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
}

.card {
    background-color: rgb(28, 41, 52);
    border-radius: 10px;
    padding: 10px;
    text-align: center;
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
    background-color: rgb(28, 41, 52);
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
    font-size: 1.2rem;
    font-weight: 600;
}
</style>