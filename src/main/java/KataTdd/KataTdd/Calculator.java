package KataTdd.KataTdd;

public class Calculator {

	public int Add(String numbers) {
		if (numbers.equals("")) {
			return 0;	
		} else {
			return Integer.parseInt(numbers);
		}
	}

}
