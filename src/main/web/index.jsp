<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Cake</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link href="open-iconic/font/css/open-iconic-bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="js/mas.js"> </script>
</head>
<body>
<div class="container" style="width:35%; margin:auto; position: center;">
    <div class="shadow  mt-5 p-4 mb-4 bg-white">
        <div class ="row" >
            <div class="col"><h2>Курс валют НБКР</h2></div>
            <div class ="mt-2"><b>Дата</b> : ${date}</div>
        </div>
<c:forEach items="${currencyList}" var="currency">
    <div class ="row" >
        <div class="col">${currency.getIsocode()} :</div>
        <div class ="">${currency.getValue()}</div>
    </div>
</c:forEach>
    </div>
</div>
</body>
</html>
