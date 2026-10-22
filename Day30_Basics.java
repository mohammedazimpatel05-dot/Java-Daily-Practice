class Bank {
  constructor(bal) {
    this.bal = bal;
  }

  deposit(amt) {
    this.bal += amt;
    return this.bal;
  }

  withdraw(amt) {
    if (amt <= this.bal) {
      this.bal -= amt;
      return this.bal;
    } else {
      console.log("Insufficient funds");
      return this.bal;
    }
  }
}

// Example usage:
const myAccount = new Bank(1000);
myAccount.deposit(500);
console.log(myAccount.bal); // Output: 1500
