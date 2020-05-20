
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<h1>Главная</h1>
<#if user??>
    <h2>${user.getName()}</h2>
    <h2>${user.getEmail()}</h2>
</#if>
<a href="/chat"><input type="submit" value="chat"></a>
</body>
</html>
