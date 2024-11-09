<script setup>
    import linkedin from "/src/assets/linkedin_icon.svg";
    import instagram from "/src/assets/instagram_icon.svg";
    import github from "/src/assets/github_icon.svg";
    import cv from "/src/assets/cv_resume_icon.svg";

    const title = "UTN-WIZARDS";
    const descripcion = "Tecnicatura Universitaria en programación - UTN";
    const residencia = "Argentina";
    const presentacion = "Hola, Bienvenido al portafolio de UTN-WIZARDS. Somos un grupo de estudiantes de la Tecnicatura en Programación en la Universidad Tecnológica Nacional"
    const redesSociales = [
    {id: 1, name: "linkedin", src: linkedin, url: "htpps://www.linkendin.com/in/jose-perez/"},
    {id: 2, name: "Intagran", src: instagram, url: "https://www.instragam.com/joseperez"},
    {id: 3, name: "github", src: github, url: "https://github.com/PowerSystem2024/UTN-WIZARDS"},
    {id: 4, name: "curriculum", src : cv, url: ""},
    ];
    const telefono = "+54 9 2443-4326734"
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
            <h3>Nuestro teléfono de contacto: {{ telefono }}</h3>
            <h4>{{ residencia }}</h4>
        </div>
    </section>
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
    color: black; /* Asegurar texto negro */
}

h2 {
    font-size: 1.8rem;
    color: black; /* Cambiar a negro el texto del h2 */
}

p {
    font-size: 1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
    color: black; /* Asegurar texto negro */
}

.card {
    background-color: rgba(255, 245, 238, 0.85); /* Más cálido y claro */
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
    color: black; /* Asegurar texto negro */
}
</style>
