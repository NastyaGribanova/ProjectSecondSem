<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Sign up</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="signin.css" rel="stylesheet">


    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/sign-in/">

    <!— Bootstrap core CSS —>
    <link href="/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!— Favicons —>
    <link rel="apple-touch-icon" href="/docs/4.4/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/4.4/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/4.4/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon.ico">
    <meta name="msapplication-config" content="/docs/4.4/assets/img/favicons/browserconfig.xml">
    <meta name="theme-color" content="#563d7c">

</head>
<body class="text-center" style="background: #d7faf2">

<div align="center">
    <form class="form-signin " style="width: 400px; margin-top: 100px" action="/signUp" method="post">

        <h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>
        <label for="inputName" class="sr-only">Name</label>
        <input name="name" class="form-control mb-3" placeholder="Name" required autofocus>
        <label for="inputEmail" class="sr-only">Email address</label>
        <p><input name="email"  class="form-control mb-3"  oninput="checkEmail()" id="email" placeholder="Email" required></p>
        <p id="textWrongEmail" style="color: #bf0000" hidden >Incorrect e-mail</p>
        <p><input type="password" class="form-control" name="password" id="password" oninput="checkPassword()" placeholder="Password" required></p>
        <p id="textLessThan4" style="color: #bf0000" hidden >Password should have more than 4 characters</p>
        <p id="textNumbers" style="color: #bf0000" hidden >Password should have numbers</p>
        <p id="textLetters" style="color: #bf0000" hidden >Password should have letters</p>
        <p><input class="btn btn-lg btn-primary btn-block" style="background: #1ed2b7" type="submit" value="Sign up"></p>
        <a class="btn btn-lg btn-primary btn-block" style="background: #1ed2c3" href="/signIn">Already have an account?</a>

    </form>
</div>

<script>
    function checkEmail() {
        var email = document.getElementById("email").value;
        var textWrongEmail = document.getElementById("textWrongEmail");

        if (email.match(/.+@.+\..+/i)) {
            textWrongEmail.hidden = true;
        } else {
            textWrongEmail.hidden = false;
        }
    }

    function checkPassword() {
        var password = document.getElementById("password").value;
        var textLessThan4 = document.getElementById("textLessThan4");
        var textNumbers = document.getElementById("textNumbers");
        var textLetters = document.getElementById("textLetters");
        if (password.length < 4){
            textLessThan4.hidden = false;
        } else {
            textLessThan4.hidden = true;
        }

        if (password.match(/[0-9]/)){
            textNumbers.hidden = true;
        } else {
            textNumbers.hidden = false;
        }

        if (password.match(/[a-z]/) || (password.match(/[а-я]/))){
            textLetters.hidden = true;
        } else {
            textLetters.hidden = false;
        }
    }
</script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>