package org.dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\New folder\\DropDownTest\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gettyimages.in/");
		WebElement clkCreative=driver.findElement(By.xpath("(//div[@ng-click=\"showOverlay()\"])[2]"));
		Select s=new Select(driver.findElement(By.xpath("//label[text()='Video']")));
		s.selectByVisibleText("Video");
		
		/*List<WebElement> emp= s.getOptions();
		emp.get(1);
		for (int i = 0; i < emp.size(); i++) {
			WebElement w=emp.get(i);
			String name = w.getText();
			System.out.println(name);
		}*/
		//driver.quit();
		
		
		
	}

}
