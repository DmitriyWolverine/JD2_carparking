package by.htp.carparking.commands.util;

public class IdSaver {
	private static int id;
	private IdSaver() {
		
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		IdSaver.id = id;
	}
	
	
	

}
