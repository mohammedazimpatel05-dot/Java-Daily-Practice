document.getElementById("list").addEventListener("click", (e) => {
    // Check if the clicked element is a list item (LI)
    if (e.target && e.target.tagName === "LI") {
        console.log("List item clicked:", e.target.textContent);
        // Add your logic here
    }
});
