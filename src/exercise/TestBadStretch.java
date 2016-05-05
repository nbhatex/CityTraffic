package exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestBadStretch {
	@Test
	public void testTimeTaken() {
		BadStretch gs = new BadStretch(1);
		long t = gs.timeTakenInSeconds();
		assertEquals(120,t);
	}
	
	@Test
	public void testTimeTakenZeroDistance(){
		BadStretch gs = new BadStretch(0);
		long t = gs.timeTakenInSeconds();
		assertEquals(0,t);
	}
	
	@Test
	public void testNegativeDistance() {
		try {
			Stretch badStretch = new BadStretch(-1.0f);
		} catch (RuntimeException rex){
			return;
		}
		fail("Expected RuntimeException ");
	}

}
