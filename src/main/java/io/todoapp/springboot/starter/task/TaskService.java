package io.todoapp.springboot.starter.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TaskService {
	
	private List<Task> tasks = new ArrayList<>(Arrays.asList(
			
				));

	public List<Task> getAllTasks(){
		return tasks;
	}
	
	public Task getTask(int id) {
		return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTask(Task toDoTask) {
		tasks.add(toDoTask);
		
	}

	public void updateTask(int id, Task toDoTask) {
		for(int i=0; i<tasks.size(); i++ ) {
			Task t = tasks.get(i);
			if(t.getId().equals(id)) {
				tasks.set(i, toDoTask);
				return;
			}
		}
		
	}

	public void deleteTask(int id) {
		
		tasks.removeIf(t -> t.getId().equals(id));
	}
}
