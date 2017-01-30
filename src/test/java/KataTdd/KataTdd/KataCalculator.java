package KataTdd.KataTdd;

import org.junit.Assert;
import org.junit.Test;

public class KataCalculator {
	@Test
	public void emptyStringShouldReturn0(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("");
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void oneStringShouldReturn1(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("5");
		Assert.assertEquals(5, result);
	}
	
	@Test
	public void twoStringShouldReturnSum(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("8,12");
		Assert.assertEquals(20, result);
	}
	
	
}
