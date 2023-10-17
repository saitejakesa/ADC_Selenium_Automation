package keywords;

import java.io.BufferedReader;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Generic {
	public WebDriver driver;
	public Properties prop;
	public Properties envProp;
	public Process process1;
	public Process process2;
	public StringBuilder output1;
	public StringBuilder output2;
	public BufferedReader reader1;
	public BufferedReader reader2;
	public String line;
	public Actions builder; 
	String currentvalue= null;
	Random rand;
	public String comparision;
	public ExtentTest test;
	String expectedvalue;
	String actualvalue;
	public SoftAssert assertion;
	long randomNum;
	String Beforevalue;
	

	public void waiting() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void waitforload(int i) throws InterruptedException {
		try {
	        TimeUnit.MILLISECONDS.sleep(i*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
				

	}
	public void quit() {
		driver.quit();
		
	}
	
	public void waitForPageToLoad() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		// ajax status
		while(i!=10){
		String state = (String)js.executeScript("return document.readyState;");
		log(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery status
		i=0;
		while(i!=10){
	
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		log("page has loaded with jquery and javascript dom");
		}
	public void refresh() throws InterruptedException {
		driver.navigate().refresh();
		//log("page refreshed");
		waitforload(5);
	}
	public void log(String msg) {
		System.out.println(msg);
		test.log(Status.INFO,msg);
	}
	public String[] DateSelector(int minhrs, int maxhrs, int minmin, int maxmin ) throws Exception {
		log("navigated to randomgen");
		rand = new Random();
		int hrs = (int)Math.floor(Math.random()*(maxhrs-minhrs+1)+minhrs);
		int min = (int)Math.floor(Math.random()*(maxmin-minmin+1)+minmin);
		log("random value generated");
		 String hrsstr = Integer.toString(hrs);
		 String minstr = Integer.toString(min);
		return new String[] {hrsstr, minstr};
		}
	public int StringToInt(String[] str) {
		int i;
		int [] arr;
		int size = str.length;
	      arr = new int [size];
	      for(i=0; i<size-1; i++) {
	         arr[i] = Integer.parseInt(str[i]);
	      }
		return arr[i];
		
	}
}
