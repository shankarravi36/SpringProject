<%-- 
    Document   : customer
    Created on : Oct 11, 2016, 4:31:46 PM
    Author     : Training
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CUSTOMER FORM</title>
            <script type="text/javascript">
         
            function Redirect() {
               window.location="localhost:8080/SpringProject/createOrRetrieveLoan";
            }
         
            </script>
    </head>
    <body>
        <h1>CUSTOMER FORM</h1>
        <form action="createOrRetrieveLoan">
            <div class="form-group">
            <label for="Name">Name: ${customer.getName()}</label>
            </div>
            <div class="form-group">
            <label for="Email">Email: ${customer.getEmailID()}</label>
            </div>
            <div class="form-group">
            <label for="Address">Address: ${customer.getAddress()}</label>
            </div>
            <div class="form-group">
            <label for="Phone Number">Phone Number: ${customer.getPhoneNumber()}</label>
            </div>
            <button type="submit" class="btn btn-default" onclick="Redirect()">Proceed</button>            
        </form>
    </body>
</html>
