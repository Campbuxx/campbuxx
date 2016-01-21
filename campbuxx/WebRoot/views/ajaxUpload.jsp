<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>for ajax upload file</title>

		<script type="text/javascript">
			
			function excelExcute(){
				$.ajax( {
					type : 'post',
					contentType : 'application/json',
					url : 'ajax/excuteExcel',
					data: $("#img").value,
					dataType : 'json',
					success : function(data) {
						if (data && data.success) {
							alert(data.message);
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
		选择要上传的文件（.xls/.xlsx）:
		<br />
		<form:form action="ajax/excuteExcel" method="post"
				enctype="multipart/form-data">
		<table>
			<tr>
				<td>
					<label for="list">
						选择:
					</label>
				</td>
				<td>
					<input id="excelFile" name="list" type="file" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交" />
				</td>
				<td>
					<input type="reset" value="重置" />
				</td>
			</tr>
		</table>
		</form:form>
	</body>
</html>
