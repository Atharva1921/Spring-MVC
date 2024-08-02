
<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
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
    <form action="/processform" method="post">
      <div class="input-box">
        <input name="name" type="text" placeholder="Enter your name" required>
      </div>
      <div class="input-box">
        <input name="email" type="text" placeholder="Enter your email" required>
      </div>

      <div class="input-box">
        <input name="phone" type="text" placeholder="Enter your phone number" required>
      </div>

      <div class="input-box">
        <input name="password" type="password" placeholder="Create password" required>
      </div>
      <div class="input-box">
        <input name="confirm-password" type="password" placeholder="Confirm password" required>
      </div>

      <div class="input-box button">
        <input name="submit" type="Submit" value="Register Now">
      </div>
      <div class="text">
        <h3>Already have an account? <a href="login">Login now</a></h3>
      </div>
    </form>
  </div>
</body>
</html>