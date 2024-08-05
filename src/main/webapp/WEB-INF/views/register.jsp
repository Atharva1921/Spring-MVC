

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Registration or Sign Up form in HTML CSS | CodingLab </title>
    <link href="/resources/css/register.css" rel="stylesheet" >
   </head>
<body>
  <div class="wrapper">
    <h2>Registration</h2>
    <form:form modelAttribute="user" action="/user/processform" method="post">

      <div class="input-box">
        <form:input path="name" name="name" type="text" placeholder="Enter your name"/>
        <div class="error"><form:errors path="name"/></div>
      </div>

      <div class="input-box">
        <form:input path="email" name="email" type="text" placeholder="Enter your email"/>
        <div class="error"><form:errors path="email"/></div>
      </div>

      <div class="input-box">
        <form:input path="phone" name="phone" type="text" placeholder="Enter your phone number"/>
        <div class="error"><form:errors path="phone"/></div>
      </div>

      <div class="input-box">
        <form:input path="password" name="password" type="password" placeholder="Create password"/>
        <div class="error"><form:errors path="password"/></div>
      </div>

      <div class="input-box">
        <input name="confirm-password" type="password" placeholder="Confirm password"/>
        <form:errors cssClass="error"/>
      </div>

      <div class="input-box button">
        <input name="submit" type="Submit" value="Register Now"/>
      </div>

      <div class="text">
        <h3>Already have an account? <a href="login">Login now</a></h3>
      </div>
    </form:form>
  </div>
</body>
</html>