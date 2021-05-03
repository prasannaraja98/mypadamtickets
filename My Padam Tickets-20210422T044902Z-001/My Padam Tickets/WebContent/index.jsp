<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>My Padam Tickets</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<style>
@supports (-webkit-text-stroke: 1px black) { h1 { -webkit-text-stroke: 1px black; -webkit-text-fill-color: white; } }
body {
height: 100vh;
background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
url("https://yt3.ggpht.com/ytc/AAUvwnjOiMXhgdXd1vCbKgj_RKxjblkPh1M_JY4W4FGJ=s900-c-k-c0x00ffffff-no-rj");

background-size: cover;
background-position: center;
text-shadow: 0 0.05rem 0.1rem rgba(0, 0, 0, 0.5);
box-shadow: inset 0 0 5rem rgba(0, 0, 0, 0.5);
}
.cover-container {
max-width: 60vw;
}

.nav-link {
padding: 0.25rem 0;
font-weight: 700;
color: rgba(255,255,255,0.5);
margin-left: 1rem;
border-bottom: 0.25rem solid transparent;
}

.nav-link:hover{
color: rgba(255,255,255,0.5);
border-bottom-color:rgba(255,255,255,0.5);
}

.nav-link.active {
color: white;
border-bottom-color:white;

}

.btn-secondary, .btn-secondary:hover{
color: #333;
text-shadow: none;
}
</style>
</head>

<body class="d-flex text-center text-white bg-dark">

 <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
<header class="mb-auto">
<div>
<h3 class="float-md-left mb-0">My Padam Tickets</h3>
<nav class="nav nav-masthead justify-content-center float-md-right">
<a class="nav-link active" aria-current="page" href="#">Home</a>
<a class="nav-link" href="loginpage.html">Login</a>
<a class="nav-link" href="signuppage.html">Register</a>
</nav>
</div>
</header>
<main class="px-3">
<h1><b>My Padam Tickets</b> </h1>
<h2 class="lead">  <br><b>Are you Tired of OTT's...</b> <br>
<b>Come and watch Movies in Big screen</b></h2>
<h1><b>Login to view the Movies List</b></h1>
</main>

 <footer class="mt-auto text-white-50">
<p>&copy; 2020 </p>
</footer>

</div>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"
integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/"
crossorigin="anonymous"></script>
</body>

</html>