/**
 * Created by forest on 14/11/11.
 */
$(document).ready(function(){
    if ($(window).width() > 720) {
        $.ajax({
            url: 'news.php',
            beforeSend: function() {
                // Display loader in the news column
                $('.spinner').css({
                    display: 'inline-block'
                });
            },
            type: 'GET',
            dataType: 'json',
            data: {
                func: 'getNews'
            }
        }).done(function(data){
            // Success
            var item = '';
            for (var i = 0; i < data.length;i++) {
                item += '<div class="news-item">';
                item += '<img src="'+data[i].images['thumb']+'" />';
                item += '<h4>'+data[i].title+'</h4><hr />';
                item += '<p>'+data[i].intro+'</p>';
                item += '</div>';
                $('.news').append(item);
                item = '';
            }

        }).fail(function(){
            // Failed
            //$('.news').append('<p>Could not connect to the news source.</p>');
        	var item = '';
        	item += '<div class="news-item">';
        	item += '<h4>My best coffee story (By Pierre Lasante)</h4><hr/>';
        	item += '<p>I like the Maxwell House Tassimo coffee.</p>'
        	item += '</div>';
        	$('.news').append(item);
        	
        	item = '';
        	item += '<div class="news-item">';
        	item += '<h4>Another best coffee story (By Karo Spenard)</h4><hr/>';
        	item += '<p>I like the President Choice Tassimo coffee.</p>'
        	item += '</div>';
        	$('.news').append(item);

        }).always(function(){
            // Always run this code.
            // Remove spinner
            $('.spinner').remove();
        });

    } else {
        $('.right').remove();
        $('.left').addClass('col-full');
    }
});