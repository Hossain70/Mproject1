package googleFace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
								
				driver.manage().window().maximize();
				WebElement searchBox=
				driver.findElement(By.name("firstname"));
				searchBox.sendKeys("Mohammed");
				searchBox.submit();
//				
//				driver.findElementById("email");
//				searchBox.sendKeys("mmh");
//				searchBox.submit();
//				driver.close();
			}
		
	        }

    
