/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: project 6 test isPrime method with JUint
 * Due: 12/13/21
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: John Hampton III
*/


package chapter6;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberMethodTest {
 /** the method isPrime() from the PrimeNumberMethod.java file */
	
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { 
	        return false; 
	      }
	    }

	    return true; 
	  }
	
	/** testing the method isPrime() returns true when a prime number is entered
	 * and false when a non prime number is entered
	 */
	@Test
	public void testPrimeNumber() {
		assertTrue(isPrime(5));
	}

}
