// 1. Create the event (added the missing '=' sign)
const event = new CustomEvent("userLogin", { 
  detail: { id: 1 } 
});

// 2. Dispatch the event on the document
document.dispatchEvent(event);
     const debounce = (func, delay) => {
  let timeoutId;

  return (...args) => {
    // Cancel the previous timer if the function is called again within the delay
    clearTimeout(timeoutId);

    // Start a new timer
    timeoutId = setTimeout(() => {
      func.apply(this, args);
    }, delay);
  };
};
