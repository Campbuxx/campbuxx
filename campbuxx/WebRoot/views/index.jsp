<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		<script type="text/javascript" src="js/jquery-1.7.2.js"></script>

		<title>TEST</title>

		<script type="text/javascript"><!--
			
			function getDataText(distance ){
				$.ajax( {
					type : 'post',
					contentType : 'application/json',
					url : 'ajax/getText',
					dataType : 'json',
					data: {'distance':distance},
					success : function(data) {
						if (data && data.success) {
							var str="<table border=\"1\">"; 
 								str+=data.result;  
     						str+="</table>";  
     						$("#res").empty();
     						$("#res").append(str); 
							
						}
					},
					error : function() {
						alert("error");
					}
				});
			}
			
	</script>

	</head>

	<body>
		<div id="manage">
			随机选餐系统
			<table>
				 
			</table>
		</div>
		<br />
		<hr />


		<div>
			<a href="#" onClick="getDataText(0)" id="get">获取随机餐厅</a>
		</div>
		
		<div id="res"> </div>
	</body>
</html>
