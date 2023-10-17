package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SettingChangePopup extends Generic {
	public void AllDelays() throws Exception {
		//waitForPageToLoad();
		waitforload(6);
	}
public WebElement clickSetting(String settingName) throws Exception {
	AllDelays();
	Beforevalue=driver.findElement(By.xpath("//span[text()='"+settingName+"']/parent::span/parent::td/following-sibling::td[1]")).getText();
	log("Before Value is "+Beforevalue);
	WebElement selection = driver.findElement(By.xpath("//span[text()='"+settingName+"']/parent::span/parent::td/following-sibling::td[4]/button"));
	builder = new Actions(driver);
	builder.moveToElement(selection).click(selection);
	builder.perform();
	log("clicked on the setting");
	return selection;
	
}
}
