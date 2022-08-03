<template>
  <book-details v-bind:isbn='this.$route.params.isbn'/>
</template>

<script>
import BookDetails from '../components/BookDetails.vue'
export default {
  components: { BookDetails },
  computed:{
    book(){
      return this.$store.state.books.find((u) => {
        u.isbn == this.$route.params.isbn
      });
      
    }
  }


}
</script>

<style>

</style>