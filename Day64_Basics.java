async function fetchMultiple() {
  try {
    // 1. Start both requests at the exact same time
    const responses = await Promise.all([
      fetch("https://api.github.com"),
      fetch("https://github.com")
    ]);

    // 2. Check if any request failed (e.g., 404 or 500 error)
    for (const res of responses) {
      if (!res.ok) {
        throw new Error(`HTTP error! Status: ${res.status}`);
      }
    }

    // 3. Parse all responses to JSON concurrently
    const data = await Promise.all(responses.map(res => res.json()));
    
    console.log(data); // Array containing the results of both fetches
  } catch (error) {
    console.error("One of the requests failed:", error);
  }
}

fetchMultiple();
