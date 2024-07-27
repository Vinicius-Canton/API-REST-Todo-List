package br.com.desafio_api_rest.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio_api_rest.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}
