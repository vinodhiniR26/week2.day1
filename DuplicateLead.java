package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();  //WebDriverManager is a class
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();                            // interfaces manage,window,maximize
		
		WebElement username = driver.findElement(By.id("username"));  // after double quotes its  Ctrl+2,l
		
		username.sendKeys("Demosalesmanager");
		
		WebElement pwd = driver.findElement(By.id("password"));
		
		pwd.sendKeys("crmsfa");	
		
		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));
		
		loginbtn.click();
		
		WebElement 	c = driver.findElement(By.linkText("CRM/SFA"));
		
		c.click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		
		leads.click();
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		
		createLead.click();
		
		WebElement cmpyName = driver.findElement(By.id("createLeadForm_companyName"));
		cmpyName.sendKeys("MTS");
		
		
		WebElement  firstName= driver.findElement(By.id("createLeadForm_firstName"));
		
		firstName.sendKeys("Vinodhini");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		
		lastName.sendKeys("R");
		
		WebElement firstnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocal.sendKeys("VinodhiniRajavel");
		
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("CS");
		
		
//		WebElement des = driver.findElement(By.id("createLeadForm_description"));
//		des.sendKeys("Learing selenium");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("vinodhinirajavel23@gmail.com");
		
		WebElement stateOption = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(stateOption);
		dropdown.selectByVisibleText("New York");
		System.out.println("Dropdown otion is" + dropdown);
		
		WebElement createbtn = driver.findElement(By.className("smallSubmit"));
		createbtn.click();
		
		System.out.println("Page title is" + driver.getTitle());
		
		
		//duplicate Lead
		WebElement duplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
		duplicateLead.click();
		
		WebElement cmpyname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpyname.clear();
		cmpyname.sendKeys("TestLeaf");
		
		WebElement firstnameclr = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameclr.clear();
		firstnameclr.sendKeys("R vinodhini");
		
		WebElement createbtnd = driver.findElement(By.className("smallSubmit"));
		createbtnd.click();
		
		
		
		
		
		
	}

}
