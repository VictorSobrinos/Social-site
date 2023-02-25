<template>
    <div class="app bc">
        <Navbar></Navbar>
        <router-view class="" :GameInfo="GameInfo" />

    </div>
</template>

<script>
//import { ref } from 'vue';
import Navbar from './components/Navbar.vue'

export default {
    components: {
        Navbar
    },
    props: {
        GameInfo: Object
    }
}
</script>

<style>
body {
    background-image: url("https://img.freepik.com/fotos-premium/fondo-blanco-simple-lineas-suaves-colores-claros_476363-5857.jpg?w=2000");
    mask-repeat: no-repeat;
    width: 100%;
    /*width: fit-content;*/
}

/*background-color: red;*/
</style>