<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>커뮤니티 게시판</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            text-align: center;
            max-width: 600px;
            padding: 20px;
            background-color: #f8f9fa;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        h3 {
            color: #333;
        }

        hr {
            border: 1px solid #ccc;
            margin-bottom: 20px;
        }

        a.button {
            display: inline-block;
            padding: 10px 20px;
            font-size: 16px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            margin: 5px;
        }

        a.button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>커뮤니티 게시판</h3>
        <hr>
        <a href="login.do" class="button">로그인</a><br>
        <a href="getBoardList.do" class="button">글목록 바로가기</a>
        <a href="dataTransform.do" class="button">글목록 데이터 변환(JSON)</a><br>
        <a href="dataTransform_xml.do" class="button">글목록 데이터 변환(XML)</a>
    </div>
</body>
</html>
