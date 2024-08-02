<html>
<body>
<h2>Registration Form</h2>
<form action="/user/processform" method="post" >
    <label for="name">name: </label>
    <input type="text" name="name"  required>
    <br>
    <label for="email">email: </label>
    <input type="email" name="email"  required>
    <br>
    <label for="phone">phone: </label>
    <input type="number" name="phone"  required>
    <br>
    <label for="password">password: </label>
    <input type="password" name="password"  required>
    <br>
    <input type="submit" value="Login!">
</form>

</body>
</html>