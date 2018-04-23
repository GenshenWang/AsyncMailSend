<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset=utf-8>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <title>登录</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdn.bootcss.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="http://cdn.bootcss.com/ionicons/2.0.1/css/ionicons.min.css">

    <script src="//cdn.bootcss.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

    <style type="text/css">
        html,body {
            height: 100%;
        }
        body.login-page {
            background: #5b99bd;
        }
        .login-box {
            box-shadow: 0 -25px 100px #3f90bf;
            width: 400px;
            position: relative;
            top:30%;
            margin: auto;
        }
        .login-box-body {
            background: transparent;
        }
        .form-control {
            background: #69a9ce;
            color: white;
            border: transparent;
        }
        .login-logo {
            font-family: 'Microsoft Yahei';
            color: #0f74ae;
            font-size: 18px;
            padding-top: 10px;
            margin-bottom: 5px;
            text-align: center;
        }
        .login-box input::-webkit-input-placeholder {
            color: white !important;
        }
        .login-box input:-moz-placeholder {
            /* FF 4-18 */
            color: white !important;
        }
        .login-box input::-moz-placeholder {
            /* FF 19+ */
            color: white !important;
        }
        .login-box input:-ms-input-placeholder {
            /* IE 10+ */
            color: white !important;
        }
    </style>

    <script>
        $(function () {
            $("#loginBtn").click(function () {
                var email = $("#emailInput").val();
                var password = $("#passwdInput").val();
               window.location.href = "/user/dologin?email="  + email +"&password=" + password;
            });
        })
     </script>
</head>

<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        权限系统登录
    </div>

    <div class="login-box-body" style="padding-top: 20px;">
        <div data-loginbox-elem="table">
            <div class="form-group has-feedback" data-loginbox-elem="emailTr">
                <input type="text" name="emailInput" id="emailInput" class="form-control" placeholder="请输入邮箱" data-loginbox-elem="emailInput">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback" data-loginbox-elem="passwdTr">
                <input type="password" name="passwdInput" id="passwdInput" class="form-control" placeholder="请输入密码" data-loginbox-elem="passwdInput">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>

            <div class="row" style="padding-top: 15px;">
                <div class="col-xs-12" >
                    <button type="submit" class="btn btn-primary btn-block btn-flat" style="height:50px;" id="loginBtn" data-loginbox-elem="loginBtn">注册</button>
                   <%-- <a href="/user/dologin" class="btn btn-primary btn-block btn-flat" type="button" data-loginbox-elem="loginBtn" id="loginBtn">注册</a>--%>
                </div>
            </div>
        </div>

    </div>
</div>


</body>
</html>