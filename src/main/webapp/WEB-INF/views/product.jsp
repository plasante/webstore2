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
			<p>All the available products in our store</p>
		</div>
	</section>
	<section class="container-fluid">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<img src="<c:url value="/resources/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/>
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>$${product.unitPrice}</p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p>
								<a href="<spring:url value="/products/product?id=${product.productId}"/>" class="btn btn-primary">
									<span class="glyphicon-info-sign glyphicon"></span>
									Details
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</div>
</body>
</html>