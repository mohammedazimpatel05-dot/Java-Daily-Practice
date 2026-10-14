class Parent {
  show() {
    console.log("Parent");
  }
}

class Child extends Parent {
  show() {
    console.log("Child");
  }
}

const obj = new Child();
obj.show(); // Outputs: Child
