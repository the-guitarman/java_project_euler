package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task001Test {

	@Test
	public void multiples_of_3_and_5_under_1000_test() {
		//fail("Not yet implemented");
		
		task_001_multiples_of_3_and_5_under_1000.Calculator calc = new task_001_multiples_of_3_and_5_under_1000.Calculator(1000);
		assertEquals(233168, calc.sum_of_all_multiples_of_3_and_5_under_border());
	}

}
