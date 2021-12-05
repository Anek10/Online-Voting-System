<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
        <style>
             body {
                background-image:url("image/lion.png");
                background-size: 1000px 700px;
                background-repeat: no-repeat;
                background-color: gray;
                 }
            form{
                 text-align: center;
                 margin-top: 23%;
                 margin-left: 20%;
                border-radius: 5px;
                padding: 20px;
                color: limegreen;
            }
             input[type=submit]{
                     background-color:greenyellow;
                     border: 1px solid;
                     margin: 4px 6px;
                     padding: 5px 5px;
                     
                 }
                 input[type=text] {
                     border: 2px solid;
                     color: lime;
                 }
                 input[type=password] {
                     border: 2px solid;
                     color: lime;
                 }
        </style>
    </head>
    <body>
        <form method="post" action="AdminCheck">
            Name:<input type="text" name="user"/><br><br>
            Password:<input type="password" name="pass"><br><br>
            <input type="submit" value="ADMIN LOGIN">
            
        </form>
    
    </body>
</html>