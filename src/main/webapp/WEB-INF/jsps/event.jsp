<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view event page</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <table class="table">
    <thead>
      <tr>
       
<th>id</th>
<th>date</th>
<th>event_name</th>
<th>about_event</th>
<th>event_date_time</th>
<th>location</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${event}" var="event">
    <tr>
    <td>${event._id}</td>
    
        <td>${event.date}</td>
<td>${event.event_name}</td>
<td>${event.about_event}</td>
<td>${event.event_date_time}</td>
<td>${event.location}</td>
</tr>
</c:forEach>
    </tbody>
  </table>
   <a href="home">Register EventDetails</a>
</div>

</body>
</html>