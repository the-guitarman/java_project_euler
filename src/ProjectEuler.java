import task_001_multiples_of_3_and_5_under_1000.Task001;
import task_002_even_fibonacci_terms_under_4_000_000.Task002;

public class ProjectEuler {

	public static void main(String[] args) {
		int result = 0;
		
		Task001 task001 = new Task001(1000);
		result = task001.sumOfAllMultiplesOf3And5UnderBorder();
		System.out.println("The sum of all multiples of 3 and 5 under 1000 is " + result + "!");
		
		Task002 task002 = new Task002(4_000_000);
		result = task002.sumOfEvenFibonacciTermsUnderBorder();
		System.out.println("The sum of all even fibonacci terms under 4000000 is " + result + "!");
	}

}
