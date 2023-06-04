package homew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leads {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath(" //span[text()=' MARKETING']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele);
		a.perform();
		driver.findElement(By.xpath(" //span[text()=' Contacts']")).click();
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	}

}
