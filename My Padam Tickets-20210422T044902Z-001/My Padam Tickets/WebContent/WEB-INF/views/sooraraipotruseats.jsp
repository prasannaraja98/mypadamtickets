<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
   margin:100px;
}

 

* {
  box-sizing: border-box;
}

 

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

 

/* Full-width input fields */
input[type=date], input[type=password],select {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

 

input[type=date]:focus, input[type=password],select:focus {
  background-color: #ddd;
  outline: none;
}

 

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

 

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

 

.registerbtn:hover {
  opacity: 1;
}

 

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

 

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

 

<form action="sooraraipotrubooking.html">
  <div class="container">
    <h1>Enter your details</h1>
    <p>Enter your booking details</p>
    <hr>
    <label for="date">Date</label>
    <input type="date" id="date" name="date">
    <br>

 


   <label for="time">Select a Time:</label>
    <select name="time">
    <option value="9:00 AM">9:00 AM</option>
    <option value="2:00 PM">2:00 PM</option>
    <option value="6:00 PM">6:00 PM</option>
    <option value="9:00 PM">9:00 PM</option>
    </select>
    
    <hr>
<label for="seats">Select the Seats:</label>
<select name="seats">

 

  <%for(int i=1;i<=10;i++){%>
  <option value="<%=i %>"><%=i %></option>
  
    <%}%>
    </select>
    <br>

 

    <button type="submit" class="registerbtn">Submit</button>
  </div>
  
</form>

 

</body>
</html>
 