<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lOGIN Page</title>
        <style>
            body {
                background-image:url("image/indiaflag.jpg");
                background-size: 1350px 750px;
                background-repeat: no-repeat;
                 }
                 h1{
                     color:blue;
                     text-align:center;
                 }
                 form{
                     text-align:center;
                     border-radius: 5px;
                     padding: 20px;
                 }
                 input[type=text] {
                     border: 2px solid;
                     color: blue;
                 }
                 input[type=submit]{
                     background-color: blue;
                     border: 1px solid;
                     margin: 4px 4px;
                     padding: 10px 5px;
                 }
                 p {
                     text-align: center;
                     margin-top:23%;
                 }
                 .admin {
                     text-align: center;
                    
                 }      
        </style>
    </head>
    <body>
     <h1>WELCOME TO ONLINE VOTING SYSTEM</h1>
     
     <form method="post" action="Vlogin">
         Enter Your FIRST NAME:<input type="text" name="name"><br><br>
         Enter Your Registered Voter Card Number:<input type="text" name="card"><br><br>
          <input type="submit" value="LOGIN">
         </form>
     
     <p>Please Click on <a href="Registration.jsp" target="_blank"> REGISTRATION </a>to Register Yourself</p>
     <div class="admin">
     <a href="AdminLogin.jsp" target="_blank" class="admin">ADMIN LOGIN</a>
     </div>
     <%

response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires","-1");

%>
      </body>
</html>