<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After Vote</title>
        <style>
            body {
                background-image:url("image/thank.jpeg");
                background-size:1080px 600px;
                background-repeat: no-repeat;
                
            }
            h1{
                color: blue;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>YOU HAVE SUCCESSFULLY VOTED</h1>
        <form id="form" method="Post" action="Result">
            
            <input type="button" value="Log Out" onClick="location.href='index.jsp'">
        </form>
       <%

response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");


%>
<script>
    history.forward();
</script>
    </body>
</html>