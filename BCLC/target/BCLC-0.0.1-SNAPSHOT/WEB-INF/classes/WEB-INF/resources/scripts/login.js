$(document).ready(function() {
	var errorMessage = $("#alert-box-text").text();
	if(errorMessage != "") {
		$("#alert-box").show();
	}
});