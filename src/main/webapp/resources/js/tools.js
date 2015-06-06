(function(){
	$(document).ready(function () {
		$('.anchor').click(function(){
			// Remove active states from nav
			$('.nav-list li').removeClass('active');
			// Add active state to selected nav
			$(this).parent().addClass('active');
		    // Animate scroll of body
		    $('html, body').animate({
		        scrollTop: $( $.attr(this, 'href') ).offset().top
		    }, 700, 'swing');
		    return false;
		});
	});
})();