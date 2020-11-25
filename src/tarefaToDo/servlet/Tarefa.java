package tarefaToDo.servlet;

//Tarefa aqui faz todo o trabalho de pegar e retornar os valores da Tarefa
public class Tarefa{
	//Variaveis do OBJ
	private int id;
	private String nomeTarefa;
	
	//Get e Set
	public String getnomeTarefa() {
		return nomeTarefa;
	}
	public void setnomeTarefa(String tarefa) {
		this.nomeTarefa = tarefa;
	}
	//Get e Set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
}

