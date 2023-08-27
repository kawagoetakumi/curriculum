<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- FIXME Step-1-1: login.jspに適用するcssファイルのリンクタグを記述しなさい。-->
<!-- Tips1: common.css、login.cssの2つを適用-->
<!-- Tips2: 適用するcssファイルのパスの書き方に注意 -->
<!-- [MVC_TASK/src/main/webapp/css/common.css] -->
<!-- [MVC_TASK/src/main/webapp/css/login.css] -->
<script type="text/javascript" src="js/common.js"/></script>
<title>ログイン</title>
</head>
<body>
    <input id="hiddenDialog" type="hidden" value="<%=requestStatus == 2 ? message : ""%>"></input>
    <h2>ログイン</h2>
    <div class="div-login-form">
        <% if (requestStatus < 2 && !message.isEmpty()) { %>
            <!-- FIXME Step-1-2: 以下の手順に沿って適当な処理を記述しなさい。 -->
            <!-- 1. エラー（message）表示時に使用するlabelタグの準備-->
            <!-- 2. class属性と、適用するスタイルの記述-->
            <!-- Tips: common.cssより赤色の文字色を定義しているスタイルを確認 -->
            <label for="error_label">パスワードに誤りがあります。:</label>
            	  <input type="message" color="red" >
            <br>
        <% } %>
        <!-- FIXME Step-1-3: actionに送信先URIを記述しなさい。 -->
        <!-- Tips: 「/このプロジェクト/web.xmlに記述されているservlet-name」 -->
        <form action="./employee" method="post">
            <div class="div-input-flex-area">
                <div>
                    <label>社員番号　: </label>
                    <input id="empId" type="text" name="empId" maxlength="5" value="<%=empId%>"><br>
                </div>
                <div>
                    <label>パスワード: </label>
                    <input id="password" type="password" name="password"><br>
                </div>
            </div>
            <div class="div-button-area">
                <input type="hidden" name="sender" value="/login.jsp"></input>
                <button id="btn-login" class="btn-login" name="requestType" value="login">ログイン</button>
            </div>
        </form>
    </div>
</body>
</html>