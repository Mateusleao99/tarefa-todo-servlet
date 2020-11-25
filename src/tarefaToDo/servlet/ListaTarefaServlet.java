package tarefaToDo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaTarefa")
public class ListaTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Iniciamos o banco de dados
		BancoToDo banco = new BancoToDo();
		
		//Usamos a Lista que ta no OBJETO Tarefa que puxa as tarefas dentro da lista
		List<Tarefa> lista = banco.getnomeTarefa();
		
		
		//Chamando JSP
		//Manda para o JSP uma lista com Tarefas dentro
		request.setAttribute("tarefa", lista);
		
		//Aqui estamos fazendo uma requisição dispachar para uma outra pagina JSP
		RequestDispatcher rd = request.getRequestDispatcher("/todasTarefas.jsp");
		//Dispacha uma requesição e uma resposta
		rd.forward(request, response);
		
		
	}
}
