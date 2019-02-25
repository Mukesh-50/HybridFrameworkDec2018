package javaTutorials;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapDemo2 {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.id("username"));
		
		LinkedHashMap<String, String> students=new LinkedHashMap<String, String>();
		
		students.put("Mukesh", "QTP");
		students.put("20", "Narayan");
		students.put("30", "Kiran");
		students.put("40", "EktaPuniti");
		students.put("1", "Naveen");
		students.put("2", "Narayan");
		students.put("3", "Kiran");
		students.put("4", "EktaPuniti");
		students.put("5", "Mukesh");
		students.put("6", "Dipak");
		students.put("7", "Selenium");
		students.put("8", "Jagman");
		
		//System.out.println(students.get("4"));
		
		System.out.println(students);

	}

}
