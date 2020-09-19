
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ").trim());
		
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.err.println("ERROR: " + message.replace("", " ").trim());
		
	}

}
