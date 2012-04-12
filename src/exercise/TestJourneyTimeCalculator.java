package exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJourneyTimeCalculator {
	
	@Test
	public void testShouldReturnJourneyTimeFor1StretchGood(){
		float distance = 1;
		Stretch stretch = new GoodStretch(distance);
		Route route = new Route();
		route.addStretch(stretch);
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(60,time);
	}
	
	@Test
	public void testShouldReturnJourneyTimeFor1StretchBad(){
		float distance =1;
		Stretch stretch = new BadStretch(distance);
		Route route = new Route();
		route.addStretch(stretch);
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(120,time);
	}
	
		@Test
	public void test2StretchGoodWithoutSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(3));
		route.addStretch(new GoodStretch(2));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(300,time);
	}
	
		@Test
	public void test2StretchGoodWithSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(2));
		route.addStretch(new GoodStretch(2));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(310,time);
	}

		@Test
	public void test2Strech1Good1BadWithSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(2));
		route.addStretch(new BadStretch(2));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(430,time);
	}
	
	@Test
	public void test3Stretch3BadWithoutSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(0.1f));
		route.addStretch(new BadStretch(0.1f));
		route.addStretch(new BadStretch(0.1f));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(36,time);
	}
	
	@Test
	public void test3Stretch3BadWithSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(0.3f));
		route.addStretch(new BadStretch(0.3f));
		route.addStretch(new BadStretch(0.2f));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(214,time);
	}
	
	@Test
	public void test3Stretch1Good1BadWithSignalEdge01(){
		Route route = new Route();
		route.addStretch(new GoodStretch(4.0f));
		route.addStretch(new BadStretch(2.0f));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(610,time);
	}
	
	@Test
	public void test3Stretch1Bad1GoodWithSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(1.0f));
		route.addStretch(new GoodStretch(4.0f));
		JourneyTimeCalculator calc = new JourneyTimeCalculator();
		long time = calc.calculateTimeTaken(route);
		assertEquals(430,time);
	}
	
	
}
