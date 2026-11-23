fetch("https://api.github.com/invalid")
  .then((response) => {
    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`); // 404
    }
    return response.json();
  })
  .then((data) => console.log(data))
  .catch((error) => console.error("Fetch failed:", error));
