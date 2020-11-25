package tarefaToDo.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BancoToDo {
	
	//Usando List<Objeto> nomedaLista = recebendo um Array de listas
		private static List<Tarefa> lista = new ArrayList<>();
		
	//Simulando o id do banco de dados
	private static Integer chaveSequencial = 1; 
		
	//Aqui estou setando dois nomes de tarefas para fazer o teste sem precisar ficar adicionando toda hora
	static {
		  Tarefa tarefa = new Tarefa();
		  tarefa.setId(chaveSequencial++);
		  tarefa.setnomeTarefa("Corrida pela manhã");
		  Tarefa tarefa2 = new Tarefa();
		  tarefa.setId(chaveSequencial++);
		  tarefa2.setnomeTarefa("Aula de ingles");
		  //Aqui voce ta pegando o OBJETO Banco usa a Lista e dentro dela adiciona a Tarefa desejada
		  BancoToDo.lista.add(tarefa);
		  BancoToDo.lista.add(tarefa2);
		  
		}	
	
	//Aqui voce faz um metodo adicionar que vai receber o OBJETO Tarefa e colocar no Objeto BancoTodo no metodo Lista
	public void adiciona(Tarefa tarefa) {
		//Aumentando o ID da sequencia 
		tarefa.setId(BancoToDo.chaveSequencial++);
		BancoToDo.lista.add(tarefa);
		
	}
	
	//Aqui voce ta pegando a Lista do OBJETO Tarefa e retornando o Objeto com a lista dentro.
	public List<Tarefa> getnomeTarefa(){
		return BancoToDo.lista;
	}	
	
	
	public void removeTarefa(Integer id) {
		//Acessar uma coleção é com Iterator
		Iterator<Tarefa> it = lista.iterator();
		
		//hasNext faz uma perguta para o it tem um novo elemento ?
		//while enquanto tiver o elemento vamos pegar
		while (it.hasNext()) {
			
			//De o proximo elemento next.
			Tarefa tarefa = it.next();
			
			//Se sua tarefa for esse ID então remova
			if (tarefa.getId() == id) {
				it.remove();
			}
		}
	}
	//Busca da tarefa e alterar
	public Tarefa buscaTarefaId(Integer id) {
		for (Tarefa tarefa : lista) {
			if (tarefa.getId() == id) {
				return tarefa;
			}
		}
		return null;
	}
	
	
}
