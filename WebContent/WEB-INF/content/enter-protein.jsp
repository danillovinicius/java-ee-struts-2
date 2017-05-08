<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<!-- Header Section -->
		<header> <%@ include file="layout/header.jsp"%>
		</header>

		<h1 class="page-header">Enter Protein</h1>
		<s:form>
			<s:textfield name="enteredProtein" />
			<s:submit value="Enter" />
		</s:form>
		<div>
			Last amount entered:
			<s:property value="enteredProtein" />
		</div>
		<div>Total for the day: 100 grams</div>
		<div>
			<s:property value="goalText" />
		</div>

		<!-- Footer Section -->
		<footer> <%@ include file="layout/footer.jsp"%>
		</footer>
	</div>
</body>
</html>