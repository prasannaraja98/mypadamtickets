<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.container {
  position: relative;
  width: 100%;
  max-width: 400px;
}

.container img {
  width: 100%;
  height: auto;
}

body.background{
opacity:0.5;
}
h1{
font-color:red
}

</style>
</head>
<body background="https://cdn3.vectorstock.com/i/1000x1000/49/52/cinema-tickets-paper-movie-ticket-symbol-vector-20614952.jpg">
<center>
 <h1><b>Grab your Tickets!!</b></h1>
      
       <h1>Show the QR Code in Screens and Watch the favourite film</h1>
       
       <button class="btn btn-danger">Date : ${ date }</button> &nbsp;&nbsp;     
       <button class="btn btn-danger">Time : ${ time }</button><br><br>
        
       <button class="btn btn-danger">   Seats : ${ seats }  </button>  &nbsp;&nbsp;  
        <button class="btn btn-danger">   Cost : ${ cost }</button>
        
          <button class="btn btn-danger">Click on the QR to download</button>

<div class="container">
   <a href="/images/a-guide-to-qr-codes-and-how-to-scan-qr-codes-2.png" download="MovieTickets QR">
  <img src="https://www.kaspersky.com/content/en-global/images/repository/isc/2020/9910/a-guide-to-qr-codes-and-how-to-scan-qr-codes-2.png" alt="Snow" style="width:80%">
    </a>
  
</div>
</center>

</body>
</html>
