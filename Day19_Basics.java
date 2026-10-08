try { 
    JSON.parse("invalid"); 
} catch (e) { 
    console.log("Error: " + e.message); 
}
