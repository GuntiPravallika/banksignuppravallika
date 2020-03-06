<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>  
<style>  
.error{color:red
<h5>username and Password already exist</h5>
<h5>username and password set sucessfully</h5>


}  

</style>  
</head> 
<body>
	<a style="text-decoration: none" href="Login">Login</a>
	<a style="text-decoration: none" href="Contact">Contact Us</a>

	<center>
		<h3>WELCOME ABOARD</h3>
	</center>
	<p>
		www.amphi.com,the Internet banking portal of our bank,enables its
		retail banking customer to operate their account from anywhere anytime
		,removing the restrictions imposed by geography and time.It's a
		platform that enables the customer to carry their banking activities
		from their desktop, aided by the power and the convience of the
		Internet. <br>
	<h4>Banking at your fingertips</h4>
	<br>
	<p>
		Inteternet Banking offers you the ease and convience of transaction in
		a environment you feel most confort with.You cancheck balance and
		transaction, transfer funds,pay bills,open fixed and recurring
		deposits and much more. <br>
	<h4>Bill payments anytime,anywhere</h4>
	<p>With Internet Banking you can pay bills without having to wait
		in ques. Choose any bill payments option, manage billers and even
		choose quick pay.</p>

	<div class="head-content"></div>
	<div class="body-content">
		<center>
			<h4>Sign Up</h4><a></a>
			
			 
			<form:form>
			
			

			
			<form:form action="index" modelAttribute="user"/>  
			
				<input type="text" placeholder="Account Holder Name" name="name" path="name"/>
				<form:errors path="Account Holder Name" cssClass="error"/><br><br>
				<br>
				<br>

				<input type="text" placeholder="Account number" name="accountNo" path="accountNumber" />
				<form:errors path="Account number" cssClass="error"/><br>
				<br>
				<br>

				<input type="text" placeholder="set username" name="UserName" path="userName" />
				<br>
				<form:errors path="set username" cssClass="error"/><br>
<br>
				<input type="password" placeholder="set password" name="password"
					path="password" />
				<br>
				
<form:errors path="password and username" cssClass="error"/><br><br>  


				<input id="submit" type="submit" value="submit" class="btn" />
			</form:form>  
		</center>
	</div>
  </body>
</html>


