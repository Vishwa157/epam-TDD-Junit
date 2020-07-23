import static org.junit.Assert.*;

import epam_Task.Testing;

public class Test {

	Testing test=new Testing();
	
	@org.junit.Test
	public void test1()	{
		assertEquals("",test.BringIt(""));
	}
	
	@org.junit.Test
	public void test2() {
		assertEquals("B",test.BringIt("B"));
	}
	
	@org.junit.Test
	public void test3()	{
		assertEquals("B",test.BringIt("AAB"));	
	}	
	
	@org.junit.Test
	public void test4()	{
		assertEquals("BCD",test.BringIt("ABCD"));	
	}	
	
	@org.junit.Test
	public void test5()	{
		assertEquals("BCD",test.BringIt("BACD"));	
	}	
	
	@org.junit.Test
	public void test6()	{
		assertEquals("BCDE",test.BringIt("BCDE"));	
	}
}
