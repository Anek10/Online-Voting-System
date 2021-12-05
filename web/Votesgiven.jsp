  <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CANDIDATE VIEW</title>
        <style>
            .table1{
                border: 1px solid black;
                width:100%;
            }
            body{
                background-color: purple;
            }
              th {
                
                width:150px;
                text-align:center;
                border:1px solid black;
                color: red;
                padding:30px
              
            }
               td {
                
                width:150px;
                text-align:center;
                border:1px solid black;
                color: #ADEF07;
                padding:30px
              
            }
            h1 {
                color:#F2BB12;
            }
        </style>
    </head>
    <body>
        <h1>THE Votes GIVEN ARE:</h1>
         <table class="table1">
            <tr>
                <th>PARTY NAME</TH>
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select * from votes");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString("PartyName")%></td>
                </tr>
                       <%
                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 %>
           
   
       
            </table>
       </body>
</html>