<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@include file="../home.jsp" %>

<form action="SignUp.action" method="post">
<p>　　　ID　　　　<input type="text" name="login_id"></p>
<p>　パスワード　　<input type="password" name="password"></p>
<p>　　 住所 　　　<input type="address" name="address"></p>
<p>メールアドレス　<input type="mailaddress" name="mailaddress"></p>
<p><input type="submit" value="会員登録"></p>
</form>

<%@include file="../footer.html" %>