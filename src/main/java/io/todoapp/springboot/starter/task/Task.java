package io.todoapp.springboot.starter.task;

import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String taskName;
	private String taskDescription;
	@DateTimeFormat (pattern="yyyy-mm-dd") 
	private String taskCreatedDate;
	@DateTimeFormat (pattern="yyyy-mm-dd") 
	private String taskUpdateDate;
	private String taskStatus;
	
	public Task() {
		
	}
	
	public Task(Integer id, String taskName, String taskDescription, String taskCreatedDate, String taskUpdateDate,
			String taskStatus) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskCreatedDate = taskCreatedDate;
		this.taskUpdateDate = taskUpdateDate;
		this.taskStatus = taskStatus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getTaskCreatedDate() {
		return taskCreatedDate;
	}
	public void setTaskCreatedDate(String taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}
	public String getTaskUpdateDate() {
		return taskUpdateDate;
	}
	public void setTaskUpdateDate(String taskUpdateDate) {
		this.taskUpdateDate = taskUpdateDate;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	} 
	

}
