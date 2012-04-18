package exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestGoodStretch {
	
	@Test
	public void testTimeTaken() {
		Car car = new Car(60.f/60);
		GoodStretch gs = new GoodStretch(1);
		long t = gs.timeTaken(car);
		assertEquals(60,t);
	}
	
	@Test
	public void testTimeTakenZeroDistance(){
		Car car = new Car(60.f/60);
		GoodStretch gs = new GoodStretch(0);
		long t = gs.timeTaken(car);
		assertEquals(0,t);
	}
	
	@Test
	public void testNegativeDistance() {
		try {
			Stretch s = new GoodStretch(-1.0f);
		} catch (RuntimeException rex){
			return;
		}
		fail("Expected RuntimeException ");
	}


}
