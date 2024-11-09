<script>
</script>
<template>
    <svg preserveAspectRatio="xMidYMid slice" viewBox="10 10 80 80">
        <defs>
        </defs>
        <!-- Burbujas transparentes con borde de color más fino -->
        <circle fill="none" stroke="#D4A5A5" stroke-width="0.2" class="bubble bubble-1" cx="20" cy="20" r="15" />
        <circle fill="none" stroke="#BFA5D4" stroke-width="0.2" class="bubble bubble-2" cx="40" cy="40" r="10" />
        <circle fill="none" stroke="#F3B4D4" stroke-width="0.2" class="bubble bubble-3" cx="60" cy="60" r="12" />
        <circle fill="none" stroke="#D4A5B5" stroke-width="0.2" class="bubble bubble-4" cx="80" cy="80" r="14" />
        <circle fill="none" stroke="#FA95AF" stroke-width="0.2" class="bubble bubble-5" cx="50" cy="30" r="20" />
        <circle fill="none" stroke="#FFB4C7" stroke-width="0.2" class="bubble bubble-6" cx="30" cy="70" r="18" />
    </svg>
</template>

<style scoped>
/* Animación de flotación para las burbujas */
@keyframes float {
    0% {
        transform: translateY(0) scale(1);
    }
    50% {
        transform: translateY(-20px) scale(1.1);
    }
    100% {
        transform: translateY(0) scale(1);
    }
}

/* Animaciones alternadas para cada burbuja */
.bubble-1 {
    animation: float 6s ease-in-out infinite;
}
.bubble-2 {
    animation: float 8s ease-in-out infinite;
}
.bubble-3 {
    animation: float 5s ease-in-out infinite;
}
.bubble-4 {
    animation: float 7s ease-in-out infinite;
}
.bubble-5 {
    animation: float 9s ease-in-out infinite;
}
.bubble-6 {
    animation: float 6.5s ease-in-out infinite;
}

/* Ajustes generales del SVG */
svg {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 95%;
    z-index: -1;
    border-radius: 8px;
    background-color: #1F1F1F;
}
</style>


