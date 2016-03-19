<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>main</title>

<link  rel="stylesheet" type="text/css" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="resources/js/index.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	$(".box tr:odd").addClass("even");					   
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
    
    
    <div class="navi" id="b2"><a href="addNew" > ADD A NEW </a></div>
    <span class="welcome"> Welcome, <%=session.getAttribute("student_ID")%></span>
    </div>

	</div>
</div>

<div id="content" align="center">

	<div class="box"  align="center">
           <table id="list_table" >
           		<tr class="table_title">
                	<td class="first">Item category</td>
                    <td class="second">Item Describe</td>
                    <td class="third">Date </td>
                </tr>
                <c:forEach var="item" items="${list}">
                <tr class="table_item">
                	<td class="first">${item.category_trans}</td>
                    <td class="second"><a href="postDetail?id=${item.id}&pageNum=${pageNum}">${item.title }</a></td>
                    <td class="third">${item.createDate}</td>
                </tr>
                </c:forEach>
                
           
           
           </table>
            <span class="page"> <a href="index?page=${pageNum-1}"> privious </a> ${pageNum}/${pageCount} <a href="index?page=${pageNum+1}" > next </a></span>	
            <span><br /><br /><br /></span>
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
                    <p> <a href="#" onClick="index_login();" > login</a></p>  
                    </form>
                    <p> <br /><input type="hidden" id="session_student_id" value="<%=session.getAttribute("student_ID")%>" />
                    </p>
              
                
         </div>
</div>


<input type="hidden" name="studentId"/>






</body>
</html>
