<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Confirmação de Cadastro</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            margin-bottom: 20px;
        }

        h2 {
            margin-top: 20px;
        }

        ul {
            list-style-type: none;
            padding: 0;
            margin-top: 10px;
        }

        li {
            margin-bottom: 5px;
        }

        b {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>Confirmação de Cadastro</h1>
    <p>O cadastro foi realizado com sucesso!</p>
    <h2>Dados do Usuário:</h2>
    <ul>
        <li><b>Login:</b> <%= session.getAttribute("login") %></li>
        <li><b>Nome:</b> <%= session.getAttribute("nome") %></li>
        <li><b>Idade:</b> <%= session.getAttribute("idade") %></li>
        <li><b>Instituição:</b> <%= session.getAttribute("universidade") %></li>
        <li><b>Curso:</b> <%= session.getAttribute("curso") %></li>
        <li><b>Empresa:</b> <%= session.getAttribute("empresa") %></li>
        <li><b>Cargo:</b> <%= session.getAttribute("cargo") %></li>
    </ul>
</body>
</html>
