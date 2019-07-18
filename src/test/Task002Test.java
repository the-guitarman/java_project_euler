package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task_002_even_fibonacci_terms_under_4_000_000.Task002;

public class Task002Test {

	@Test
	public void sumOfAllEvenFibonacciTermsUnder4000000Test() {
		Task002 calc = new Task002(4_000_000);
		assertEquals(4613732, calc.sumOfEvenFibonacciTermsUnderBorder());
	}

}
