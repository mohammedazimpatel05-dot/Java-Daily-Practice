document.forms[0].addEventListener("submit", (e) => {
  if (!e.target.email.value.trim()) {
    e.preventDefault(); // Stops the form from submitting
    alert("Please enter an email address.");
    e.target.email.focus(); // Moves the cursor back to the email input
  }
});
