<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<jsp:include page="includes/heads.jsp" />
	<title>Customers</title>
</head>
<body>
<div class="container-fluid">
	<section>
		<div class="jumbotron">
			<h1>Customers</h1>
			<p>List of all the customers</p>
		</div>
	</section>
	<section class="container-fluid">
		<div class="row">
			<c:forEach items="${customers}" var="customer">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${customer.name}</h3>
							<p>${customer.address}</p>
							<p>Number of orders ${customer.noOfOrdersMade}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</div>
</body>
</html>