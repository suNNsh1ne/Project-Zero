////////////////////////
// jQuery no conflict //
////////////////////////

jQuery.noConflict();

var the_document	= jQuery( document );		// The document
var page_body		= jQuery( 'body' );			// The body

var this_window		= jQuery( window );										// The window element
var window_width	= Math.floor( parseFloat( this_window.width() ) );		// The total window width
var window_height	= Math.floor( parseFloat( this_window.height() ) );		// The total window height

the_document.ready( function() {
	
	jQuery( '<span class="menu_toggle tooltip" data-tooltip="Open / Close menu"><span class="fa fa-angle-left" aria-hidden="true"></span></span>' ).insertAfter( jQuery( '#cssmenu' ) );
	
});

the_document.on( 'click tap', '.menu_toggle', function( e ) {
	
	// Prevent the default event from occurring
	e.preventDefault();
	
	var has_left	= jQuery( this ).find( 'span.fa' ).hasClass( 'fa-angle-left' );
	var has_right	= jQuery( this ).find( 'span.fa' ).hasClass( 'fa-angle-right' );
	
	jQuery( this ).toggleClass( 'toggle_side' );
	jQuery( '#cssmenu' ).toggleClass( 'menu_hidden' );
	
	if ( has_left ) {
		jQuery( this ).find( 'span' ).removeClass( 'fa-angle-left' );
		jQuery( this ).find( 'span' ).addClass( 'fa-angle-right' );
	}
	
	if ( has_right ) {
		jQuery( this ).find( 'span' ).removeClass( 'fa-angle-right' );
		jQuery( this ).find( 'span' ).addClass( 'fa-angle-left' );
	}
	
});

////////////////////
// TOOLTIP ENGINE //
////////////////////

// Generation of tooltips
the_document.on( 'mouseover mousemove', '.tooltip', function( event ) {
	
	// Set up the tooltip contents
	var this_elem			= jQuery( this );
	var tooltip_txt			= this_elem.attr( 'data-tooltip' );
	var has_tooltip_cloud	= jQuery( 'body' ).find( '#tooltip_cloud' );
	var tooltip_elem		= jQuery( '#tooltip_cloud' );

	// Check if tooltip cloud exists?
	if ( ! has_tooltip_cloud ) {
		jQuery( 'body' ).append( '<div id="tooltip_cloud"></div>' );
	}
	
	// Fill tooltip content
	tooltip_elem.html( tooltip_txt );

	// First some calculations for tooltip position
	var tooltip_width		= jQuery( '#tooltip_cloud' ).width();
	var tooltip_height		= jQuery( '#tooltip_cloud' ).height();
	var center_body_width	= Math.floor( parseFloat( window_width / 2 ) );
	var center_body_height	= Math.floor( parseFloat( window_height / 2 ) );
	
	// Properly align X-position
	var x_pos = Math.floor( parseFloat( event.pageX - 10 - ( tooltip_width / 2 ) ) );
	tooltip_elem.css( 'left', x_pos + 'px' );
	
	// Properly align Y-position
	if ( event.pageY < 100 ) {
		tooltip_elem.addClass( 'cloud_triangle' );
		var y_pos = Math.floor( parseFloat( event.pageY - tooltip_height + 40 ) );
	} else {
		tooltip_elem.removeClass( 'cloud_triangle' );
		var y_pos = Math.floor( parseFloat( event.pageY - tooltip_height - 40 ) );
	}
	
	tooltip_elem.css( 'top', y_pos + 'px' );

	// Show the tooltip
	tooltip_elem.show();

});
	
	// Hide the tooltip
	the_document.on( 'mouseleave touchend', '.tooltip', function() {
		jQuery( '#tooltip_cloud' ).hide();
	});

	
	
	
	