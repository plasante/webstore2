<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
		</div>
	</section>
	<section class="container-fluid">
		<div class="row">
			<div class="col-md-5">
				<img src="<c:url value="/resources/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/>
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p><strong>Item Code : </strong>
					<span class="label label-warning">${product.productId }</span></p>
				<p><strong>manufacturer : </strong>${product.manufacturer}</p>
				<p><strong>category : </strong>${product.category}</p>
				<p><strong>Available units in stock : </strong>${product.unitsInStock}</p>
				<h4>${product.unitPrice} USD</h4>
				<p><a href="<spring:url value="/products" />" class="btn btn-default">
				       <span class="glyphicon-hand-left glyphicon"></span>
				       back
				   </a>
				   <a href="#" class="btn btn-warning btn-large">
				       <span class="glyphicon-shopping-cart glyphicon"></span>
				       Order Now
				   </a>
				</p>
			</div>
		</div>
	</section>
</div>
</body>
</html>