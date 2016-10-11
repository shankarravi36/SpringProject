<%-- 
    Document   : login
    Created on : Oct 11, 2016, 12:32:00 PM
    Author     : Training
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <form action="login" method="post">
             <div class="form-group">
                    <label for="custName">Name</label>
                    <input type="text" class="form-control" id="Name" name="Name" placeholder="Name" required="true">
                </div>
                <div class="form-group">
                    <label for="custEmail">Email</label>
                    <input type="text" class="form-control" id="Email" name="Email" placeholder="Email" required="true">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </body>
</html>
