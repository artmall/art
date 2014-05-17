<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="/art-web-merchant/a/a1.do">A.a1() - GET</a>
	<form action="/art-web-merchant/a/a1.do" method="post">
		<input type="submit" value="A.a1() - POST" />
	</form>
	<a href="/art-web-merchant/a/a2.do">A.a2() - GET</a>
	<form action="/art-web-merchant/a/a2.do" method="post">
		<input type="submit" value="A.a2() - POST" />
	</form>
	<a href="/art-web-merchant/a/a3.do?username=admin&password=111111">A.a3() - GET</a>
	<form action="/art-web-merchant/a/a3.do" method="post">
		<input type="hidden" name="username" value="张三" />
		<input type="hidden" name="password" value="111111" />
		<input type="submit" value="A.a3() - POST" />
	</form>
	<a href="/art-web-merchant/a/a4.do?username=admin&password=111111">A.a4() - GET</a>
	<form action="/art-web-merchant/a/a4.do" method="post">
		<input type="hidden" name="username" value="张三" />
		<input type="hidden" name="password" value="111111" />
		<input type="submit" value="A.a4() - POST" />
	</form>
	<a href="/art-web-merchant/a/a5.do?username=admin&password=admin123">A.a5() - GET</a>
	<br/>
	<a href="/art-web-merchant/a/a6.do">A.a6() - GET</a>
	<br/>
	<a href="/art-web-merchant/a/a7.do">A.a7() - GET</a>
	<br/>
	---------------------------------------
	<br/>
	<a href="/art-web-merchant/a/v1.do">A.v1() - GET</a>
</body>
</html>