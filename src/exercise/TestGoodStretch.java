package exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestGoodStretch {
	
	@Test
	public void testTimeTaken() {
		GoodStretch gs = new GoodStretch(1);
		long t = gs.timeTakenInSeconds();
		assertEquals(60,t);
	}
	
	@Test
	public void testTimeTakenZeroDistance(){
		GoodStretch gs = new GoodStretch(0);
		long t = gs.timeTakenInSeconds();
		assertEquals(0,t);
	}
	
	@Test
	public void testNegativeDistance() {
		try {
			Stretch goodStretch = new GoodStretch(-1.0f);
		} catch (RuntimeException rex){
			return;
		}
		fail("Expected RuntimeException ");
	}


}
