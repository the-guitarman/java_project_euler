package task_001_multiples_of_3_and_5_under_1000;

public class Calculator {
	protected static int BORDER;
	
	public Calculator(int border) {
		BORDER = border;
	}
	
	public int sum_of_all_multiples_of_3_and_5_under_border() {
		int result = 0;
	    
	    for (int i = 1; i < BORDER; i++) {
	        if (is_multiple_of_3(i) || is_multiple_of_5(i)) {
	            result += i;
	        }
	    }
	    
	    return result;
	}

	protected boolean is_multiple_of_3(int x) {
        return x % 3 == 0;
    }
    
	protected boolean is_multiple_of_5(int x) {
        return x % 5 == 0;
    }
}
