package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
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
		
		//company name
		
		WebElement cmpyName = driver.findElement(By.id("createLeadForm_companyName"));
		cmpyName.sendKeys("Toast");
		
		//first name
		WebElement  firstName= driver.findElement(By.id("createLeadForm_firstName"));
		
		firstName.sendKeys("Vinodhini");
		
		//last name
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		
		lastName.sendKeys("R");
		
		//firstname loccal
		
		WebElement firstnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocal.sendKeys("Vino");
		
		
		//department
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("CS");
		
		//description
		WebElement des = driver.findElement(By.id("createLeadForm_description"));
		des.sendKeys("Learing selenium");
		
		//email address
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("vinodhinirajavel23@gmail.com");
		
		//Selectig a Dropdown 
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(state);
		dropdown.selectByVisibleText("New York");
	
	//create lead button
		WebElement createbtn = driver.findElement(By.className("smallSubmit"));
		createbtn.click();
		
		/*WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		driver.getTitle();*/
		
		
		//print title
		System.out.println("Page title is" + driver.getTitle());
		
		
		
		
		
		
		
	}

}
