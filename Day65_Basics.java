const observer = new IntersectionObserver(entries => entries.forEach(entry => {
  if (entry.isIntersecting) {
    // Runs when the element enters the screen
    entry.target.classList.add('visible');
    
    // Optional: Stop watching the element once it has appeared
    // observer.unobserve(entry.target);
  }
}), {
  threshold: 0.1 // Trigger when 10% of the element is visible
});

// Tell the observer which elements to watch
document.querySelectorAll('.target-element').forEach(el => {
  observer.observe(el);
});
