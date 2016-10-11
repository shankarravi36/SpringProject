<%-- 
    Document   : createOrRetrieveLoan
    Created on : Oct 11, 2016, 4:58:28 PM
    Author     : Training
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHOOSE AN OPTION</title>
        <script type="text/javascript">
         
            function check() {
               if(document.getElementById("checkbox_1").checked===true){
                   window.location="localhost:8080/SpringProject/;
               }
            }
         
        </script>
    </head>
    <body>
        <h1>CHOOSE AN OPTION</h1>
        <form>
            <input type="checkbox" id="checkbox_1" name="Loan" value="create new loan" > Create new loan<br> 
            <input type="checkbox"  id="checkbox_2" name="Loan" value="retrieve existing loan records"> retrieve existing loan records<br> 
        </form>
    </body>
</html>
