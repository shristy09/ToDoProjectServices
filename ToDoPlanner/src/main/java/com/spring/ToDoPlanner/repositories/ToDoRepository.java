package com.spring.ToDoPlanner.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.spring.ToDoPlanner.entity.TaskDetail;

@Repository
public interface ToDoRepository extends JpaRepository<TaskDetail,Integer> {
	public List<TaskDetail> findAll();
}
