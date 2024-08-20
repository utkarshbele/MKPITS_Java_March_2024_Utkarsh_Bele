<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="SttudentModel.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>${student == null ? 'Add Student' : 'Edit Student'}</h2>
        <form action="${student == null ? 'insert' : 'update'}" method="post">
            <c:if test="${student != null}">
                <input type="hidden" name="id" value="${student.id}">
            </c:if>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" name="name" value="${student.name}">
            </div>
            <div class="form-group">
                <label for="percentage">Percentage:</label>
                <input type="text" class="form-control" id="percentage" name="percentage" value="${student.percentage}">
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" class="form-control" id="address" name="address" value="${student.address}">
            </div>
            <div class="form-group">
                <label for="city">City:</label>
                <input type="text" class="form-control" id="city" name="city" value="${student.city}">
            </div>
            <div class="form-group">
                <label for="country">Country:</label>
                <input type="text" class="form-control" id="country" name="country" value="${student.country}">
            </div>
            <button type="submit" class="btn btn-primary">${student == null ? 'Save' : 'Update'}</button>
        </form>
        <br>
        <a href="list" class="btn btn-secondary">Back to Student List</a>
    </div>
</body>
</html>