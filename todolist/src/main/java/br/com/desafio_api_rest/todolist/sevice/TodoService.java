package br.com.desafio_api_rest.todolist.sevice;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.desafio_api_rest.todolist.entity.Todo;
import br.com.desafio_api_rest.todolist.repository.TodoRepository;

@Service
public class TodoService {
	private TodoRepository todoRepository;
	
	
	public TodoService(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	public List<Todo> create(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> list(){
		Sort sort = Sort.by(...properties:"prioridade").descending().
				and(Sort.by(...properties:"nome")).ascending());
		return todoRepository.findAll(sort);
	}
	
	public List<Todo> update(Todo todo){
		todoRepository.save(todo);
		return list();
	}
		
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);;
		return list();
	}
}
	
