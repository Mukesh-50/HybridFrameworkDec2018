package javaTutorials;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		
		HashMap<String, String> students=new HashMap<String, String>();
		
		students.put("Mukesh", "QTP");
		students.put("2", "Narayan");
		students.put("3", "Kiran");
		students.put("4", "EktaPuniti");
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
