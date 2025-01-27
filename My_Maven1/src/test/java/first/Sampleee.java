package first;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampleee {
	@Test
	public void display() {
		
	//String expected = "Hello";
    //String actual = "Hello";
    
   /* Assert.assertEquals( expected, actual,"Strings are not equal");
    System.out.println("Test passed!");*/
		
		//2nd prgm
    //boolean admin=true;
    //Assert.assertFalse(admin,"bollean is true");
		
		boolean flag=false;
		assertFalse(flag,"Flag is true");
		
		int a=5,b=6;
		assertNotEquals(a,b,"a and b are equal");
		
		String s=null;
		assertNull(s,"s is not null");
		
		String str="hello";
	assertNotNull(str,"str is null");
	
	boolean ss=true;
	assertTrue(ss,"ss is false");
	
	
  }
}


