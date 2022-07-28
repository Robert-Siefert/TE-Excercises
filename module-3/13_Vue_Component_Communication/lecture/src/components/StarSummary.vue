<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter()">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],        //TODO - explain props:
  methods: {
    updateFilter() {

      //TODO:  call mutation to reset the filter

    }
  },
  computed: {
    numberOfReviews() {

      //TODO:  get the reviews from the Vuex store
      const reviews = [];
      return reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === parseInt(this.rating) ? 1 : 0);
      }, 0);
    }
  }
};
</script>

