package exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestBadStretch {
	@Test
	public void testTimeTaken() {
		Car car = new Car(60.f/60);
		BadStretch gs = new BadStretch(1);
		long t = gs.timeTaken(car);
		assertEquals(120,t);
	}
	
	@Test
	public void testTimeTakenZeroDistance(){
		Car car = new Car(60.f/60);
		BadStretch gs = new BadStretch(0);
		long t = gs.timeTaken(car);
		assertEquals(0,t);
	}
	
	@Test
	public void testNegativeDistance() {
		try {
			Stretch s = new BadStretch(-1.0f);
		} catch (RuntimeException rex){
			return;
		}
		fail("Expected RuntimeException ");
	}

}
