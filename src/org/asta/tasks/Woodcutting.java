package org.asta.tasks;

import org.asta.framework.Task;
import org.asta.framework.TaskManager;
import org.asta.tasks.woodcutting_tasks.ChopTree;

public class Woodcutting implements Task {

	private TaskManager tasks;

	public Woodcutting() {
		this.tasks = new TaskManager(new ChopTree());
	}

	@Override
	public boolean validate() {
		return false;
	}

	@Override
	public void execute() {
		tasks.execute();
	}
}
