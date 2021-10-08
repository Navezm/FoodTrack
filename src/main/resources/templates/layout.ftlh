<#macro layout>
    <!doctype html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>FoodTrack</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">

    </head>
    <body>
        <header>
            <nav class="row">
                <div class="col-6">
                    <div>
                        <img class="w-25 ms-3 mt-3" src="../img/logo.png" alt="">
                        <#nested >
                    </div>
                </div>
                <div class="col-6 d-flex justify-content-end">
                    <div>
                        <span>{{Role}}</span>
                        <button class="btn btn-danger me-3 mt-3">{{Connect/Deconnect}}</button>
                    </div>
                </div>
            </nav>
        </header>

        <#nested />


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
    </body>
    </html>
</#macro>