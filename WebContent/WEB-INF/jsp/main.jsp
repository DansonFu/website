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
	
<link rel="stylesheet" href="<%=basePath%>css/style.default.css" type="text/css" />

<link rel="stylesheet" href="<%=basePath%>fonts/roboto.css">
</head>

<body>
		 <div class="contenttitle2">
                	<h3>Table with Action</h3>
                </div><!--contenttitle-->
                <div class="tableoptions">
                	<button class="deletebutton radius3" title="table2">删除所有</button> &nbsp;
                    <label></label>
                     <span class="field"><input type="text" name="input1" class="smallinput" placeholder="search for..." style="height: 30px;"/></span><button type="submit" class="radius3">查询</button>
                	<button class="radius3" onclick="adds();">添加</button>
                </div><!--tableoptions-->	
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
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                            <th class="head0">Options</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                            <th class="head0">&nbsp;</th>
                        </tr>
                    </tfoot>
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
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 5.0</td>
                            <td>Win 95+</td>
                            <td class="center">5</td>
                            <td class="center">C</td>
                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
                        </tr>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet  Explorer 5.5</td>
                            <td>Win 95+</td>
                            <td class="center">5.5</td>
                            <td class="center">A</td>
                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
                        </tr>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 6</td>
                            <td>Win 98+</td>
                            <td class="center">6</td>
                            <td class="center">A</td>
                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
                        </tr>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 7</td>
                            <td>Win XP SP2+</td>
                            <td class="center">7</td>
                            <td class="center">A</td>
                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
                        </tr>
                    </tbody>
                </table>
        <script type="text/javascript">
        	function adds(){
        		window.location.href="add";
        	}
        </script>
</body>
</html>

