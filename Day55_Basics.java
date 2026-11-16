const target = { name: "Alex" };

const proxy = new Proxy(target, {
  get: (target, prop, receiver) => {
    console.log(`Reading property "${prop}"`);
    return Reflect.get(target, prop, receiver);
  }
});

console.log(proxy.name); 
// Logs: Reading property "name"
// Output: "Alex"
