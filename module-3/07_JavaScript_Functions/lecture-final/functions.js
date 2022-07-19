//named functions


function sum(x,y) {
    return x + y;
}

console.log(sum(1,2));
console.log(sum(5,5));



//functional expression
// let x = function sum2(a,b) {
//     return a + b;
// } 

// console.log(x(2,2));

// convert the above into an anonymous function
// const sum2 = function (a,b) {
//    return a + b;
// }

//console.log(sum2(3,3));

// turn above anonymous function into cleaner,slicker code...(optimized for space) - using arrow operator
// const sum2 =  (a,b) => {
//        return a + b;
//      }

//1. start with a named function
// function multiply(a,b) {
//     return a * b;
// }     

//2. convert into a functional expression
// const xyz = function (a,b) {
//     return a * b;
// }


//3.  word function is redundant so lets remove and add the arrow operator
// const xyz =  (a,b) => {
//     return a * b;
// }


const newExample = (a,b,c) => {
    //whatever we want to do with
}



// you can pass function as parameters into other functions
function clicketyClick(func, num1, num2) {
    console.log(func(num1, num2));
}


clicketyClick(multiply, 5, 5);
clicketyClick(sum, 5, 5);


clicketyClick( (a,b) => {return a-b},  6, 3 );




// sets a default value of 1 if not provided
function multiply(a=1,b=1) {
    return a * b;
}     

console.log(multiply(5,4));
console.log(multiply(5));

function methodWithUnknownArgs() {

   const numberOfArgs = arguments.length;
   console.log(numberOfArgs);

//   const argsAsArray = Array.from(arguments);
//    for (let i = 0; i< argsAsArray; i++) {
//        console.log(argsAsArray[i]);
//    }

      for (let i=0; i<arguments.length; i++) {
          console.log(arguments[i]);
      }

}


methodWithUnknownArgs(1);
methodWithUnknownArgs(1, 'Example', true);
methodWithUnknownArgs(1, 'Example', true, 0);
methodWithUnknownArgs();


const args = [4,6];
console.log(multiply(...args));

