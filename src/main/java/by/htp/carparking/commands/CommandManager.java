package by.htp.carparking.commands;

import java.util.HashMap;
import java.util.Map;

import by.htp.carparking.commands.impl.DefaultCommand;
import by.htp.carparking.commands.impl.ShowCarsList;
import static by.htp.carparking.commands.util.CommandsPool.*;

public class CommandManager {
	private static final CommandManager manager = new CommandManager();
	
	private Map<String, BaseCommand> commands;

	public CommandManager() {
		commands = new HashMap<>();
		commands.put(SHOW_CARS_LIST,new ShowCarsList());
	}
	
	public static CommandManager getManager() {
		return manager;
	}
	
	public BaseCommand defineServerAction(String action) {
		BaseCommand command = null;
		if(action != null) {
			System.out.println("Hello from BaseCommand");
			command = commands.get(action);
		}
		else {
			command = new DefaultCommand();
		}
		return command;
	}
}
