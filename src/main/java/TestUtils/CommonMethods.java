package TestUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static Properties prop = new Properties();
	
	public String getProperties(String key) throws Exception {
		String configPath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream configFile = new FileInputStream(configPath);
		prop.load(configFile);
		String value= prop.getProperty(key).toString();

		if(StringUtils.isEmpty(value)) {
			throw new Exception("value is empty for key: "+key + "in config file");
		}
		return value;
	}
	
	public void selectDropDown(WebElement element, String Text) {
		Select dd = new Select(element);
		dd.selectByVisibleText(Text);

	}

	public void selectRadioButton(List<WebElement> element, String Text) {
		for(WebElement ele : element) {
			if(ele.getText().equalsIgnoreCase(Text)) {
				ele.click();
				ele.click();
				break;
			}

		}

	}

}
