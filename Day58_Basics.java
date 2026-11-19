// 1. Create the custom event (added the missing '=' sign)
const event = new CustomEvent("userLogin", { 
  detail: { id: 1 } 
});

// 2. Listen for the event elsewhere in your code
document.addEventListener("userLogin", (e) => {
  console.log("User logged in with ID:", e.detail.id); // Outputs: 1
});

// 3. Dispatch (trigger) the event on the document
document.dispatchEvent(event);
