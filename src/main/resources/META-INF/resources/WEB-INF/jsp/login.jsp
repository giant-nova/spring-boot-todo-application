<html>
    <head>
        <title>
            Login page
        </title>
    </head>
    <body>
        <div class="container">
            <h1>Welcome! </h1>
            Please Login with your credentials :-
            <form method="post">
                <div>Name: <input type= "text", name = "name"></div>
                <div>Password: <input type= "text", name = "password"></div>
                <div><input type= "submit"></div>
            </form>
            <div><pre> ${errorMessage}</pre></div>
        </div>
    </body>
</html>