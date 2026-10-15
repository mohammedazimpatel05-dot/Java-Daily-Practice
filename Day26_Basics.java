class Account {
  #balance = 0; // Fixed: added '=' assignment operator

  get balance() {
    return this.#balance;
  }
}
