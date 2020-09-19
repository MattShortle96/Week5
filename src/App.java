
public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		logger1.log("Hello");
		logger1.error("Hello");
		
		logger1.log("My name is Matthew Shortle");
		logger1.error("This is a simple error message.");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		logger2.error("Hello");
		
		logger2.log("My name is Matthew Shortle");
		logger2.error("This is a simple error message.");

	}

}
