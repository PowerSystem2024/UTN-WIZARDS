<script setup>
    import linkedin from "/src/assets/linkedin_icon.svg";
    import instagram from "/src/assets/instagram_icon.svg";
    import github from "/src/assets/github_icon.svg";
    import cv from "/src/assets/cv_resume_icon.svg";

    const title = "Franco Cardozo";
    const descripcion = "Estudiante de Tecnicatura Universitaria en programación - UTN San Rafael";
    const residencia = "San Rafael, Mendoza, Argentina";
    const presentacion = "Hola, Bienvenido a mi portafolio de proyectos. Soy desarrollador web con experiencia en el desarrollo de aplicaciones web y móvil."
    const redesSociales = [
    {id: 1, name: "linkedin", src: linkedin, url: "https://www.linkedin.com/in/francocardozo/"},
    {id: 2, name: "Instagram", src: instagram, url: ""},
    {id: 3, name: "GitHub", src: github, url: "https://github.com/datanexplus"},
    {id: 4, name: "Curriculum vitae", src : cv, url: ""},
    ];
    const telefono = "+54 9 299 4091186"
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
    color: #FFFFFF;
    font-weight: bold;
}

p {
    font-size: 1.2rem;
    font-weight: 600;
    color: #FFFFFF;
    margin-bottom: 1rem;
}

.card {
    background-color: #1A1A1A; /* Fondo oscuro para la tarjeta */
    border-radius: 10px;
    padding: 20px;
    text-align: center;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Sombra suave */
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
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #3B82F6; /* Azul vibrante para el fondo */
    border-radius: 50%;
    padding: 10px;
    margin: 5px;
    color: #FFFFFF; /* Color blanco para el icono */
    transition: background-color 0.3s ease, box-shadow 0.3s ease;
}

.icon-redsocial:hover {
    background-color: #2563EB; /* Azul más oscuro en hover */
    box-shadow: 0 0 10px rgba(59, 130, 246, 0.6); /* Sombra suave en azul */
}

h3 {
    font-size: 1.2rem;
    font-weight: 600;
    color: #FFFFFF;
}
</style>
