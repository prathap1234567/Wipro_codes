<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
  <%@ page isELIgnored="false" %>
<style>
    body {
        font-family: Arial;
        background-color: #eef2f3;
        margin: 0;
        padding: 0;
    }

    .container {
        width: 400px;
        margin: 80px auto;
        background: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0 0 10px #ccc;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
    }

    label {
        font-weight: bold;
    }

    input, select {
        width: 100%;
        padding: 8px;
        margin: 8px 0 15px 0;
        border-radius: 5px;
        border: 1px solid #ccc;
    }

    button {
        width: 100%;
        padding: 10px;
        background-color: green;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    button:hover {
        background-color: darkgreen;
    }

    .links {
        text-align: center;
        margin-top: 15px;
    }

    .links a {
        text-decoration: none;
        color: blue;
        margin: 0 10px;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Student Registration</h2>

    <form action="StudentAddServelt" method="post">

        <label>Student Name</label>
        <input type="text" name="name" required>

        <label>Course</label>
        <select name="course" required>
            <option value="">Select Course</option>
            <option value="B.Tech">B.Tech</option>
            <option value="MCA">MCA</option>
            <option value="MBA">MBA</option>
        </select>

        <label>Programming Language</label>
        <select name="language" required>
            <option value="">Select Language</option>
            <option value="Java">Java</option>
            <option value="Python">Python</option>
            <option value="C++">C++</option>
        </select>

        <button type="submit">Register</button>

    </form>

    <div class="links">
        <a href="ListStudent">View Students</a> |
        <a href="logout">Logout</a>
    </div>
</div>

</body>
</html>