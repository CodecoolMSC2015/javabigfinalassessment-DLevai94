<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Page</title>
</head>
<body>
	<h1>Search</h1>
	<form method="post" action="SearchServlet">
		Skill: <input type="text" name="skill" placeholder="Skill"
			required /> <br /> Search: <br /> <input type="radio"
			name="searchType" required />Mandatory <br /> <input type="radio"
			name="searchType" required />Optional <br /> <input type="submit"
			value="Search" />
	</form>
</body>
</html>