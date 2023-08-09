document.addEventListener("DOMContentLoaded", function() {

    // Only allow W or L inputs
    const inputs = document.querySelectorAll('input[type="text"]');
    inputs.forEach(input => {
        input.addEventListener('input', function() {
            if (this.value.toUpperCase() !== "W" && this.value.toUpperCase() !== "L") {
                this.value = "";
            }
        });
    });

    // Auto convert inputs to uppercase
    inputs.forEach(input => {
        input.addEventListener('keyup', function() {
            this.value = this.value.toUpperCase();
        });
    });
});
