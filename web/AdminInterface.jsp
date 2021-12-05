<%-- 
    Document   : AdminInterface
    Created on : Aug 16, 2021, 1:24:44 PM
    Author     : ANEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN INTERFACE</title>
        <style>
            body{
                background-color: purple;
                  
            }
            h1{
                text-align: center;
                color:greenyellow;
            } 
            .button{
                padding: 15px 32px;
                text-align: center;
                background-color: #4CAF50;
                color:white;
                border:none;
                display: inline-block;
                font-size: 16px;
                border-radius: 4px; 
                border:2px solid;
                margin-left: 350px;
                margin-top: 50px;
               
            }
            .button1{
                padding: 15px 32px;
                text-align: center;
                background-color: #4CAF50;
                color:white;
                border:none;
                display: inline-block;
                font-size: 16px;
                border-radius: 4px;
                border: 2px solid;
                margin-left:350px;
                margin-top: 50px;
            }
                .button2{
                padding: 15px 32px;
                text-align: center;
                background-color: #4CAF50;
                color:white;
                border:none;
                display: inline-block;
                font-size: 16px;
                border-radius: 4px;
                border: 2px solid;
                margin-left:350px;
                margin-top: 50px;
            }
            .log{
                color: red;
              
                margin:1000px 350px;
            }
            

            </style>
    </head>
    <body>
        <h1>SUCCESSFUL LOGIN</h1>
         <a href="CandidateView.jsp" target="_blank" class="button"> View Candidates</a>
         <a href="Votesgiven.jsp" target="_blank"  class="button1"> View Election Votes</a>
         <a href="ElectionResult.jsp" target="_blank" class="button2">Election Result</a>
         <a href="index.jsp" class="log">LOGOUT</a>
    </body>
</html>
