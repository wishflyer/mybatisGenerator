<%@page import="cn.dd.demo.myBatis.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${test.id}"/>

	<tr>	
		<td class="tdLabel">
			<%=Test.ALIAS_MSG%>:
		</td>		
		<td>
		<form:input path="msg" id="msg" cssClass="" maxlength="88" />
		<font color='red'><form:errors path="msg"/></font>
		</td>
	</tr>	
	
		