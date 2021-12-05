<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VOTES GIVEN ARE:</title>
        <style>
            th {
                
                Color:#00FFF9;
                font-size: 23;
            }
            th, td {
                
                width:150px;
                text-align:center;
                border:1px solid black;
                padding:30px;
              
            }
            .table1{
              
                background-image: url("image/BJP.png");
                background-repeat: no-repeat ;
                border: 1px solid black;
                background-size: 180px 150px;
                width:100%;
            }
             .table2{
                 background-image: url("image/AAP.jpg");
                 background-repeat: no-repeat ;
                border: 1px solid black;
                  background-size: 180px 150px;
                width:100%;
            }
             .table3{
                 background-image: url("image/ss.jpeg");
                 background-repeat: no-repeat ;
                border: 1px solid black;
                  background-size: 180px 150px;
                width:100%;
            }
             .table4{
                 background-image: url("image/CONGRESS.jpg");
                 background-repeat: no-repeat ;
                border: 1px solid black;
                  background-size: 180px 150px;
                width:100%;
            }
             .table5{
                 background-image: url("image/nota.jpeg");
                 background-repeat: no-repeat ;
                  border: 1px solid black;
                  background-size: 180px 150px;
                width:100%;
            }
            body{
                background-color: lightsteelblue;
            }
        </style>
    </head>
    <body>
        <h1></h1>
         <table class="table1">
            <tr>
                <th>Bhartiya Janata Party</th>
                   
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='BJP'");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString(1)%></td>
  
                </tr>
                       <%
                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 %>
           
                 </table>
                 <table class='table2'>
            <tr>
                <th>Aam Admi Party</th>
                   
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='AAP'");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString(1)%></td>
  
                </tr>
                       <%
                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 %>
   
              </table>
                 <table class='table3'>
            <tr>
                <th>Shiv Sena</th>
                   
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='SHIV SENA'");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString(1)%></td>
  
                </tr>
                       <%
                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 %>
                 
                  </table>
                 <table class='table4'>
            <tr>
                <th>CONGRESS</th>
                   
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='CONGRESS'");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString(1)%></td>
  
                </tr>
                       <%
                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 %>
                 
                  </table>
                 <table class='table5'>
            <tr>
                <th>NOTA</th>
                   
            </tr>
             
                  <%
                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='NOTA'");
                  while(rs.next())
                  {
                      %>
                 <tr>     
                <td><%=rs.getString(1)%></td>
  
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