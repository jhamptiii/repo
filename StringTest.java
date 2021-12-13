/*
 * Class: CMSC201 
 * Instructor: Dr.Grinberg
 * Description: Project 6. testing string methods with jUint
 * Due: 12/13/21
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: John Hampton III
*/


package mytest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**this class tests the java string methods with JUnit */

public class StringTest {
/**s1 will be the test subject for all the string method tests */
	String s1 = "test";
	
/** this test will check the length() method  */
	@Test
	public void testLength() {
		assertEquals(s1.length(), 4);
	}

/** this test will	check the charAt() method */
	@Test
	public void testCharAt() {
		assertEquals(s1.charAt(0), 't');
	}

	/** this test will check the substring() method */
	@Test
	public void testSubString() {
		assertEquals(s1.substring(1, 3), "es");
	}
	/** this test will check the indexOf() method */
	@Test
	public void testindexOf() {
		assertEquals(s1.indexOf('e'), 1);
	}
	
}
