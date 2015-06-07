<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Conditional</title>
	<link rel="stylesheet" href="<c:url value="resources/css/style2.css"/>" type="text/css" />
</head>
<body onload="renderEngine.init();">
	<div class="nav">
		<div class="container"><h3>A word of coffee</h3></div>
	</div>
	<div id="main_content" class="container">
		<div class="left">
			<div class="content">
				<h2>Hello Coffee World!</h2>
				<div class="content-body">
					<img src="resources/images/progressive.jpg" alt="Coffee" />
					<div class="box">
						<small>I quite like my coffee any time of the day.</small>
					</div>
				</div>
			</div>
		</div>
		<div class="rigth">
			<h2>Coffee Feed</h2>
			<div class="news">
				<i class="spinner"></i>
			</div>
		</div>
		<div style="clear: both"></div>
	</div>
	<div class="footer">
		<div></div>
	</div>
	
	<!-- Add Javascript Here -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="resources/js/layout2.js" type="text/javascript" language="JavaScript"></script>
</body>
</html>