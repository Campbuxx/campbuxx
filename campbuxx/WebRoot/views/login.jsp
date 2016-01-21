
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>login</title>
		
	</head>

	<body>
	<form method="post" action="j_spring_security_check"> 

      <DIV class=kg1>管理员登录 </DIV>
      <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center>
        <TR>
          <TD width="30%" align=right>用户名： </TD>
          <TD width="70%"><input type='text' name='j_username' value=''> 
        </TD></TR>
        <TR>
          <TD width="30%" align=right>密 &nbsp; 码：</TD>
          <TD width="70%"><input type='password' name='j_password' />
          </TD></TR>
          </TABLE>
     <input type="submit" value="登录"/>
</form>
		This is my JSP page.path：<%=basePath%>
		<br>
	</body>
</html>
