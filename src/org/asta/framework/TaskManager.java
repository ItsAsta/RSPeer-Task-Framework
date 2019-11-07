package org.asta.framework;

import java.util.concurrent.CopyOnWriteArrayList;

public class TaskManager {

	private CopyOnWriteArrayList<Task> tasks;

	public static TaskManager withTasks(Task ... tasks) {
		return new TaskManager(tasks);
	}

	public TaskManager(Task ... tasks) {
		this.tasks = new CopyOnWriteArrayList<>(tasks);
	}

	public void add(Task task) {
		tasks.add(task);
	}

	public void remove(Task task) {
		tasks.add(task);
	}

	public void execute() {
		for (Task task : tasks) {
			if(task.validate()) {
				task.execute();
				break;
			}
		}
	}
}