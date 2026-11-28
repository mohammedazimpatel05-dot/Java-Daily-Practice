// 1. Create the canvas element in memory (note the missing '=' in your snippet)
const canvas = document.createElement("canvas");
canvas.width = 300;
canvas.height = 150;

// 2. Get the 2D drawing context
const ctx = canvas.getContext("2d");

// 3. Set the fill color (accepts CSS color names, hex, RGB, gradients, or patterns)
ctx.fillStyle = "blue"; // or "#3498db", "rgb(52, 152, 219)"

// 4. Draw something so the fillStyle is visible (e.g., a rectangle)
ctx.fillRect(20, 20, 150, 100);

// 5. Add the canvas to the webpage so you can see it
document.body.appendChild(canvas);
