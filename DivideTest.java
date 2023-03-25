package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivideTest {
	
	//positive test cases

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		double output=test.divide(6,3);
		assertEquals(2.0,output);
		
	}
	@Test
	void test1() {
		JunitTesting test2=new JunitTesting();
		double output=test2.divide(9,3);
		assertEquals(3.0,output);
		
	}

	//negative test cases
	
	@Test
	void test2 () throws ArithmeticException
	{
		JunitTesting test3=new JunitTesting();
		try {
			test3.divide(3, 0);
			
		}
		catch (ArithmeticException e){
			assertEquals("/ by zero",e.getMessage());
			
		}
	}
	@Test
	void test3()
	{
		JunitTesting test4=new JunitTesting();
		double output=test4.divide(20,10);
		assertNotEquals(3.0,output);
	
		
	}
	

}
