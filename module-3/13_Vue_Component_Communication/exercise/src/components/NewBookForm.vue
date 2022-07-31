<template>
  <form @submit.prevent="addBook()">
      <label>Title:</label>
      <input type='text' v-model="newBook.title" class="title-input">
      <label>Author:</label>
      <input type ='text' v-model="newBook.author" class = 'author-input'>
      <label>isbn:</label>
      <input type ='text' v-model="newBook.isbn" class = 'isbn-input'>
      <input type ='submit'>
  </form>    
</template>

<script>
export default {
    name: 'new-book-form',
    data() {
    return {

      newBook: {
          read: false
        
      }
    };
  },
  methods: {
      addBook(){
        this.$store.commit("ADD_BOOK", this.newBook)
      }
    }

}
</script>

<style>

</style>