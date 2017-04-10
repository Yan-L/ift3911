package Administration;

import Voyages.*;
import java.util.List;

public class Invoker {

	private List<Voyage> voyagesLst;
	private List<Installation> installationsLst;
	private List<Compagnie> cieLst;
	private List<Command> commandLst;
	int cmdexec =0;

	public void undo() {
		commandLst.get(cmdexec).unexecute();
		cmdexec--;
	}

	public void exec(){
		while (cmdexec < commandLst.size()){
			commandLst.get(cmdexec).execute();
			cmdexec++;
		}
	}



	/**
	 * 
	 * @param c
	 */
	public void add(Command c) {
		commandLst.add(c);
	}

}