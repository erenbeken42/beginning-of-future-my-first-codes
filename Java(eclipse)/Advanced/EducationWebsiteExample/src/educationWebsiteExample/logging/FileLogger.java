package educationWebsiteExample.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Gelen veri dosyaya loglandı!");
		
	}

}
