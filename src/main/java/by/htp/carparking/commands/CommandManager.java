package by.htp.carparking.commands;

import java.util.HashMap;
import java.util.Map;

import by.htp.carparking.commands.impl.CreateCar;
import by.htp.carparking.commands.impl.DefaultCommand;
import by.htp.carparking.commands.impl.DeleteCar;
import by.htp.carparking.commands.impl.GoToUpdateBookPage;
import by.htp.carparking.commands.impl.OrderCar;
import by.htp.carparking.commands.impl.ReturnCar;
import by.htp.carparking.commands.impl.ShowCarsList;
import by.htp.carparking.commands.impl.UpdateCar;

import static by.htp.carparking.commands.util.CommandsPool.*;

public class CommandManager {
	private static final CommandManager manager = new CommandManager();
	
	private Map<String, BaseCommand> commands;

	private CommandManager() {
		commands = new HashMap<>();
		/*
		 * we don't have empty constructors to fill the map, so need to implement them
		 * commands.put(SHOW_CARS_LIST, new ShowCarsList());
		commands.put(CREATE_NEW_CAR, new CreateCar());
		commands.put(DELETE_CAR, new DeleteCar());
		commands.put(UPDATE_CAR, new UpdateCar());
		commands.put(TO_UPDATE_CAR_PAGE, new GoToUpdateBookPage());
		commands.put(RETURN_CAR, new ReturnCar());
		commands.put(ORDER_CAR, new OrderCar());*/
	}
	
	public static CommandManager getManager() {
		return manager;
	}
	
	public BaseCommand defineServerAction(String action) {
		BaseCommand command = null;
		if(action != null) {
			command = commands.get(action);
		}
		else {
			command = new DefaultCommand();
		}
		return command;
	}
}
