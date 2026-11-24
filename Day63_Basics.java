Promise.all([
  fetch("https://api.github.com"),
  fetch("https://github.com") // Your second URL here
])
  .then((responses) => {
    // Check if all requests succeeded
    responses.forEach((response) => {
      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }
    });
    // Parse all responses as JSON concurrently
    return Promise.all(responses.map((res) => res.json()));
  })
  .then(([githubRootData, userData]) => {
    console.log("Root API:", githubRootData);
    console.log("User Data:", userData);
  })
  .catch((error) => {
    console.error("One of the requests failed:", error);
  });
