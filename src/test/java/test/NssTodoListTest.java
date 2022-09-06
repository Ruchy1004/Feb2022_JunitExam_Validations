package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.NssTodoListPage;
import util.BrowserFactory;

public class NssTodoListTest {
	WebDriver driver;

	@Test
	public void AllCheckBoxesAreChecked() throws InterruptedException {
		driver = BrowserFactory.init();

		NssTodoListPage todolist = PageFactory.initElements(driver, NssTodoListPage.class);
		// todolist.addText();
		todolist.clickToggleAllCheckbox();
		todolist.validateAllCheckBoxesAreChecked();

		// driver = BrowserFactory.init();
		// todolist.clickToggleAllCheckbox();
		todolist.removeButton();
		Thread.sleep(2000);
		// BrowserFactory.teardown();

	}

}
