package keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentTest;

public class Application extends Settings {
//public class Application extends Validation {
	public void setReport(ExtentTest test) {
		this.test=test;
	}
	public void navigateToUploadAndDownload() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Upload/Download Device Settings']")).click();
		driver.findElement(By.xpath("//*[@name='ctl00$phBody$btnUDSettings']")).click();
		log("Upload And Download Settings opened");
	}
	public void DealerLoginPage() throws Exception {
		driver.get("https://alarmadmin.alarm.com");
		log("Navigated to Alarm.com");
		driver.findElement(By.id("txtUsername")).sendKeys("qarsid");
		log("Entered user name");
		driver.findElement(By.id("txtPassword")).sendKeys("Qolsys@123");
		log("Entered password");
		driver.findElement(By.id("butLogin")).click();
		log("cliked on //login");
		Thread.sleep(2000);
	}
	public void CustomerSelectionPage() {
		log("Navigated to Customer Selection");
		driver.findElement(By.xpath("//*//Input[@type='search']")).sendKeys("861394040088507");
		driver.findElement(By.xpath("//a[@id='serialNumber'] //child::i[@class='arrow adc-arrow-right']")).click();
		log("Customer Selection selected");
		
	}
	public void AirFxPage() {
		driver.findElement(By.xpath("//*[@title='AirFx Legacy Toolkit']")).click();
		log("AirFx Legacy Tool Kit opened");
	}
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/saiteja/Downloads/eclipse-java-2019-06-R-linux-gtk-x86_64/eclipse/eclipserequirements/chromedriver_linux64/chromedriver");
		 
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    log("Chrome Browser Opening");
	    	
	}
}
