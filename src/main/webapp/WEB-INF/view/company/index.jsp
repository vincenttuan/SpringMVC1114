<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <%@include file="include/header.jspf" %>
</head>
<body>

<div id="layout">
    <!-- Menu toggle -->
    <%@include file="include/toggle.jspf" %>
    <!-- Menu -->
    <%@include file="include/menu.jspf" %>
    <!-- Main(Content) -->
    <div id="main">
        <div class="header">
            <h1>Company</h1>
            <h2>Club, Department, Employee, Salary 進行 CRUD</h2>
        </div>

        <div class="content">
            <img src="${pageContext.request.contextPath}/image/JPA_CRUD_Lab.png">
        </div>
    </div>
</div>

<%@include file="include/footer.jspf" %>

</body>
</html>