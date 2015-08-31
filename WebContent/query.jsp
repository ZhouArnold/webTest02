<%@ page language="java" contentType="text/html; GBK"
    pageEncoding="GBK"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
<h3>欢迎你:<s:property value="#session.user"/></h3>
<form id="myform" action="QueryAction" align="center">
<table align="center">
	<tr><td>请输入分页数：<input id="page" type="text" name="count"/></td></tr>
	
</table>
<input type="button" value="查询" onclick="sub();"/>
<input type="reset"  value="重置"/>
</form>
<s:form action="upload" enctype="multipart/form-data">
<s:textfield name="title" label="文件标题"/>
<s:file name="upload" label="选择文件"/>
<s:submit value="上传"/>

</s:form>
<script type="text/javascript">
	var v =function(){
		var page = document.getElementById("page").value;
		
		if(!/^\d+$/.test(page)){
			alert("请输入有效的数字！！！");
			return false;
		}else{
			return true;
		}
		
	}
	var sub = function(){
		var form1=document.getElementById("myform");
		form1.method="post";
		if(v()){
		form1.submit();
		}
		
	}
</script>
</body>
</html>