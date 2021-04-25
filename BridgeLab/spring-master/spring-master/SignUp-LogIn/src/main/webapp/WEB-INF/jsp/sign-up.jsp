
<html>
<head><title>registration form</title></head>
<body>
${message}
<form action="save" method="post">
First Name:<input type="text" name="firstName" autocomplete="off" required placeholder="firstname">
Last Name:<input type="text" name="lastName" autocomplete="off" required placeholder="lastname">
Email Id:<input type="email" name="email" autocomplete="off" required placeholder="email id">
password:<input type="password" name="password" autocomplete="off" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" placeholder="password">
Role: <input type="text" name="role" autocomplete="off" placeholder="role">


 <input type="submit"value="sign-in">
 </form>



</body>



</html>