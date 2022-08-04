<template>
   <div>
       <button v-on:click="getData">Click here to win a prize!</button>
       <p>{{info.explanation}}</p>
       <p>
          <img v-bind:src="info.url" alt="">
       </p>
   </div>
</template>

<script>

import nasaService from '../services/NasaService.js';

export default {

    name: 'nasa-pic',
    data() {
        return {
            info: ''
        }
    },
    methods: {
        getData() {
            nasaService.getNasaInformation().then( response => {
                this.info = response.data;
            });
        }
    }

}
</script>

<style scoped>

</style>