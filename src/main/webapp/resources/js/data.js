// Initialize createJS
var queue = new createjs.LoadQueue(false);
// Images to load
var images = [
       {id: "001", src: "resources/images/001.jpg"},
       {id: "002", src: "resources/images/002.jpg"},
       {id: "003", src: "resources/images/003.jpg"},
       {id: "004", src: "resources/images/004.jpg"},
       {id: "005", src: "resources/images/005.jpg"},
       {id: "006", src: "resources/images/006.jpg"},
       {id: "007", src: "resources/images/007.jpg"},
       {id: "008", src: "resources/images/008.jpg"},
       {id: "009", src: "resources/images/009.jpg"},
       {id: "0010", src: "resources/images/010.jpg"},
       {id: "0011", src: "resources/images/011.jpg"}
];

// Event listener for when file is uploaded
function hndlUpload(event)
{
      console.log('File '+event.item.id+' loaded: '+event.item.type);
}
// EventListener to track upload progress function
function hndlProgress(event)
{    
      console.log('File loading: '+ (queue.progress*100|0) +" % Loaded");
}
// EventListener when error occurred
function loadError(event)
{
      console.log("An Error occurred: "+ event.text);
}
// When All files have loaded
function loadComplete(event)
{
      var $gallery_wrapper = $('.gallery-wrapper');
      for (var i  = 0; i < images.length; i++)
      {
            var img = queue.getResult(images[i].id);
            var img_wrapper = '<div class="gallery-img"><img src="'+img.src+'" /></div>';
            $gallery_wrapper.append(img_wrapper);
      }
      $gallery_wrapper.append('<div class="clear-left"></div>');
}

// Add event listeners
queue.addEventListener('complete', loadComplete);
queue.addEventListener("fileload", hndlUpload);
queue.addEventListener("progress", hndlProgress);
queue.addEventListener("error", loadError);
queue.loadManifest(images);