package UBJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UBEdge {

	public static void main(String[] args) throws InterruptedException {
			
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\dvyas\\eclipse-workspace\\UtilityBilling\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		/* Navigate to the website URL and print its Title in the output */
		driver.get("https://uatbilling.boycecloud.com/BUBWeb_New/index.html#/auth/login");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		/* Maximize the browser */
		driver.manage().window().maximize();

		/* Enter the credentials on the Main BSF Login Page */
		driver.findElement(By.id("email")).sendKeys("sa@user.com");
		driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/section[2]/label[2]/input[1]")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);

		/* Change window */
		Set<String> id29 = driver.getWindowHandles();
		Iterator<String> it29 = id29.iterator();
		String childid29 = it29.next();
		driver.switchTo().window(childid29);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		
		/*Lands on the School Financial Links Page and Click on the 'QAMinor' hyperlinkand print its Title in the output*/
		Select s = new Select(driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/app-login/div/div/div/div/div/form/div/fieldset/section/select")));
		s.selectByValue("2");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		System.out.println(driver.getTitle());

	}

}
