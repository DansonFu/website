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
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.css">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap-theme.min.css">
  <!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<!-- mycss -->
	<link rel="stylesheet" href="<%=basePath%>css/styles.css">
</head>

<body>
		<div class="form-div">
			<form action="">
			<!-- search begin-->
			<div class="row">
			  <div class="col-lg-2">
			    <div class="input-group">
			      <input type="text" class="form-control" placeholder="Search for...">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="button">Go!</button>
			      </span>
			    </div><!-- /input-group -->
			  </div><!-- /.col-lg-6 -->
			</div><!-- /.row -->
			<!-- search end-->
				<!-- Table begin-->
			  <table class="table table-bordered table-hover table-striped">
			   		<thead>
			   			<tr>
			   				<th>1</th>
			   				<th>2</th>
			   				<th>3</th>
			   				<th>4</th>
			   			</tr>
			   		</thead>
			   		<tbody>
			   			<tr>
			   				<th>1</th>
			   				<td>123</td>
			   				<td>123</td>
			   				<td>123</td>
			   			</tr>
			   			<tr>
			   				<th>1</th>
			   				<td>123</td>
			   				<td>123</td>
			   				<td>123</td>
			   			</tr>
			   			<tr>
			   				<th>1</th>
			   				<td>123</td>
			   				<td>123</td>
			   				<td>123</td>
			   			</tr>
			   			<tr>
			   				<th>1</th>
			   				<td>123</td>
			   				<td>123</td>
			   				<td>123</td>
			   			</tr>
			   		</tbody>
			  </table>
			  <!-- Table end-->
			  <!-- 分页开始 -->
					  <nav aria-label="Page navigation">
					  <ul class="pagination">
					    <li>
					      <a href="#" aria-label="Previous">
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <li><a href="#">1</a></li>
					    <li><a href="#">2</a></li>
					    <li><a href="#">3</a></li>
					    <li><a href="#">4</a></li>
					    <li><a href="#">5</a></li>
					    <li>
					      <a href="#" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
					</nav>
					<!-- 分页结束 -->
			</form>
		</div>
</body>
</html>

