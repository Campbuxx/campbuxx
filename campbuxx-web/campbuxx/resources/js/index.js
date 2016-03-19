// JavaScript Document





//  show login
function login()
{
	var $back = $(".back") ;
	var $box = $("#black_box") ;

	if($box.is(":visible")){
		$box.slideUp(500);
		$("#login_back,.login").slideUp(500);
		return false;
	}else{
		$("#login_back,.login ").slideDown(500);
		$box.css("opacity","0.3").show(500);
		return false;
	}
}


function index_login(){
	var name = $('#name').val();
	var password = $('#password').val();
	$.ajax({
		type:"post",
		url:"login",
		data:{sid:name , pwd:password},
		dataType : 'json',
		success:function(data){
			if (data && data.success=="true") {
				$(".welcome").empty().append("welcome , "+data.sid); 
				login();
			}else{
				alert(data.message);
			}
			
		}
		
	});
}

function isLogin(){
	var name;
	name = $('#session_student_id')[0].value;
	if( name == null || name == "" || name == "null" ){
		login();
		return false;
	}else{
		return true ;
	}
	return false;
}

function add_login(){
	var name = $('#name').val();
	var password = $('#password').val();
	$.ajax({
		type:"post",
		url:"login",
		data:{sid:name , pwd:password},
		dataType : 'json',
		success:function(data){
			if (data && data.success=="true") {
				$(".welcome").empty().append("welcome , "+data.sid); 
				location.reload();
			}else{
				alert(data.message);
			}
			
		}
		
	});
}

function save_item(){
}


