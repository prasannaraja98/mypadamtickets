<!DOCTYPE html>
<html>
<head>
    <style>

 

#section1 {
  height: 600px;
  background-color:black;
}
.main{
    margin:20px;
}
        div.gallery {
          margin: 20px;
          margin-top: 75px;
        
          border: 1px solid #ccc;
          float: left;
          width: 325px;
        }
        
        div.gallery:hover {
          border: 1px solid #777;
        }
        
        div.gallery img {
          width: 100%;
        
        }
        
        div.desc {
          padding: 15px;
          text-align: center;
        }

 

        .gallery .btn {
  position: relative;
  top: 80%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);

 

  color: white;
  font-size: 16px;
  padding: 12px 24px;
  border: none;
  cursor: pointer;
  border-radius: 5px;
  text-align: center;
}

 

.container .btn:hover {
  background-color: red;
}
        </style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
</head>
<body>

 

<center><h1 style="color: chocolate;">Welcome to My padam Tickets, ${ username }</h1></center>

 

<div class="main" id="section1">
    <div class="gallery">
       
          <img src="https://wallpapercave.com/wp/wp5429971.jpg" alt="Cinque Terre" width="600" height="400">
        <form action="master.html" method="post">
        <button class="btn btn-danger" ><b>Book</b></button>
        </form>
       
      </div>
      
      <div class="gallery">
       
          <img src="https://m.media-amazon.com/images/M/MV5BZmYzMzU4NjctNDI0Mi00MGExLWI3ZDQtYzQzYThmYzc2ZmNjXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_.jpg" alt="Mountains" width="600" height="400">
        <form action="kong.html" method="post">
        <button class="btn btn-danger" ><b>Book</b></button>
        </form>
      </div>
      
      <div class="gallery">
        
          <img src="https://st1.bollywoodlife.com/wp-content/uploads/2015/03/mankatha_movie_posters_063.jpg" alt="Forest" width="600" height="400">
         <form action="mangatha.html" method="post">
        <button class="btn btn-danger" ><b>Book</b></button>
       </form>
      </div>
      
      <div class="gallery">
        
          <img src="https://cgujengsitefiles.s3.ap-south-1.amazonaws.com/wp-content/uploads/2020/11/11.jpg" alt="Northern Lights" width="600" height="400">
        <form action="sooraraipotru.html" method="post">
        <button class="btn btn-danger" ><b>Book</b></button>
        </form>
      </div>
      
      
      
</div>

 

</body>
</html>