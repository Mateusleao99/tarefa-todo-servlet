package tarefaToDo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Aqui nesse Servlet vamos pegar as informaçoes que recebemos da pagina e mandar ele para a pagina de alteração levando toda informação precisa
@WebServlet("/mostrarTarefas")
public class MostrarTarefasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Aqui precisamos puxar as informaçoes da tarefa, por meio do ID
		
		//Pegamos o id pelo parametro e armazenamos em paramId
		String paramId = request.getParameter("id");
		//Pegamos o id e convertemos ele em Integer 
		Integer id = Integer.valueOf(paramId);
		//Estanciamos o Banco para usarmos 
		BancoToDo banco = new BancoToDo();
		
		//Estanciamos a tarefa e usamos o metodo do banco buscarTarefaId para encontrar a tarefa desejada.
		Tarefa tarefa = banco.buscaTarefaId(id);
		//TESTANDO SE ESTAMOS CONSEGUINDO PEGAR O NOME PELO ID
		System.out.println(tarefa.getnomeTarefa());
		
		//Aqui estou SETANDO uma MODIFICAÇÃO na tarefa que foi puxado pelo id
		request.setAttribute("tarefa", tarefa);
		
		RequestDispatcher rd = request.getRequestDispatcher("alterarTarefa.jsp");
		rd.forward(request, response);
	}

}
