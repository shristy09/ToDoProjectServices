package com.spring.ToDoPlanner.services;

import org.springframework.stereotype.Service;

import com.spring.ToDoPlanner.entity.TaskDetail;
import com.spring.ToDoPlanner.repositories.ToDoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ToDoService {
	@Autowired
	public ToDoRepository toDoRepository;
	public TaskDetail createNewTask(TaskDetail task) {
		return toDoRepository.save(task);
	}
	 public List<TaskDetail> getAllTask() { 
	        return toDoRepository.findAll(); 
	    }  
}
