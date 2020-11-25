<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--Importando o core e colocando o prefix como "c"  --%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%--AQUI ESTAMOS ABRINDO UMA VARIAVEL COM O VALOR DO CAMINHO NOVA TAREFA --%>
 <c:url value="/novaTarefa" var="linkServeletNovaTarefa"/>
 
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Super toDo</title>

        <link rel="stylesheet" type="text/css" href="css/estilo.css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navback text-white" >
            <div class="container">
                <a href="#" class="navbar-brand text-white">
                    <img src="img/todo.png" width="40" height="40">
                    Super ToDo
                </a>
            </div>
        </nav>

        <div class="container app"> 
            <div class="row">
                <div class="col-md-3 menu">
                    <ul class="list-group">
                        <li class="list-group-item "><a href="index.jsp">Tarefas pendentes</a></li>
                        <li class="list-group-item active"><a href="novaTarefa.jsp">Nova tarefa</a></li>
                        <li class="list-group-item "><a href="todasTarefas.jsp">Todas tarefas</a></li>
                    </ul>
                </div>


                <div class="col-md-9">
                    <div class="container pagina">
                        <div class="row">
                            <div class="col">
                                <h4>Nova tarefa</h4>
                                <hr/>
                                <form method="post" action="${linkServeletNovaTarefa}">
                                    <div class="form-group">
                                        <label>Tarefa a ser criada</label>
                                        <input class="form-control" type="text" name="tarefa" placeholder="Exemplo: Comprar ovo">
                                    </div>
										<button type="submit" class="btn btn-block btnCadastrar">Cadastrar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>