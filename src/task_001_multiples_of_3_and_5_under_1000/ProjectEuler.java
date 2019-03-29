package task_001_multiples_of_3_and_5_under_1000;

public class ProjectEuler {

	public static void main(String[] args) {
		Calculator calc = new Calculator(1000);
		int result = calc.sum_of_all_multiples_of_3_and_5_under_border();
		
		System.out.println("The sum of all multiples of 3 and 5 under 1000 is " + result + "!");
	}

}
