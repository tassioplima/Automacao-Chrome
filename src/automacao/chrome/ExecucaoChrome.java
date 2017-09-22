package automacao.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecucaoChrome {
		
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		executaChromeDriver();
			
	}
	
	public static void executaChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Meu Robo\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
