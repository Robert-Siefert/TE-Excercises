<template>
  <book-details v-bind:book="activeBook"/>
</template>

<script>
import BookDetails from '../components/BookDetails.vue'
export default {
  components: { BookDetails },
  computed:{
    activeBook(){  return this.$store.state.books.find((u) => {u.isbn == this.$store.state.activeIsbn}) }
  },
  created() {
    const activeIsbn = this.$route.params.isbn;
    this.$store.commit("SET_ACTIVE_BOOK", activeIsbn);


    
  }


}
</script>

<style>

</style>