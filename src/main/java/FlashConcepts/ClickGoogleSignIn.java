package FlashConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ClickGoogleSignIn {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.google.co.in/");
		
		//create the object for Screen class
		Screen s = new Screen();
		Pattern muteImg = new Pattern("C:\\Users\\akkyu01\\eclipse-workspace\\JavaTraining\\SikuliConcepts\\GoogleSignIn.png");
		
		s.wait(muteImg,9000);
		s.click();

	}

}
