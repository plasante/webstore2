<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="resources/css/style.css"/>" type="text/css" />
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" type="text/javascript">
	</script>
	<script type="text/javascript" src="<c:url value="resources/js/layout.js"/>"></script>
</head>
<body>
	<!-- Body Content -->
	<div class="loader">
		<div class="spinner">Loading...</div>
	</div>

	<nav>
		<ul class="nav-list">
			<li id="anchor-welcome" class="active"><a class="anchor" href="#welcome">welcome</a></li>
			<li id="anchor-info"><a class="anchor" href="#info">info</a></li>
			<li id="anchor-about"><a class="anchor" href="#about">about</a></li>
			<li id="anchor-gallery"><a class="anchor" href="#gallery">gallery</a></li>
		</ul>
	</nav>

	<!-- SECTION: Welcome -->
	<section id="welcome" class="full-h">
		<div class="container">
			<div class="img-wrapper">
				<img src="http://mrg.bz/POKzTi" alt="" />
			</div>
			<div class="content">
				<h2>Welcome to the Coffee Pot</h2>
				<div class="welcome-container">
					<div class="welcome-wrapper">
						<div class="content-img">
							<img src="resources/images/welcome_img.jpg">
						</div>
						<div class="content-text">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- SECTION: Info -->
	<section id="info" class="full-h">
		<div class="container">
			<div class="img-wrapper">
				<img src="http://mrg.bz/POKzTi" alt="" />
			</div>
			<div class="content">
				<h2>We all like coffee</h2>
				<div class="info-container">
					<div class="info-wrapper">
						<div class="content-text">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- SECTION: About -->
	<section id="about" class="full-h">
		<div class="container">
			<div class="img-wrapper">
				<img src="http://mrg.bz/POKzTi" alt="" />
			</div>
			<div class="content">
				<h2>All about the Coffee</h2>
				<div class="about-container">
					<div class="about-wrapper">

						<div class="content-text">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse cillum
								dolore eu fugiat nulla pariatur. Excepteur sint occaecat
								cupidatat non proident, sunt in culpa qui officia deserunt
								mollit anim id est laborum.</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- SECTION: Gallery -->
	<section id="gallery" class="full-h">
		<div class="container">
			<div class="img-wrapper">
				<img src="http://mrg.bz/POKzTi" alt="" />
			</div>
			<div class="content">
				<h2>Gallery</h2>
				<div class="gallery-container">
					<div class="gallery-wrapper"></div>
				</div>
			</div>
		</div>
	</section>

	<!-- Scripts -->
	<script type="text/javascript" src="http://code.createjs.com/createjs-2013.12.12.min.js"></script>
	<script type="text/javascript" src="<c:url value="resources/js/tools.js" />"></script>
	<script type="text/javascript" src="<c:url value="resources/js/data.js" />"></script>


</body>
</html>