// 1. Create the observer with a valid arrow function callback
const observer = new MutationObserver((mutations) => {
  console.log("DOM update", mutations);
});

// 2. Tell the observer which element to watch and what changes to look for
observer.observe(document.body, {
  childList: true, // Watches for added or removed elements
  attributes: true, // Watches for attribute changes (like class or style)
  subtree: true // Watches all nested elements inside the target
});
