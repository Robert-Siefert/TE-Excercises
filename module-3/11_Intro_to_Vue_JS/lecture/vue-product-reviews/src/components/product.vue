<template>
  <div class="main">
      <h2>Product Review for {{name}} </h2>
      <p class="description"> {{description}} </p>
    </div>
</template>

<script>
export default {
    name: 'product',
    data() {
        return {
            name: 'Dylan: a cautionary tale',
            description: 'a bad book for bad people'
        }
    }

}
</script>

<style scope>
div.main {
    margin: 1rem 0;

}

</style>