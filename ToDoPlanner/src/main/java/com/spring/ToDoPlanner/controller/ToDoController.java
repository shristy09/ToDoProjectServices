package com.spring.ToDoPlanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.ToDoPlanner.entity.TaskDetail;
import com.spring.ToDoPlanner.services.ToDoService;

@Controller
public class ToDoController {
	@Autowired
	private ToDoService toDoService;
	@GetMapping("/getTaskDetail")
	public ResponseEntity<List<TaskDetail>> getAllTasks() { 
        return ResponseEntity.ok(toDoService.getAllTask()); 
    } 
	@PostMapping("/saveTask")
	public ResponseEntity<TaskDetail> createTask(@RequestBody TaskDetail task) { 
        return ResponseEntity.ok(toDoService.createNewTask(task)); 
    }
}

