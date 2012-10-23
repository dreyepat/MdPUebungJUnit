package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MdpJunitDreyer;

public class MdpJunitTest {
	
	String meinTest;
	
	@Test
	public void mdpClassTest(){
		MdpJunitDreyer test = new MdpJunitDreyer();
	}
	
	@Test
	public void methodenTest(){
		MdpJunitDreyer test = new MdpJunitDreyer();
		
		//s.capitalize testen
		meinTest = "HELLO";
		meinTest = test.capitalize(meinTest);
		assertEquals("Hello", meinTest);
		meinTest = "123ABCd";
		meinTest = test.capitalize(meinTest);
		assertEquals("123abcd", meinTest);
		
		
		//s isEmpty testen
		meinTest = null;
		assertTrue(test.isEmpty(meinTest));
		meinTest = "";
		assertTrue(test.isEmpty(meinTest));
		meinTest = "Juhuuii";
		assertFalse(test.isEmpty(meinTest));
		
		//s reverse testen
		meinTest = "mein Test";
		meinTest = test.reverse(meinTest);
		assertEquals("tseT niem", meinTest);
		
		
		//die Methonde 'join' testen
		String s1 = "Mein";
		String s2 = "Test";
		String s3 = "für diese Methode";
		meinTest = test.join(s1, s2, s3);
		assertEquals("Mein Test für diese Methode", meinTest);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void exceptionTest(){
		MdpJunitDreyer test = new MdpJunitDreyer();
		meinTest = null;
		meinTest = test.reverse(meinTest);}	

}
