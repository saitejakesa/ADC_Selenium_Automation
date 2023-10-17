package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class Validation extends SettingChangePage {
	public String SettingActualValuevalidation(String settingName) throws Exception {
		AllDelays();
		log( "validating the setting with validation() method navigation");
		WebElement xpathcheck = driver.findElement(By.xpath("//span[text()='"+settingName+"']/parent::span/parent::td/following-sibling::td[1]"));
		actualvalue =xpathcheck.getText();
		log(actualvalue);
		log( "value  "+ actualvalue);
		return actualvalue;
			
		}
	public void settingvalidator() {
		assertion= new SoftAssert();
		assertion.assertEquals(actualvalue, expectedvalue, "Expected and actualvalues are different so failed");
		assertion.assertAll();
	}
	public void sameSetting() {
		assertion= new SoftAssert();
		assertion.assertFalse(actualvalue.equals(Beforevalue));
		assertion.assertAll();
	}
}
