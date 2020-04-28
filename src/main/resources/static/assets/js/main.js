(function ($) {
    "use strict";


    jQuery(document).ready(function($){

      
        //=======================================
        //    counterUp
        //========================================
        $('.count-up').counterUp({
            delay: 10,
            time: 1000
        });
        
        //=======================================
        //    wow
        //========================================
        new WOW().init();


        // Header js
        var nav_offset_top = $('header').height() + 100; 
    
		//* Navbar Fixed  
		function navbarFixed(){
			if ( $('header').length ){ 
				$(window).on('scroll', function() {
					var scroll = $(window).scrollTop();   
					if (scroll >= nav_offset_top) {
						$("header").addClass("navbar_fixed");
					} else {
						$("header").removeClass("navbar_fixed");
					}
				});
			};
		};
		navbarFixed();
        
        //=======================================
        //   testimonial carousel
        //========================================
        var testimonialCarousel = $('.testimonial-slider');
        testimonialCarousel.owlCarousel({
            loop: true,
            dots: true,
            nav: false, 
            margin: 30,
            autoplay: true,
            autoplayTimeout: 2000,
            autoplayHoverPause: true,
            responsive: {
                0: {
                    items: 1
                },
                768: {
                    items: 1
                },
                960: {
                    items: 1
                },
                1200: {
                    items: 1
                },
                1920: {
                    items: 1
                }
            }
        }); 


        //=======================================
        //    magnific popup
        //========================================
        $('.venobox').magnificPopup({
            type: 'video'
        });
        $('.image-popup').magnificPopup({
            type: 'image'
        }); 
        
        $('.scroll-to-top').on('click', function () {
            $("html,body").animate({
                scrollTop: 0
            }, 1000);
        });

 
    });

    $(window).on('load',function(){
        //=======================================
        //    preloader
        //========================================
        var preLoder = $(".preloader");
        preLoder.fadeOut(1000);
       
    });
    
}(jQuery));	







