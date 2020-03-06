<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<html>
<head>
<style>
.topnav {
	top: 0;
	background: black;
	color: white;
	text-align: Right;
	font-size: 17px;
	width: 99%;
	height: 20px;
	position: fixed;
}

.article {
	background-color: #3492CC;
	padding: 8px;
	color: white;
}

.footer {
	background: black;
	color: white;
	padding: 8px;
	bottom: 0;
	right: 0;
	position: fixed;
	width: 100%;
}

.content {
	margin-top: -20px;
	background: #e7edf0;
	height: 450px;
}

a {
	text-decoration: none;
	color: white;
}

.head-content {
	margin-top: -20px;
	padding: 8px;
	background-color: #329bc9;
}

.body-content {
	background-color: white;
	bottom: -20px;
}

.btn {
	background-color: #3492cc;
	color: white;
	border: none;
	text-decoration: none;
	margin-right: 200px;
}

input {
	width: 80px;
	padding: 8px;
	border: none;
	background-color: white;
}

form {
	padding: 5px;
	margin-left: 450px;
}
</style>
</head>


<body>


	<div class="topnav">
		<nav>
			<a href="withdraw">WithDraw</a> <a>Deposit</a> <a>Money Transfer</a>
			<a>AccountInfo</a> <a href="index">Home</a> <a>Logout</a>
		</nav>
	</div>
	<div id="home">
		<div class="article">
			<center>
				<h3>Welcome Customer</h3>
			</center>
		</div>
		<div class="content">
			<ul>
				<br>
				<br>
				<br>
				<li><p>Amphi Bank of India is India's largest bank with a
						network of over 25000 branches located even in the remotest parts
						of India. Amphi Bank of India (ABI) offers a wide range of banking
						products and services to corporate and retail customers.</p></li>
				<br>
				<br>
				<br>
				<br>
				<li><p>OnlineABI is the Internet banking portal for Amphi
						Bank of India. The portal provides anywhere, anytime, online
						access to accounts for Amphi Bank's Retail and Corporate
						customers. The application is developed using the latest cutting
						edge technology and tools. The infrastructure supports unified,
						secure access to banking services for accounts in over 25,000
						branches across India.</p></li>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
			</ul>
		</div>
	</div>

	<div id="transaction">
		<div class="head-content">
			<center>
				<h3>Money Transaction</h3>
			</center>
		</div>
		<div class="body-content"></div>
	</div>


	<div class="footer">
		<center>
			<p>Posted by: amphi Refsnes</p>
			<p>Contact information: amphi@example.com.</p>
			<p>Amphi Bank of India</p>
		</center>
	</div>


</body>
</html>

