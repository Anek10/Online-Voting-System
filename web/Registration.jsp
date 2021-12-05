<%-- 
    Document   : Registration
    Created on : Aug 13, 2021, 6:49:15 PM
    Author     : ANEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRATION Page</title>
        <style>
            body{
                background-color: blue;
                background-image:url("image/register.png");
                background-repeat: no-repeat;
                background-size: 1500px 700px;
            }
           form{
              text-align:center;
              color:greenyellow;
              margin-top: 10%;
            }
          
          input{
              border-radius: 5px;
              border: 2px solid;
              color:blue;
              text-align: center;
          }
    </style>
    <script>
        function validate()
        {
        var FirstName = document.form.fname.value;
        var LastName = document.form.lname.value;
        var MobileNo= document.form.mobile.value;
        var Email = document.form.email.value;
        var Gender = document.form.gender.value; 
        var DOB = document.form.dob.value;
        var VoterId= document.form.card.value;;
        
        
           if (FirstName==null || FirstName=="")
             { 
              alert("First Name can't be blank"); 
              return false; 
              }
           else if (LastName==null || LastName=="")
             { 
           alert(" Last Name can't be blank"); 
              return false;
              }
           else if (MobileNo==null || MobileNo=="")
             { 
           alert("Mobile Number can't be blank"); 
           return false; 
              }
           else if (Email==null || Email=="")
             { 
           alert("Email can't be blank"); 
           return false; 
              }
           else if (DOB==null || DOB=="")
             { 
           alert("Date Of Birth can't be blank"); 
           return false; 
              }
             else if (VoterId==null || VoterId=="")
             { 
           alert("Voter Card Number can't be blank"); 
           return false; 
              }
          
        
        }
    </script>
    </head>
    
    <body>
        <form name="form" method="post" action="RegVoters" onsubmit="return validate()" >
         First Name:<input type="text" name="fname"><br><br>
         Last Name:<input type="text" name="lname"><br><br>
         Mobile Number:<input type="text"  name="mobile" ><br><br>
         E-Mail:<input type="text" name="email"><br><br>
         Gender:
         <input type="radio"  name="gender" value="Male"/> Male
         <input type="radio" name="gender" value="Female"/>Female
          <input type="radio" name="gender" value="Other"/>Other<br><br>
                
          DOB:<input type="date" name="dob" >
         in format of YYYY-MM-DD<br><br>
         Voter Card Number:<input type="text" name="card"><br><br>
         
         <input type="submit" value="REGISTER">
         </form>
    </body>
</html>
<!--mysql> create table register1(FirstName varchar(20) not null,LastName varchar(20) not null,MobileNo varchar(45) not null,Email varchar(20) not null,
Gender varchar(6) not null ,DateOfBirth date not null,VoterCardNo varchar(10) not null);-->
