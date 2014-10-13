package Main;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcEngineTest extends CalcEngine {


	@Test
	public final void TestCalcEngine() {
		
		CalcEngine test = new CalcEngine();
		double result = test.FutureValue(10000.00, 3.00 , 3.25);
		assertEquals(11007.03, result, 0.001);
		
	}
	
	

	

}
