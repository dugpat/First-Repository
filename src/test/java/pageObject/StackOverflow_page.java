package pageObject;

import org.openqa.selenium.By;

public class StackOverflow_page {


public By StackOverflow_logo(){return By.xpath("//span[text()='Stack Overflow'])[1]");}

public By About_headerlink(){return By.xpath("//a[text()='About'])[1]");}

public By Products_headerlink(){return By.xpath("//a[contains(.,'Products')][1]");}

public By ForTeams_headerlink(){return By.xpath("//a[text()='For Teams'])[1]");}

public By Search_box(){return By.xpath("//input[@name='q']") ; }
public By Login_button(){return By.xpath("//a[text()='Log in']") ; }

public By signin_button(){return By.xpath("//a[text()='Log in']") ; }

}