<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/xml" prefix = "x" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
  <%  
		String path = request.getContextPath();  
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
	%>  
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="ThemeBucket">
  <title></title>
 	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>
	<!-- 时间控件 -->
	 <script src="<%=basePath%>js/bootstrap-datepicker.js"></script>
	<link href="<%=basePath%>css/bootstrap-datepicker.css" rel="stylesheet" /> 
	<!-- Bootstrap  -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.css">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap-theme.min.css">
	<!-- 页面样式 -->
	<link rel="stylesheet" href="<%=basePath%>css/style.default.css" type="text/css" />
</head>
<body>
			<form class="form-control" action="">
				<fieldset>
					<legend>添加</legend>
					<span>名称<input type="text" name="name"></span>
					<span>上传图片<input type="file" name="file"></span>
				</fieldset>
			</form>
</body>
</html>

