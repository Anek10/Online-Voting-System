<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voting Page</title>
        <style>
            h2 {
                color: red;
                text-align: center;
                font-size: 45px;
            }
            
            body {
                background-color: pink ;
            }
            
             input[type=submit]{font-size: 30px;
                     background-color: greenyellow;
                     border: 1px solid;
                     padding: 10px 5px;
                     margin-left: 500px;
                 }
                p {  color:blue;
                     text-align: center;
                     font-size: 20px;
                     
                 }
             .vertical-center {
  
               text-align: center;
               border: 5px blue;
 
               margin-left: -500px;
 
                      }
    </style>
        
    </head>
    <body>
        <h2>LOGIN SUCCESSFUL !</h2>
        <form id="form" method="Post" action="Result">
          
            
<h2>Select your Party and candidate to vote</h2>
<p><input type="radio" name="candidate"  value="BJP" /> BJP</p>
<p><input type="radio" name="candidate" value="AAP"/>AAP</p>
<p><input type="radio" name="candidate" value="CONGRESS"/> CONGRESS</p>
<p><input type="radio" name="candidate" value="SHIV SENA"/> SHIV SENA</p>
<p><input type="radio" name="candidate" value="NOTA"/> NOTA</p>

 <div class="vertical-center">
<input type="submit" value="Submit" onclick="this.value='Submitting!';this.disabled='disabled'; this.form.submit();demo();" >
<script type="text/javascript">
function demo() {
alert ("you have successfully placed your vote once!");

}
</script>


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