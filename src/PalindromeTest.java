
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

		@Test
		public void whenEmptyString_thenAccept() {
			Plaindrome palindromeTester=new Plaindrome();
			assertTrue(palindromeTester.isPalindrome("madam"));
		}
	
}
