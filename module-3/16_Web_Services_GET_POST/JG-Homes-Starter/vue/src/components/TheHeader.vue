<template>
   <div>
       <div id = "container">
            <img id="banner-image" src="../assets/java-green.png" alt="">
    
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
      margin-bottom: 40px;
      width: 10%;
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