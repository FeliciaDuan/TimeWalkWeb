$(document).ready(function(){
    //$('#sidebar').hide();
    $("#menu").click(function(){
        $('#sidebar').show();
    });

    $("#menu").click(function(e){
    　　 $("#sidebar").show();
    　　 $(document).click(function(){
    　　　　 $("#sidebar").hide();
    　　 });
        e.stopPropagation();

    });

　　$("#sidebar").click(function(e){
   　　 e.stopPropagation();
   });

    $("#tools").click(function(e){
    　　 $("#tool_bar").show();
    　　 $(document).click(function(){
    　　　　 $("#tool_bar").hide();
    　　 });
        e.stopPropagation();

    });

　　$("#tool_bar").click(function(e){
   　　 e.stopPropagation();
   });

　　$("#sidebar").click(function(e){
   　　 e.stopPropagation();
   });

    $("#share").click(function(e){
    　　 $("#share_list").show();
        $("#tool_bar").hide();

    　　 $(document).click(function(){
    　　　　 $("#share_list").hide();
    　　 });
        e.stopPropagation();

    });

　　$("#share_list").click(function(e){
   　　 e.stopPropagation();
   });

   $('#search').click(function(){
        window.location.href='spots.html';

   });

/*
    $('#search').click(function(){
        $('#h_s').html("<input id='search_text' type='text'><button type='button' id='go_search'>Go</button>");


    });

*/


});