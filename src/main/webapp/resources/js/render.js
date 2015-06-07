(function(window, $) {
	window.renderEngine = {
		init: function() {
			if ($(window).width() > 720) {
				this.addGallery();
			} else {
				this.removeGallery();
			}
			
			$('.gallery-img').bind('click', function() {
				renderEngine.showImage($(this));
			});
		},
		addGallery: function() {
			var gallery = '<div id="gallery"><h4>Click on an image to create a modal</h4><ul>';
			var images = this.getGalleryImages();
			for (var i = 0; i < images.length; i++ ) {
				gallery += '<li><img class="gallery-img" src="'+images[i].thumb_src+'" title="'+images[i].title+'" width="100" data-src="'+images[i].src+'" /></li>';
			}
			gallery += '</ul></div>';
			$('#gallery-container').append(gallery);
		},
		removeGallery: function() {
			alert("remove gallery");
		},
		getGalleryImages: function() {
			return [ {
			    src: 'resources/images/thumbs/001.jpg',
			    thumb_src: 'resources/images/thumbs/001.jpg',
			    title: 'One'
			},
			{
				src: 'resources/images/thumbs/002.jpg',
			    thumb_src: 'resources/images/thumbs/002.jpg',
			    title: 'Two'
			},
			{
				src: 'resources/images/thumbs/003.jpg',
			    thumb_src: 'resources/images/thumbs/003.jpg',
			    title: 'Three'
			},
			{
				src: 'resources/images/thumbs/004.jpg',
			    thumb_src: 'resources/images/thumbs/004.jpg',
			    title: 'Four'
			}
			];
		},
		showImage: function($image) {
			var height = $(window).height() * 0.8;
			var width = $(window).width * 0.8;
			var left = ($(window).width() / 2) - width / 2;
			var top = ($(window).height() / 2) - height / 2;
			
			var imgHeight = height * 0.8;
			var modalStyle = 'style="width: '+width+'px; height:'+height+'px; left: '+left+'px; top: '+top+'px;"';
            var modal = '<div id="gallery-modal" class="modal">';
            modal += '<div class="overlay"></div>';
            modal += '<div class="modal-body" '+modalStyle+'>';
            modal += '<div class="modal-close" onclick="renderEngine.removeModal()">X</div>';
            modal += '<h2>'+$image.attr('title')+'</h2><hr />';
            modal += '<img src="'+$image.attr('data-src')+'" height="'+imgHeight+'" style="height:'+imgHeight+'px; width:'+imgHeight+'px;"/>';
            modal += '</div>';
            modal += '</div>';
            $('body').append(modal);
		},
		removeModal: function() {
			var modal = document.getElementById('gallery-modal');
            $(modal).fadeOut(600);
            setTimeout(function(){
                $('.modal').remove();
            },700);
		}
	};
})(window, jQuery);