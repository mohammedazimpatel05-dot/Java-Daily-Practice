const logger = (fn) => (...args) => {
  console.log("Calling...");
  return fn(...args);
};
