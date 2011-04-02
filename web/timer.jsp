<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title>Using Beans with different scopes</title>
  </head>
  <body>
    <h1>Using Beans with different scopes</h1>
    <jsp:useBean id="timerBean" class="beans.TimerBean" scope="session" />
    Time passed: <%=  timerBean.timePassed() %>
  </body>
</html>
