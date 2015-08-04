<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link id="siteIcon" rel="shortcut icon" type="image/gif" href="./PAGE-STYLE/images/ic_logo.png">
<title>
 <tiles:insertAttribute name="title" ignore="true" />
</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="./PAGE-STYLE/bootstrap/css/pages/signup.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="./PAGE-STYLE/bootstrap/js/vendor/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="./PAGE-STYLE/bootstrap/js/dist/css/formValidation.css">
<link rel="stylesheet" href="./PAGE-STYLE/bootstrap/js/dist/css/datepicker.css">
<link href="./PAGE-STYLE/bootstrap/css/pages/common.css" rel="stylesheet" type="text/css">
</head>
<body>
 <tiles:insertAttribute name="header" />
 <tiles:insertAttribute name="body" />
 <tiles:insertAttribute name="footer" />
 <!-- /account-container -->
 <!-- Text Under Box -->
 <!-- Placed at the end of the document so the pages load faster -->
 <script src="./PAGE-STYLE/bootstrap/js/vendor/jquery/jquery.min.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/vendor/bootstrap/js/bootstrap.min.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/dist/js/formValidation.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/dist/js/framework/bootstrap.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/vendor/bootstrap/js/globaldefine.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/dist/js/bootstrap-datepicker.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/pages/common.js"></script>
 <script src="./PAGE-STYLE/bootstrap/js/pages/signup.js"></script>
</body>
</html>