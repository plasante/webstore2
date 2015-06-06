jQuery(document).ready(function(){
	
	// cache the window object
	var win = $(window);
	console.log(win.height());
	// adjust the section to fit the size of the viewport
	if (win.width() > 480) {
		$('.full-h').css({
			height: win.height()
		});
	}
	// remove after resizing...
	$('.loader').remove();
});