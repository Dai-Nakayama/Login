<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@include file="../home.jsp" %>

<form action="Login.action" method="post">
<p>　　ID　　<input type="text" name="login_id"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="ログイン"></p>
<p><a href="signup.jsp">会員登録が済んでいない人はこちら</a></p>
</form>

<%@include file="../footer.html" %>
