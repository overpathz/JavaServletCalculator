<%--
  Created by IntelliJ IDEA.
  User: overpathz
  Date: 10.05.2021
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.awt.*" %>
<%@ page import="util.ParserEq" %>
<%@ page import="models.Equation" %>
<html>
<head>
    <style>
        .font1 {
            font-size: 30px;
        }
    </style>
    <title>MAIN</title>
</head>
<body>

    <form action="/calculate" method="post">
        <label for="equation"></label>
        <br><br>
        <input type="text" name="equation" id="equation">
        <br><br>
        <input type="submit" value="Calculate">
    </form>

    <% double eq = ParserEq.getResult();
    String eq1 = Equation.getEquation();
    request.setAttribute("eq", eq);
    request.setAttribute("eq1", eq1);
    %>

    <br><br>

    <div class="font1">
        <p>
            <b>Result of <%=eq1%> = <%=eq%></b>
        </p>
    </div>

</body>
</html>
