<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            height: 100vh;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .login-box {
            background: #fff;
            padding: 30px;
            width: 320px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
        }

        .login-box h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .login-box label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        .login-box input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .login-box input:focus {
            border-color: #4facfe;
            outline: none;
        }

        .login-box button {
            width: 100%;
            margin-top: 20px;
            padding: 10px;
            border: none;
            background: #4facfe;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        .login-box button:hover {
            background: #007bff;
        }
    </style>
</head>
<body>

<div class="login-box">
    <h2>Login</h2>

    <form action="Login" method="post">
        <label>username</label>
        
         <input type="text" name="username"placeholder="Enter username">
        <label>Password</label>
        <input type="password" name="password" placeholder="Enter password">

        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>