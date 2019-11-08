<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="POST">
<center>
<table>
<h2>User Details</h2>
<tr>
<td>ID</td>
<td>:</td>
<td><input type="text" name="id"></td></tr>

<tr>
<td>Event Date</td>
<td>:</td>
<td><input type="text" name="date"></td></tr>

<tr>
<td>Event Name</td>
<td>:</td>
<td><input type="text" name="eventName"></td></tr>

<tr>
<td>About Event</td>
<td>:</td>
<td><input type="text" name="aboutEvent"></td></tr>

<tr>
<td>Event_Date_Time</td>
<td>:</td>
<td><input type="text" name="eventDateTime"></td></tr>

<tr>
<td>Location</td>
<td>:</td>
<td><input type="text" name="location"></td></tr>

<tr>
 <td></td><td><input type="Submit" value="save"></td></tr>

</form>
</table>
${msg}
</center>
<a href=displayeventDetailslist>view eventDetails list</a>
</body>
</html>