
// NEED TO KNOW:
//  array.forEach  -  to loop through each item in an array (does not return anything)   
//  array.filter   -  returns a new array but only items that evaluate to true get added to new array (e.g passes the filter)
//  array.reduce   -  returns a single value from doing something to elements in the array (e.g sum, average, etc)
//  array.map      -  returns a new array after adjusting or manipulating the elements in some way. (not super common)



const names = ['Ohio', 'Indiana', 'Florida', 'Texas', 'New York', 'North Dakota'];

for (let i=0; i < names.length; i++) {
    console.log(names[i]);
}

//for each function

names.forEach( printState  );

function printState(x) {
    console.log(x);
}

names.forEach ( x => {
    console.log(x);
})

//alternate way with a bunch of extra crap  (we can ask for index of where we are in the array AND the array itself)
names.forEach ( (name, index, arrayObj) => {
    if (index == 0) {
        console.log('Length of array is: ' + arrayObj.length);
    }
   console.log(name + ' was found at index ' + index);
})

//map - Use map when we want to alter or change each element in the array and it returns a new array with the changed element

const newStateArray = names.map( (state) => {
     
    //modify each element in the names array and return
    return state + " is a US state";

})

console.log(newStateArray);


// filter returns a new array but will only contain items that pass some sort of filter. 

const filteredArray = names.filter( (item) => {   
    //   if (item.startsWith('N')) {
    //       return true;
    //   }
    //   else {
    //       return false;
    //   }

      return item.startsWith('N');
})

console.log(filteredArray);



let scores = [100, 98, 95, 70, 35, 75, 80];

//reduce - takes all the values and reduces it down to a single value (sum, avg, findlargest, etc)

const result = scores.reduce( (runningTotal, value) => {
      return runningTotal += value;
});

console.log(result);

