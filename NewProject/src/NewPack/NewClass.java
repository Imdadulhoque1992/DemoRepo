package NewPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rakesh@92");
		driver.findElement(By.id("u_0_2")).click();
		/*WebElement m1=driver.findElement(By.xpath("//input[@class='_1frb']"));
		m1.click();
		m1.sendKeys("Mst Julekha Khatun");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);*/
driver.close();
	}

}