<template>
   <div>
       <div id = "container">
            <img id="banner-image" src="../assets/java-green.png" alt="">
            <h1>{{pageTitle}}</h1>
            <nav>
                 <router-link v-bind:to="{ name: 'home'}">Home</router-link>
                <a href="#">About</a>
                <router-link v-bind:to="{ name: 'search'}">Search</router-link>
                <a href="#">Add Home</a>
                <a href="#">Get Weather</a>
                <a href="#">Picture of the Day</a>
            </nav>
       </div> 

   </div>
</template>

<script>
export default {
    name: 'the-header',
    data() {
        return {
            pageTitle: 'Java Green Homes'
        }
    }

}
</script>

<style scoped>
  #container {
     display: flex;
     flex-direction: column;
     justify-content: center;
     align-items: center;
  }

  #banner-image {
      width: 20%;
      height: auto;
  }

  nav a {
      padding: 15px 25px;
      background-color: rgb(3, 189, 3);
      color:black
  }

  nav a:hover {
      background-color: green;
      color: white;
  }
</style>