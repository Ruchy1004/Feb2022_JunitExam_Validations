package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NssTodoListPage {
	WebDriver driver;

	public NssTodoListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVE_BUTTON;
	@FindBy(how = How.NAME, using = "data")
	WebElement ADD_TEXT;
	@FindBy(how = How.NAME, using = "submit")
	WebElement ADD_BUTTON;

	public void addText() {
		String text[] = { "test1", "test2", "test3", "test4" };
		int x = text.length;
		for (int i = 0; i < x; i++) {
			System.out.println(text[i]);
			
		}
		
	}
	
	public void clickToggleAllCheckbox() {
		TOGGLE_ALL_CHECKBOX.click();
	
	}

	// *[@id="todos-content"]/form/ul/li[1]
	// *[@id="todos-content"]/form/ul/li[2]
	// *[@id="todos-content"]/form/ul/li[3]

	String before_xpath = "// *[@id=\"todos-content\"]/form/ul/li[";
	String after_xpath = "]";

	public void validateAllCheckBoxesAreChecked() {
		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.xpath(before_xpath + i + after_xpath)).click();
		}

	}

	 public void removeButton() {
	 REMOVE_BUTTON.click();
	 }

}
