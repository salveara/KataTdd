package KataTdd.KataTdd;

public class Calculator {

	public int Add(String numbers) {
		if (numbers.equals("")) {
			return 0;	
		} else {	
			Integer position = numbers.indexOf(',');
			if (position.equals(-1)){
				return Integer.parseInt(numbers);
			} else {
				return Integer.parseInt(numbers.substring(0, position)) + Integer.parseInt(numbers.substring(position+1, numbers.length()));
			}
			
		}
	}

}
