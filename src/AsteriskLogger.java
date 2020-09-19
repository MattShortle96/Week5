
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		//log = "Hello";
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String message) {
		//message = "Hello";
		System.err.println("****************\n" + "***Error: " + message + "***\n" + "****************");
		
		
	}

}
