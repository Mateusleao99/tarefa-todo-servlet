package tarefaToDo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterarTarefa")
public class AlterarTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//buscar o id
		String paramId = request.getParameter("id");
		String nomeTarefa = request.getParameter("tarefa");
		
		//converter o id para int 
		Integer id = Integer.valueOf(paramId);
		
		BancoToDo banco = new BancoToDo();
		Tarefa tarefa = banco.buscaTarefaId(id);
		
		tarefa.setnomeTarefa(nomeTarefa);
		
		response.sendRedirect("listaTarefa");

	}

}
