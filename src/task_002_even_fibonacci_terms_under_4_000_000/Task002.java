package task_002_even_fibonacci_terms_under_4_000_000;

public class Task002 {
	protected static int BORDER;
	
	public Task002(int border) {
		BORDER = border;
	}
	
	public int sumOfEvenFibonacciTermsUnderBorder() {
		int termOne = 1;
		int termTwo = 2;
		int currentSum = 0;
		int sumOfEvenTerms = termTwo;
		
		while (sumOfEvenTerms < BORDER) {
			currentSum = termOne + termTwo;
			termOne = termTwo;
			termTwo = currentSum;
			
			if (isEven(currentSum)) {
				sumOfEvenTerms += currentSum;
			}
		}
	    
	    return sumOfEvenTerms;
	}

	protected boolean isEven(int x) {
        return x % 2 == 0;
    }
}
