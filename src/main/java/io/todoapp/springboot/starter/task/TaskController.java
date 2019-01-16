package io.todoapp.springboot.starter.task;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="*")
public class TaskController {
	
	@Autowired
	private TaskService toDotaskService;
	
	@RequestMapping("/tasks")
	public List<Task> getAllTasks() {
		return toDotaskService.getAllTasks();
	}
	
	@RequestMapping("/tasks/{id}")
	public Task getTask(@PathVariable int id) {
		return toDotaskService.getTask(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tasks")
	public void addTask(@RequestBody Task toDoTask) {
		toDotaskService.addTask(toDoTask);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tasks/{id}")
	public void updateTask(@RequestBody Task toDoTask, @PathVariable int id) {
		toDotaskService.updateTask(id, toDoTask);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tasks/{id}")
	public void deleteTask(@PathVariable int id) {
		 toDotaskService.deleteTask(id);
	}
	

}
