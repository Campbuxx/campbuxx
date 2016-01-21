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

		<title>for upload file</title>

		<script type="text/javascript">
			
			
	</script>
	</head>

	<body>
		选择要上传的文件:
		<br />
		<form action="ajax/uploadFile" method="post"
				enctype="multipart/form-data" id="myForm">
		<table>
			<tr>
				<td>
					<label for="file">
						选择:
					</label>
				</td>
				<td>
					<input id="file" name="file" type="file" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交" onClick="uploadFile()" />
				</td>
				<td>
					<input type="reset" value="重置" />
				</td>
			</tr>
		</table>
		</form>
		<h3>${message}</h3>
	</body>
</html>
