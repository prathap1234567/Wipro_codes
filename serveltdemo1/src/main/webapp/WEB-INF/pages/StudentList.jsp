<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<title>Student List</title>

<style>
    * { margin: 0; padding: 0; box-sizing: border-box; }

    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: #f0f2f5;
        padding: 40px 20px;
        color: #333;
    }

    .container {
        max-width: 1000px;
        margin: 0 auto;
        background: #fff;
        border-radius: 12px;
        box-shadow: 0 4px 20px rgba(0,0,0,0.08);
        overflow: hidden;
    }

    .header {
        background: linear-gradient(135deg, #4a90e2 0%, #357abd 100%);
        color: white;
        padding: 25px 30px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .header h1 {
        font-size: 26px;
    }

    .header-actions a {
        margin-left: 10px;
    }

    .btn-add, .btn-logout {
        padding: 10px 18px;
        text-decoration: none;
        border-radius: 6px;
        font-weight: 600;
        border: 2px solid white;
        transition: 0.3s;
        color: white;
    }

    .btn-add {
        background: rgba(255,255,255,0.2);
    }

    .btn-add:hover {
        background: white;
        color: #4a90e2;
    }

    .btn-logout {
        background: #e74c3c;
        border: none;
    }

    .btn-logout:hover {
        background: #c0392b;
    }

    .table-wrapper {
        padding: 30px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    th {
        text-align: left;
        padding: 14px;
        color: #666;
    }

    td {
        padding: 14px;
    }

    tbody tr:hover {
        background: #f8fbff;
    }

    .badge {
        padding: 5px 12px;
        border-radius: 20px;
        font-size: 12px;
        color: white;
    }

    .course { background: #9b59b6; }
    .lang { background: #3498db; }

    .actions {
        text-align: right;
    }

    .btn {
        padding: 6px 12px;
        border-radius: 4px;
        border: none;
        margin-left: 5px;
        cursor: pointer;
    }

    .edit { background: #3498db; color: white; }
    .delete { background: #e74c3c; color: white; }

</style>
</head>

<body>

<div class="container">

    <div class="header">
        <h1>Student List</h1>

        <div class="header-actions">
          <a href="StudentAddServelt" class="btn-add">+ Add Student</a>
            <a href="logout" class="btn-logout">Logout</a>
        </div>
    </div>

    <div class="table-wrapper">
        <table>

            <thead>
                <tr>
                    <th>Name</th>
                    <th>Course</th>
                    <th>Language</th>
                    <th class="actions">Actions</th>
                </tr>
            </thead>

            <tbody>

                <c:forEach var="s" items="${list}">
                    <tr>
                        <td><b>${s.name}</b></td>
                        <td><span class="badge course">${s.course}</span></td>
                        <td><span class="badge lang">${s.language}</span></td>
                        <td class="actions">
                            <button class="btn edit">Edit</button>
                            <button class="btn delete">Delete</button>
                        </td>
                    </tr>
                </c:forEach>

            </tbody>

        </table>
    </div>

</div>

</body>
</html>