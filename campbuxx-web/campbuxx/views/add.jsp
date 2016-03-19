<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Add New</title>

<link  rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/tiny_mce/tiny_mce.js"></script>
<script type="text/javascript">

tinyMCE.init({
		mode : "textareas",
		theme : "simple"
	});
	
$(document).ready(function(){ 
	isLogin();
})



</script>
</head>

<body  >
<div id="main" align="center">

<div id="top">
	<div id="titletop" align="center">

	<div id="topmain">
    
    <div class="title"> <span class="text"> Campus Trading Center</span></div>
    
    
    <div class="navi" id="b2"><a href="index" > Go Back </a></div>
    <span class="welcome"> Welcome, <%=session.getAttribute("student_ID")%></span>
    </div>

	</div>
</div>

<div id="content" align="center">

	<div class="box"  align="center">
    	<div class="add_table">
    	
        <form action="savePost"  method="post" enctype="multipart/form-data">
           <table>
           		<tr class="add_tr">
                	<td class="add_td" align="center">Item name</td>
                    <td><input type="text" size="20" name="title" /></td>
                </tr>
                <tr class="add_tr">
                	<td class="add_td" align="center">Item image</td>
                    <td ><input type="file" name="img" size="20"/></td>
                </tr>
                <tr class="add_tr">
                	<td class="add_td" align="center">Item Category</td>
                    <td ><select name="category">	
                    					<option value="1">books</option>
                    					<option value="2">stationery</option>
                    					<option value="3">laptops</option>
                    					<option value="4">job offers</option>
                    					<option value="5">activities</option>
                    					<option value="6">others</option>  
                      			</select>
                    </td>
                </tr>
                <tr class="add_tr">
                	<td class="add_td" align="center">Item describe</td>
                    <td><textarea  cols="55" rows="10" name="contents" ></textarea></td>
                </tr>
                <tr class="add_tr">
                	<td class="add_td" align="center"><input type="submit" name="submit" value="submit" /></td>
                    <td ><input type="reset" value="Reset" /></td>
                </tr>
                <tr class="message">
                	${message }
                </tr>
            </table>
           
           <input type="hidden" value="<%=session.getAttribute("student_ID")%>" name="studentID" /> 
           </form>
          
       </div>
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



 <div id="black_box" align="center" style="display: none;">
 </div>

<div id="login_back" align="center">
        
        <div class="login" align="center">
                   <p><h3> login</h3></p>
            	
            		<form>
                	<p>student ID:<input type="text" id="name" name="username" size="15" /></p>
                    <p>password：<input type="password" id="password" name="password" size="16" /></p>
                    <hr />
                    <p> <a href="#" onClick="add_login()" > login</a></p>  
                    </form>
                    <p> <br />
                    <input type="hidden" id="session_student_id" value="<%=session.getAttribute("student_ID")%>" /></p>
              
                
         </div>
</div>









</body>
</html>
