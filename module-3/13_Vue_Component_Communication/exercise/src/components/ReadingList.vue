<template>
  <div class="book-container">
  <book-card></book-card>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';

export default {
    components: {
      BookCard
    },
    name: 'reading-list'
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>