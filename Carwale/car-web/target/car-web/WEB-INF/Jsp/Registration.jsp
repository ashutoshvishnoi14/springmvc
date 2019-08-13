<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" modelAttribute="userObjectR" action="ShowRegistration.do">
		<table>
			<tr>
			
				<td>
					<div>
						<p>firstname</p>
						<form:input path="firstname" />
					</div>
				</td>
			<td><form:errors path="firstname" class="label error-label"></form:errors></td> 
			</tr>
			<tr>
				<td>
					<div>
						<p>lastname</p>
						<form:input path="lastname" />
					</div>
				</td>
		 		<td><form:errors path="lastname" class="label error-label"></form:errors></td>
		</tr>
			<tr>
				<td>
					<div>
						<p>Contact</p>
						<form:input path="contact" />
					</div>
				</td>
			<td><form:errors path="contact" class="label error-label"></form:errors></td>
	 		</tr>

			<tr>
				<td>
					<div>
						<p>Username</p>
						<form:input path="email" />
					</div>
				</td>
		 		<td><form:errors path="email" class="label error-label"></form:errors></td>
		 	</tr>

			<tr>
				<td>
					<div>
						<p>Password</p>
						<form:password path="password" />
					</div>
				</td>
				<td><form:errors path="password" class="label error-label"></form:errors></td>
 			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>