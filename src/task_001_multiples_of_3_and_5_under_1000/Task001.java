package task_001_multiples_of_3_and_5_under_1000;

public class Task001 {
	protected static int BORDER;
	
	public Task001(int border) {
		BORDER = border;
	}
	
	public int sumOfAllMultiplesOf3And5UnderBorder() {
		int result = 0;
	    
	    for (int i = 1; i < BORDER; i++) {
	        if (isMultipleOf3(i) || isMultipleOf5(i)) {
	            result += i;
	        }
	    }
	    
	    return result;
	}

	protected boolean isMultipleOf3(int x) {
        return x % 3 == 0;
    }
    
	protected boolean isMultipleOf5(int x) {
        return x % 5 == 0;
    }
}
