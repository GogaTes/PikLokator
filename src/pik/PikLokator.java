package pik;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class PikLokator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lela\\eclipse-workspace\\PikLokator\\executable\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.olx.ba/");
		
		Thread.sleep(3000);
		
		//Logo
	//	driver.findElement(By.id("piklogo")).click();
		
		//Search/Input
    //	driver.findElement(By.id("searchinput")).sendKeys("stan");
	//	driver.findElement(By.className("searchinput")).sendKeys("stan");
		
		//Nekretnine
	//	driver.findElement(By.xpath("//*[@id=\"headergore\"]/div/div/div/ul/li[5]/a")).click();
	//	driver.findElement(By.linkText("NEKRETNINE")).click(); //nije bas najbolje
		
		//Search
	//	driver.findElement(By.xpath("//*[@id=\"mainsearch\"]/div/form/button")).click();
		
		//Prijava
	//	driver.findElement(By.id("loginbtn")).click();
		
		//Objavite
	//	driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/header/div/div[1]/div/div[3]/div/a[1]")).click();
		
		//2065
	//	String text =  driver.findElement(By.xpath("/html/body/div[4]/div/h1/strong[2]")).getText();
	//	System.out.println(text);
	//	String text =  driver.findElement(By.cssSelector("strong:nth-child(3)")).getText();
	//	System.out.println(text);
		
		WebElement element = driver.findElement(By.xpath("//a[@class='menuitem maintainHover']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Thread.sleep(500);
		
		//Poslovi
	//	driver.findElement(By.id("submenu-poslovi")).click(); //ne moze preko id
	//	driver.findElement(By.xpath("//*[@id=\"pocetna-meni-lijevo\"]/li[4]")).click();
	//	driver.findElement(By.cssSelector("#pocetna-meni-lijevo>li:nth-child(4)>a")).click();
		
		//Kompjuteri
	//	 driver.findElement(By.cssSelector("#pocetna-meni-lijevo>li:nth-child(7)>a")).click();
		 
		 //Moj dom
	//	 driver.findElement(By.cssSelector("#pocetna-meni-lijevo>li:nth-child(9)>a")).click();
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
	}
}
