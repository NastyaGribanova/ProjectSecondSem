<#import "spring.ftl" as spring />

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Shows</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/sign-in/">

    <!— Bootstrap core CSS —>
    <link href="/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

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

<body style="background: #d7faf2">
<div style="width:100%">

    <header class="blog-header py-3" style="background: #87deca; width: 100%">

        <nav class=" navbar row flex-nowrap justify-content-between align-items-center">
            <div class="col-4 pt-1" style="width: 100%">
                <a class="p-2 text-muted" href="/profile">Profile</a>
                <a class="p-2 text-muted" href="/shows">Shows</a>
                <a class="p-2 text-muted" href="/chat">Chat</a>
                <#if (user.role == "ADMIN")>
                    <a class="p-2 text-muted" href="/admin">Admin</a>
                </#if>
            </div>
            <div class="col-4 d-flex justify-content-end align-items-center ">
                <form class="form-signin " action="/logout" method="post">
                    <input class="btn btn-sm btn-outline-secondary" type="submit" value="Logout">
                </form>
            </div>
        </nav>

    </header>

</div>
</body>

<body style="background: #d7faf7">
<h1 align="center">Shows</h1>

<div class="my-3 p-3 bg-white container rounded shadow-sm">
    <#list shows as item>
        <div id=${item.getIdShow()} class="media">
            <p id="showsSvg">
                <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg"
                     preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32">
                    <title>
                        Placeholder</title>
                    <rect width="100%" height="100%" fill="#1ed2ae"></rect>
                </svg>
            </p>
            <p id="shows" class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                <strong class="d-block text-gray-dark">${item.getName()}</strong>
                ${item.getGenre()}
                ${item.getCountry()}

            <form action="/shows" method="post">
        <span style="float:right">
            <small class="d-block text-right mt-3">
            <input type="submit" class="btn" style="background: #1ed2ae" onclick="hide(${item.getIdShow()})"
                   value="Add to your list">
            <input type="hidden" name="show_id" id="show_id" value=${item.getIdShow()}>
            </small>
        </span>
            </form>
            </p>
        </div>
    </#list>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>

</body>
</html>