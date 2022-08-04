<template>
  <div>
      <h3>Today's Weather</h3>
      <p>{{weather}}</p>
  </div>
</template>

<script>
export default {
    name: "weather-report",

    data() {
        return {
            weather: ''
        }
    },
    created() {

      fetch('http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=2f7bdcc26bc9669ab55f8341c4521509').then(response => {
          if (response.status != 200) {
              console.log(response.status);
              return;
          }

          response.json().then( data => {
              console.log(data);
              this.weather = data;
          });


      }).catch(error => {
          console.log(error);
      })

    }

}
</script>

<style>

</style>