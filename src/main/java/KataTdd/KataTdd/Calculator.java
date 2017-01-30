package KataTdd.KataTdd;

import java.util.ArrayList;

public class Calculator {

	public int Add(String numbers) {
		if (numbers.equals("")) {
			return 0;	
		} else {	
			Integer position = numbers.indexOf(',');
			if (position.equals(-1)){
				return Integer.parseInt(numbers);
			} else {
			int sum = 0;
			int posAnt = 0;
			while (position >= 0){
				sum += Integer.parseInt(numbers.substring(posAnt, position));
				posAnt = position + 1;
				position = numbers.indexOf(',' , position + 1);
			}
			sum += Integer.parseInt(numbers.substring(posAnt, numbers.length()));
			return sum;
			}
		}
	}

}
