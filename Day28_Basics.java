const canEat = { eat() { console.log("Eating"); } };

function Person(name) {
  this.name = name;
}

// Attach mixin to prototype so all instances inherit it
Object.assign(Person.prototype, canEat);

const person = new Person("John");
person.eat();
// Output: Eating
