// Corrected Syntax
const now = new Date(); 
console.log(now.toISOString());

// Output based on current system time
"2026-11-09T09:07:00.000Z"
  async function fetchData(username) {
  try {
    // 1. Initiate the network request
    const res = await fetch(`https://github.com{username}`);
    
    // 2. Check if the HTTP status code is OK (200-299)
    if (!res.ok) {
      throw new Error(`GitHub API error! Status: ${res.status}`);
    }
    
    // 3. Parse the stream data into a JavaScript object
    const data = await res.json();
    
    // 4. Return or use your data
    console.log(data);
    return data;

  } catch (error) {
    // 5. Handle network failures or parsing issues safely
    console.error("Failed to fetch GitHub data:", error.message);
  }
}

// Example usage:
fetchData('octocat');
