import static org.junit.Assert.*;
import org.junit.Test;

public class ParseGEDCOMTest {

	@Test
	public void testconvertMonth() {
		ParseGEDCOM gedcom = new ParseGEDCOM();
		assertEquals(gedcom.convertMonth("JAN"), "01");
		assertEquals(gedcom.convertMonth("PPP"), null);
		
		
	}

}
