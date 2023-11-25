package com.spring.ToDoPlanner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo_detail")
public class TaskDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String task;
	
	private int priority;
	@Column(name="timeDuration")
	private String interval;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public TaskDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaskDetail(int id, String task, int priority, String interval) {
		super();
		this.id = id;
		this.task = task;
		this.priority = priority;
		this.interval = interval;
	}
	@Override
	public String toString() {
		return "TaskDetail [id=" + id + ", task=" + task + ", priority=" + priority + ", interval=" + interval + "]";
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	
	
}
