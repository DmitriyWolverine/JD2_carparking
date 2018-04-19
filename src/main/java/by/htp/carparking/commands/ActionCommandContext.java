package by.htp.carparking.commands;

import org.springframework.web.context.WebApplicationContext;

public class ActionCommandContext {
	
	private ActionCommandContext() {
		
	}
	
	public static BaseCommand getAction(String action, WebApplicationContext webApplicationContet) {
		return (BaseCommand) webApplicationContet.getBean(action);
	}

}
