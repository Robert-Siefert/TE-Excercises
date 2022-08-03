<template>
  <div>
    <h2 class="book-title">{{ book.title }}</h2>
    <h3 class="book-author">{{ book.author }}</h3>
    <img
      v-if="book.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'
      "
    />
    <h3>{{ readText }}</h3>
  </div>
</template>

<script>
export default {
  name: "book-details",
  props: ["book"]
  
};
</script>

<style>
</style>