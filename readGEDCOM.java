
import java.io.IOException;
import java.util.*;
import wagu.*;

public class readGEDCOM {
	public static List<Person> people = new ArrayList<>();    //List of persons with id 
	public static List<Family> families =  new ArrayList<>(); //List of families with id 
	
	public static void main(String[] args) {
		ParseGEDCOM parseFile = new ParseGEDCOM();
		PrintList printList = new PrintList();
		CheckDate checkDate = new CheckDate();
		CheckPersonInfo checkPersonInfo = new CheckPersonInfo();
		try {
			parseFile.parse();
			
			people = parseFile.getPeople();
			families = parseFile.getFamilies();

			//SPRINT 1
//			printList.US29(people, families);
//			checkDate.US42(people, families);
//			checkDate.US02(people, families);
//			checkDate.US12(people, families);
//			checkDate.US01(people, families);
//			checkDate.US10(people, families);
			
			//SPRINT2
			checkDate.US07(people);
			checkPersonInfo.US23(people);

			checkDate.US03(people);
			checkPersonInfo.US21(people,families);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
