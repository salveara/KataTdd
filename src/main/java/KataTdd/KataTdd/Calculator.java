package KataTdd.KataTdd;

import java.util.ArrayList;

public class Calculator {

	public int Add(String numbers) {
		if (numbers.equals("")) {
			return 0;	
		} else {
			int sum = 0;
			String number[];
			number = numbers.split(",|\\\n");
			for (int i = 0; i < number.length; i++){
				sum += Integer.valueOf(number[i]);
			}
			return sum;
		}
	}

}
