
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

			
			//sprint 3
			printList.US33(people, families);
			printList.US30(people, families);
			
			checkPersonInfo.US14(people, families);
			checkPersonInfo.US18(people, families);
			
			
			
			//SPRINT 1 & SPRINT2
//			printList.US29(people, families);
//		
			checkDate.US01(people, families);
			checkDate.US02(people, families);
			checkDate.US03(people);
			checkDate.US07(people);
			checkDate.US10(people, families);
			checkDate.US12(people, families);
			checkPersonInfo.US15(families);
			checkPersonInfo.US21(people,families);
			checkPersonInfo.US22(people, families);
			checkPersonInfo.US23(people);
			checkDate.US42(people, families);
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
