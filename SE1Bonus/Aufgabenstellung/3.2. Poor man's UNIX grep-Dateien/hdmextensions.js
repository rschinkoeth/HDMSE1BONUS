$(document).ready(function() {
    $("input.hdm-toggle-qanda-answer").click(function() {
	$(this).next(".hdm-qanda-answer").toggle("explode");
	if (this.value == 'Show answer') {
	    this.setAttribute('value','Hide answer');
         } else {
	     this.setAttribute('value','Show answer');
	 }
    });
});
