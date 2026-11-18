const start = performance.now();

setTimeout(() => {
  console.log(`Elapsed time: ${performance.now() - start} ms`);
}, 1000); // Delay in milliseconds (e.g., 1000ms = 1 second)
