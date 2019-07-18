package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task_001_multiples_of_3_and_5_under_1000.Task001;

public class Task001Test {

	@Test
	public void sumOfAllMultiplesOf3And5Under1000Test() {
		//fail("Not yet implemented");
		
		Task001 calc = new Task001(1000);
		assertEquals(233168, calc.sumOfAllMultiplesOf3And5UnderBorder());
	}

}
