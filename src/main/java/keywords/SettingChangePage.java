package keywords;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SettingChangePage extends SettingChangePopup {
	public WebElement changebutton() throws Exception {
		AllDelays();
		log( "change page occured");
		WebElement settingchange = driver.findElement(By.xpath("//input[@name='ctl00$phBody$butChange']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(settingchange).click(settingchange);
		builder.perform();
		log( "Setting name changed");
		return settingchange;
	}
	public String textgenerator(long max, long min) throws Exception {
		AllDelays();
		WebElement settvalue= driver.findElement(By.xpath("//input[@name ='ctl00$phBody$txtNewValue']"));
		rand = new Random();
		randomNum = (long)Math.floor(Math.random()*(max-min+1)+min);
		    
		 String s = Long.toString(randomNum);
		
		String value = String.valueOf(s);
		settvalue.sendKeys(value);
		log("random value generated");
		return value;
		
	}
	public String OptionSelector() throws Exception {
		AllDelays();
		while(true) {
			log("OptionSelector() navigated");
			String currentvalue= driver.findElement(By.xpath("//span[@id='ctl00_phBody_lblCurrentValue']")).getText();
			WebElement selectedvalue = driver.findElement(By.xpath("//select[@name ='ctl00$phBody$drpNewValue']"));
			Select select = new Select(selectedvalue);
			List<WebElement> allOptions = select.getOptions();
			int size = allOptions.size();
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
			WebElement selectedOption = allOptions.get(randnMumber);
			comparision = selectedOption.getText();
			log( "Random Option selected");
	 		if (comparision!=currentvalue){
	 			log("Selecting the different value as equal to current value");
				selectedOption.click();
				break;
	 		}
 		continue;
		}
		log("Changed Option is "+comparision);
		return comparision;
	}
	public String[] DateSelector(int maxhrs, int minhrs, int maxmin, int minmin) throws Exception {		
		AllDelays();
		WebElement settvalue= driver.findElement(By.xpath("//input[@name ='ctl00$phBody$txtNewValue']"));
		rand = new Random();
		int hrs = (int)Math.floor(Math.random()*(maxhrs-minhrs+1)+minhrs);
		int min = (int)Math.floor(Math.random()*(maxmin-minmin+1)+minmin);
		    
		 String hrsstr = Integer.toString(hrs);
		 String minstr = Integer.toString(min);
		settvalue.sendKeys(hrsstr+":"+minstr);
		log("random value generated");
		return new String[]{ hrsstr, minstr };
	}
}
