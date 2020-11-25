package tarefaToDo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaTarefa")
public class NovaTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Fazendo variavel para receber o nome e data da tarefa
		String nomeTarefa = request.getParameter("tarefa");
		
			
		//Atraves da variavel "tarefa" conseguimos acessar o Objeto Tarefa e setar a Tarefa
		Tarefa tarefa = new Tarefa();
		tarefa.setnomeTarefa(nomeTarefa);
		
		//Aqui para conseguir acessar o OBJETO BancoToDo usamos a variavel "banco" e nela adicionamos o OBJETO tarefa
		BancoToDo banco = new BancoToDo();
		banco.adiciona(tarefa);
		
		//Aqui estamos Setando um atribudo na requesição 
		//Passamos a variavel que esta apresentando o Objeto vircula o nome da variavel fazendo o Get
		request.setAttribute("tarefa", tarefa.getnomeTarefa());
		
		//Redirecionando pelo navegador
		//Aqui estamos Fazendo o direcionamento ao lado do cliente e não no servidor
		response.sendRedirect("listaTarefa");
	}


}
