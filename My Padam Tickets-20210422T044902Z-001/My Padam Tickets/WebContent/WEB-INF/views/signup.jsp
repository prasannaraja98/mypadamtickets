

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">

</head>
<body>
<div class="container d-flex justify-content-center align-items-center mt-5">
    <div class="row">
        <div class="col-md-6 offset-md-3 col-xl-4 offset-xl-4">
            <div class="card shadow">
                <img src="https://i.pinimg.com/originals/f4/0e/e2/f40ee225e3dccda7aa1a4de202b241bf.jpg"
                    alt="" class="card-img-top" />
                <div class="card-body">
                    <h5 class="card-title">Register</h5>
                    <form action="signup.html" method="POST" class="validated-form" novalidate>
                        <div class="mb-3">
                            <label class="form-label" for="name">Name</label>
                            <input class="form-control" type="text" id="name" name="name" required autofocus>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                          <div class="mb-3">
                            <label class="form-label" for="phoneno">Phone Number.</label>
                            <input class="form-control" type="text" id="phoneno" name="phoneno" required>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                      
                        <div class="mb-3">
                            <label class="form-label" for="email">Email</label>
                            <input class="form-control" type="email" id="email" name="email" required>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                        <div class="mb-3">
                            <label class="form-label" for="username">Username</label>
                            <input class="form-control" type="text" id="username" name="username" required autofocus>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                        
                        <div class="mb-3">
                            <label class="form-label" for="password1">set Password</label>
                            <input class="form-control" type="password" id="password1" name="password1" required>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                          <div class="mb-3">
                            <label class="form-label" for="password2">confirm Password</label>
                            <input class="form-control" type="password" id="password2" name="password2" required>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                        </div>
                      
                        <button class="btn btn-success btn-block">Register</button>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>