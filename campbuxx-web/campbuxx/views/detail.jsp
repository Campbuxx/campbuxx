<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Detail</title>

<link  rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<script type="text/javascript">

$(document).ready(function(){		   
	// login();
})



</script>
</head>

<body  >
<div id="main" align="center">

<div id="top">
	<div id="titletop" align="center">

	<div id="topmain">
    
    <div class="title"> <span class="text"> Campus Trading Center</span></div>
    
    <div class="navi" id="b2"><a href="index?pageNum=${pageNum }" > Go Back </a></div>
    <div class="navi" id="b2"><a href="addNew" > ADD A NEW </a></div>
    <span class="welcome"> Welcome, <%=session.getAttribute("student_ID")%> </span>
    </div>

	</div>
</div>

<div id="content" align="center">

	<div class="detail_box"  align="center">
           <div class="item_title" > <h1>${post.title }</h1></div>
           
           <div class="item_describe"> 
           		<div class="de_img"><img src="${post.image }" /></div>	
                <div class="de_desc"  align="left">
           			<span  > ${post.contents }</span>   
                </div>
           </div>
           
           <div class="item_seller"> seller information: <br />seller name: ${post.user.firstName }, ${post.user.lastName } <br />Phone Number: ${post.user.phone }</div>
    </div>
</div>

<div id="footer">
	<div id="footer" align="center">
		<div id="footermain" align="center">
    	copyright &copy; Group_1 2015-2016
    	</div>
	</div>
</div>

</div>



 <div id="black_box" align="center" style="display: none;width:100%;height:100%;background: #000;position:fixed; top:0px;">
 </div>

<div id="login_back" align="center">
        
        <div class="login" align="center">
                   <p><h3> login</h3></p>
            	
            		<form>
                	<p>student ID:<input type="text" id="name" name="username" size="15" /></p>
                    <p>password：<input type="password" id="password" name="password" size="16" /></p>
                    <hr />
                    <p> <a href="#" onClick="index_login()" > login</a></p>  
                    </form>
                    <p> <br /></p>
              
                <div class="back"><a href="#" onclick="login()" >== back  ==</a></div>
         </div>
</div>









</body>
</html>
