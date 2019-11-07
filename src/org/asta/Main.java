package org.asta;

import org.asta.framework.TaskManager;
import org.asta.tasks.Woodcutting;
import org.rspeer.script.Script;
import org.rspeer.script.ScriptMeta;

@ScriptMeta(developer = "Asta", name = "Woodcutter", desc = "Cuts anything")
public class Main extends Script {

	private TaskManager manager;

	public Main() {
		this.manager = new TaskManager(new Woodcutting());
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public int loop() {
		manager.execute();
		return 400;
	}
}