<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário de Cadastro</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 250px;
            padding: 5px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Formulário de Cadastro</h1>
    <form action="salvarInformacoesServlet" method="post">
        <label for="login">Login:</label>
        <input type="text" id="login" name="login"><br>

        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome"><br>

        <label for="idade">Idade:</label>
        <input type="text" id="idade" name="idade"><br>

        <label for="universidade">Universidade:</label>
        <input type="text" id="universidade" name="universidade"><br>

        <label for="curso">Curso:</label>
        <input type="text" id="curso" name="curso"><br>

        <label for="empresa">Empresa:</label>
        <input type="text" id="empresa" name="empresa"><br>

        <label for="cargo">Cargo:</label>
        <input type="text" id="cargo" name="cargo"><br>

        <input type="submit" value="Salvar">
    </form>
</body>
</html>
