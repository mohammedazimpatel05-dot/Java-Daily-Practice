function outer(x) { 
  return function inner(y) { 
    return x * y; // Added the multiplication operator
  }; 
} 

// Example usage:
const multiplyByFive = outer(5); 
console.log(multiplyByFive(3)); // Outputs: 15
