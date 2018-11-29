package FlashConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVedio {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.youtube.com/watch?v=HG7Lv384yTU");
		
		//create the object for Screen class
		Screen s = new Screen();
		Pattern muteImg = new Pattern("C:\\Users\\akkyu01\\eclipse-workspace\\JavaTraining\\SikuliConcepts\\Mute.png");
		
		s.wait(muteImg,9000);
		s.click();
		
		
		
		Pattern pauseImg = new Pattern("C:\\\\Users\\\\akkyu01\\\\eclipse-workspace\\\\JavaTraining\\\\SikuliConcepts\\\\Pause.png");
		s.wait(muteImg,2000);
		s.click();
		
		Pattern settingImg = new Pattern("C:\\\\Users\\\\akkyu01\\\\eclipse-workspace\\\\JavaTraining\\\\SikuliConcepts\\\\Setting.png");
		s.wait(settingImg,2000);
		s.click();
		
		Pattern auto = new Pattern("C:\\\\Users\\\\akkyu01\\\\eclipse-workspace\\\\JavaTraining\\\\SikuliConcepts\\\\Auto_480.png");
		s.wait(auto,2000);
		s.click();
		//s.click()

	}

}
