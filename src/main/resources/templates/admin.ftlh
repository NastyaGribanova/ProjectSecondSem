<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Admin page</title>
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
<body style="background: #d7faf7">

<a href="/profile" class="btn btn-lg btn-primary btn-block" style="background: #1ed2ae">Profile</a>

<div align="center">
    <form class="form-signin " style="width: 400px; margin-top: 100px" action="/admin" method="post">

        <h1 class="h3 mb-3 font-weight-normal">Show</h1>
        <label for="inputName" class="sr-only">Name</label>
        <input name="name" class="form-control mb-3" placeholder="Name" required autofocus>
        <div>
            <label for="inputGenre" class="sr-only ">Genre</label>
        <select class="form-control" name="genre" id="inputGenre">
            <#list genres as genre>
                <option>${genre.name()}</option>
            </#list>
        </select>
        </div>
        <label for="inputCountry" class="sr-only ">Country</label>
        <input type="country" name="country" class="form-control" placeholder="Country" required>

        <p><input class="btn btn-lg btn-primary btn-block" style="background: #1ed2ae" type="submit" value="Add"></p>

    </form>
</div>
</body>
</html>
