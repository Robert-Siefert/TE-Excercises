<template>
  <div>
    <div id="container">
      <div id="search">
        <label for="zip"
          >Enter Your Zip Code To Find Your Next Dream Home</label
        >
        <input type="text" name="zip" v-model="zipFilter"/>
      </div>
      <p v-if="filteredHomes.length == 0">No homes found</p>
      <div id="main-div" v-if="filteredHomes.length > 0">
        <div class="divTable minimalistBlack">
          <div class="divTableHeading">
            <div class="divTableRow">
              <div class="divTableHead">Image</div>
              <div class="divTableHead">Address</div>
              <div class="divTableHead">#Bedrooms/Bathroom</div>
              <div class="divTableHead">Description</div>
              <div class="divTableHead">Price</div>
            </div>
          </div>
          <div class="divTableBody">
            <div class="divTableRow" v-for="home in filteredHomes" v-bind:key="home.mlsNumber">
              <div class="divTableCell">
                   <img v-bind:src=getImageURL(home.imageName)>
                   <div>MLS ID# {{home.mlsNumber}}</div>
              </div>
              <div class="divTableCell">{{home.address.addressLine}} 
                   <div>    
                     {{home.address.city}}, {{home.address.state}} {{home.address.zip}}
                  </div>
              </div>
              <div class="divTableCell">{{home.numberOfBedrooms}} / {{home.numberOfBathrooms}} </div>
              <div class="divTableCell">{{home.shortDescription}}</div>
              <div class="divTableCell">${{(home.price).toFixed(2)}}</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

import homeService from "../services/HomeService.js";

export default {

  name: "home-search",
  data() {
    return {
       zipFilter: '',
       homes: []
    };
  },
  computed: {

      filteredHomes() {
   
        return this.homes.filter( home => {
             return this.zipFilter == '' ? true : this.zipFilter == home.address.zip;
        });

      }

  },
  created() {

    homeService.search().then( response => {
       this.homes = response.data;
    })

  },
  methods : {
    getImageURL(pic) {
      return require('../assets/' + pic)
    }

  }

};
</script>

<style scoped>

#container {
    display: flex;
    flex-direction: column;
    align-items: center;
}

#search {
    margin:40px;
}

input[type=text] {
    margin:30px;
    padding: 12px 20px;
    border: 2px solid green;
    border-radius: 3px;
}

img{
   width:150px;
   height:150px;

/*Scale down will take the necessary specified space that is 100px x 100px without stretching the image*/
    object-fit:scale-down;

}


div.minimalistBlack {
  margin: auto;
  border: 2px solid #06b712;
  width: 80%;
  text-align: left;
  border-collapse: collapse;
}
.divTable.minimalistBlack .divTableCell,
.divTable.minimalistBlack .divTableHead {
  border: 1px solid #000000;
  padding: 5px 4px;
}

.divTable.minimalistBlack .divTableBody .divTableCell {
  font-size: 14px;
}
.divTable.minimalistBlack .divTableHeading {
  background: #1dff2c;
  background: -moz-linear-gradient(top, #55ff61 0%, #33ff41 66%, #1dff2c 100%);
  background: -webkit-linear-gradient(
    top,
    #55ff61 0%,
    #33ff41 66%,
    #1dff2c 100%
  );
  background: linear-gradient(to bottom, #55ff61 0%, #33ff41 66%, #1dff2c 100%);
  border-bottom: 3px solid #0f9a39;
}
.divTable.minimalistBlack .divTableHeading .divTableHead {
  font-size: 15px;
  font-weight: bold;
  color: #109902;
  text-align: left;
}
.minimalistBlack .tableFootStyle {
  font-size: 14px;
}
/* DivTable.com */
.divTable {
  display: table;
  table-layout: fixed;
}
.divTableRow {
  display: table-row;
}
.divTableHeading {
  display: table-header-group;
}
.divTableCell,
.divTableHead {
  display: table-cell;
}
.divTableHeading {
  display: table-header-group;
}
.divTableFoot {
  display: table-footer-group;
}
.divTableBody {
  display: table-row-group;
}
</style>