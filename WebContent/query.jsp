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
<h3>��ӭ��:<s:property value="#session.user"/></h3>
<form id="myform" action="QueryAction" align="center">
<table align="center">
	<tr><td>�������ҳ����<input id="page" type="text" name="count"/></td></tr>
	
</table>
<input type="button" value="��ѯ" onclick="sub();"/>
<input type="reset"  value="����"/>
</form>
<s:form action="upload" enctype="multipart/form-data">
<s:textfield name="title" label="�ļ�����"/>
<s:file name="upload" label="ѡ���ļ�"/>
<s:submit value="�ϴ�"/>

</s:form>
<script type="text/javascript">
	var v =function(){
		var page = document.getElementById("page").value;
		
		if(!/^\d+$/.test(page)){
			alert("��������Ч�����֣�����");
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