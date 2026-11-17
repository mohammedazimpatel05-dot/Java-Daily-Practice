const obj = { x: 10, y: 20 };
Reflect.deleteProperty(obj, "x");
console.log(obj); 
// Output: { y: 20 }
