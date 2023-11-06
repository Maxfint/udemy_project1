import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\maxim\\Desktop\\kimml\\Job\\Education\\Udemy.Selenium Webdriver with Java\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\maxim\\Desktop\\kimml\\Job\\Education\\Udemy.Selenium Webdriver with Java\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\maxim\\Desktop\\kimml\\Job\\Education\\Udemy.Selenium Webdriver with Java\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://ya.ru");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
