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
                 <form class="form-inline" role="form" action="" method="get">
	                <div class="tableoptions" style="padding-left: 15px;">
	                	<button class="deletebutton radius3"  title="table2">删除所有</button> &nbsp;
	                    <!-- <select class="radius3">
	                    	<option value="">展示所有</option>
	                        <option value="">Rendering Engine</option>
	                        <option value="">Platform</option>
	                    </select> --> &nbsp;&nbsp;&nbsp;
		                	 <div class="input-group input-medium date-picker input-daterange" data-date-format="yyyy-mm-dd">
							    <span class="field"><input name="dtBegin" class="datepicker form-control" style="font-size: 13px;" type="text" value="" placeholder="开始时间"></span>
							    <span class="input-group-addon">到</span>
							    <span class="field"><input name="dtEnd" class="datepicker form-control" style="font-size: 13px;" type="text" value="" placeholder="结束时间"></span>
							</div>
		                     <span class="field"><input type="text" name="input1" style="height: 35px;width:200px;" class="smallinput" placeholder="请输入搜索内容"/></span><button type="submit" class="radius3">查询</button>
	                		<button class="radius3" onclick="adds();">添加</button>
	                	</div><!--tableoptions-->	
                    </form>
                <table cellpadding="0" cellspacing="0" border="0" id="table2" class="stdtable stdtablecb table-striped table-hover">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1" style="text-align: center;">编号</th>
                            <th class="head0" style="text-align: center;">七牛</th>
                            <th class="head1" style="text-align: center;">图片</th>
                            <th class="head0" style="text-align: center;">创建时间</th>
                            <th class="head1" style="text-align: center;">修改时间</th>
                            <th class="head0" style="text-align: center;">操作</th>
                        </tr>
                    </thead>
                    <tbody>
	                        <tr>
	                        	<td align="center"><input type="checkbox" /></td>
	                            <td>Trident</td>
	                            <td>Internet Explorer 4.0</td>
	                            <td>Win 95+</td>
	                            <td class="center">4</td>
	                            <td class="center">X</td>
	                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
	                        </tr>
                    </tbody>
                </table>
       <script type="text/javascript">
       $(".datepicker").datepicker({
    	    language: "zh-CN",
    	    autoclose: true,//选中之后自动隐藏日期选择框
    	    clearBtn: true,//清除按钮
    	    todayBtn: true,//今日按钮
    	    language:'zh-CN',
    	    format: "yyyy-mm-dd"//日期格式，详见 http://bootstrap-datepicker.readthedocs.org/en/release/options.html#format
    	});
       
       function adds(){
    	   window.location.href = "picture/add";
       }
       </script>
</body>
</html>

