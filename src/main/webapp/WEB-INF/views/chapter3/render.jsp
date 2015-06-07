<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Rendering</title>
	<link rel="stylesheet" href="<c:url value="resources/css/style3.css"/>" type="text/css" />
</head>
<body>
	<h2>When Hiding simply isn't enough</h2>
	<hr/>
	
	<div id="gallery-container">
		<div class="gallery-viewer">
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script src="resources/js/render.js" type="text/javascript"></script>
	<script type="text/javascript">
	    $(document).ready(function() {
	        renderEngine.init();
	    });
	</script>
</body>
</html>