<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
	<jsp:include page="includes/heads.jsp" />
	<title>Products</title>
</head>
<body>
<div class="container-fluid">
	<section>
		<div class="jumbotron">
			<h1>Products</h1>
			<p>Add products</p>
		</div>
	</section>
	<section class="container-fluid">
		<div class="row">
			<div class="col-md4 col-md-offsett-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"></h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br/>
							</div>
						</c:if>
						<form action="<c:url value="/j_spring_security_check"></c:url>" method="post">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="User Name" name="j_username" type="text">	
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password" name="j_password" type="password" value="">
								</div>
								<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
</body>
</html>