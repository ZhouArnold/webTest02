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
<h1>成功啦！</h1>
<table align="center" border="1" bordercolor="#000000">
	<tr>
	<td width="150">ID号码</td><td width="150">姓名</td><td width="150">年龄</td><td width="150">住址</td>
	</tr>
	<s:iterator value="list" id="item">
	<tr>
	<s:iterator value="#item" id="map">
	<td align="center">
	<s:property value="#map.value"/>
	</td>
	</s:iterator>
	</tr>
	</s:iterator>
</table>


</body>
</html>