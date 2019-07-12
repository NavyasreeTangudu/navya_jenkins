package utilities;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

	static{

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}

	//Initialize Log4j instance
	private static Logger Log = Logger.getLogger(utilities.Log.class.getName());

	//We can use it when starting tests
	public static void startLog (String message){
		Log.info(message);
	}

	//We can use it when ending tests
	public static void endLog (String message){
		Log.info(message);
	}

	//Info Level Logs
	public static void info (String message) {
		Log.info(message);
	}

	//Warn Level Logs
	public static void warn (String message) {
		Log.warn(message);
	}

	//Error Level Logs
	public static void error (String message) {
		Log.error(message);
	}

	//Fatal Level Logs
	public static void fatal (String message) {
		Log.fatal(message);
	}

	//Debug Level Logs
	public static void debug (String message) {
		Log.debug(message);
	}
}