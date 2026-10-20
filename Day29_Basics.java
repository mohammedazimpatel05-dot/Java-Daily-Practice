const animal = { speaks: true }; 
const dog = Object.create(animal); 

console.log(dog.speaks); // Output: true
