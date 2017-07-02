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
  <link rel="shortcut icon" href="#" type="image/png">
	
  <title></title>

	<!-- Bootstrap  -->
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap-theme.min.css">
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
  	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>
	<link rel="stylesheet" href="<%=basePath%>css/style.default.css" type="text/css" />
	<link rel="stylesheet" href="<%=basePath%>fonts/roboto.css">
	<style type="text/css">
		*{
  margin:0;
  padding:0;
}
.wrap{
  margin: 100px auto;
  width: 500px;
}
/* 方法一 start */
.method-1-wrap{
  position: relative;
  border: 1px solid #ccc;
  padding: 20px;
  box-sizing: border-box;
}
.method-1-wrap .title{
    position: absolute;
    top: -13px;
    left: 10%;
    line-height: 2em;
    padding: 0 1em;
    background-color: #fff;
}
	</style>
</head>

<body>

		
			<form class="form-inline" role="form">
		      <div class="method-1-wrap wrap">
				  <span class="title">添加</span>
					  <div class="content">
						<div class="form-group">
						        <label class="form-label"> 名 称 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<input class="form-control"  type="text" name="name">
								<br>
								<label class="form-label">上传图片</label>
								<span class="form-control"><input  type="file" name="file"></span>
				      </div>
				   </div>
			</div>
    	 </form>
</body>
</html>

