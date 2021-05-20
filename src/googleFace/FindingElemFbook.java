package googleFace;
  import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class FindingElemFbook {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();	
			
	driver.get("https://www.Facebook.com");
	driver.manage().window().maximize();
	driver.findElementByName("firstname").sendKeys("Mohammed");
	driver.findElementByName("lastname").sendKeys("Hossain");
	driver.findElementByName("reg_email__").sendKeys("mmhossain110penn@gmail.com");
	driver.findElementByName("reg_passwd__").sendKeys("Moshrof70");
	driver.findElementByName("sex").click();
	
	WebElement month = driver.findElementById("month");
	WebElement day =driver.findElementById("day");
	WebElement year =driver.findElementById("year");

	Select monthSelect=new Select(month);
    monthSelect.selectByIndex(1);
    
    Select daySelect =new Select(day);
    daySelect.selectByIndex(1);
    
    Select yearSelect =new Select(year);
    yearSelect.selectByIndex(2);
	
    driver.findElementByName("websubmit").click();	
	driver.close();
		
	}

	} 

	
	


