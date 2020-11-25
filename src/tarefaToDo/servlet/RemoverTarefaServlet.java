package tarefaToDo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removerTarefa")
public class RemoverTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		
		//Pegamos a String fazemos a conversão para Integer uma variavel que recebe o nome de id
		Integer id = Integer.valueOf(paramId);
		
		
		
		//Chamamos o OBJETO BancoToDo 
		BancoToDo banco = new BancoToDo();
		//pega no Banco o parametro para remover a tarefa que o ID informado
		banco.removeTarefa(id);
		
		//redirecionando para todasTarefas
		response.sendRedirect("listaTarefa");
	}


}
