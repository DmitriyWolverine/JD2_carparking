package by.htp.carparking.commands;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {
	String doAction(HttpServletRequest request);
}
