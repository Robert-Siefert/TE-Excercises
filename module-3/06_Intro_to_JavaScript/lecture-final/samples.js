

console.log('Hello World!');


const students = ['Julia', 'Rob', 'Sasha'];

console.log(students);

const rob = students[1];
//console.log(rob);

students.push('Geoff');
// console.log(students);

let studentToRemove = students.pop();
// console.log(students);
// console.log(studentToRemove);


students.unshift('Justin');
console.log(students);

let shiftedName = students.shift();
console.log(shiftedName);
console.log(students);

for (let i = 0; i< students.length; i ++) {
    console.log(students[i]);
}



// let reversedArray = students.reverse();
// console.log(reversedArray);


function retrieveDan() {

    const person = {
        firstName: 'Dan',
        lastName: 'S',
        isNerd: true,
        address: {
            addressLine1: 'in a van down by the river',
            city: 'columbus'
        },
        age: 10
    }

    return person;

} 


const dan = retrieveDan();
console.log(dan);
console.log('Dan is ' + dan.age + ' years old');
console.log(' and Dan lives ' + dan.address.addressLine1);
console.log(`${dan.age}`);

if (dan.isNerd) {
    console.log('NERD!!!!')
}
else {
    console.log('! a nerd!');
}






