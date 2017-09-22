package automacao.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecucaoChrome {
		
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//executaChromeDriver();
		executaGeckoDriver();
		Pagina.acessaPagina(driver);
			
	}
	
	public static void executaChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Meu Robo\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void executaGeckoDriver(){
		
		System.setProperty("webdriver.gecko.driver" ,"C:\\Meu Robo\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

}
