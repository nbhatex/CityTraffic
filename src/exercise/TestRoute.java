package exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRoute {
	
	@Test
	public void testShouldReturnJourneyTimeFor1StretchGood(){
		float distance = 1;
		Stretch stretch = new GoodStretch(distance);
		Route route = new Route();
		route.addStretch(stretch);
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(60,time);
	}
	
	@Test
	public void testShouldReturnJourneyTimeFor1StretchBad(){
		float distance =1;
		Stretch stretch = new BadStretch(distance);
		Route route = new Route();
		route.addStretch(stretch);
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(120,time);
	}
	
		@Test
	public void test2StretchGoodWithoutSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(3));
		route.addStretch(new GoodStretch(2));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(300,time);
	}
	
		@Test
	public void test2StretchGoodWithSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(2));
		route.addStretch(new GoodStretch(2));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(310,time);
	}

		@Test
	public void test2Strech1Good1BadWithSignal(){
		Route route = new Route();
		route.addStretch(new GoodStretch(2));
		route.addStretch(new BadStretch(2));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(430,time);
	}
	
	@Test
	public void test3Stretch3BadWithoutSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(0.1f));
		route.addStretch(new BadStretch(0.1f));
		route.addStretch(new BadStretch(0.1f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(36,time);
	}
	
	@Test
	public void test3Stretch3BadWithSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(0.3f));
		route.addStretch(new BadStretch(0.3f));
		route.addStretch(new BadStretch(0.2f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(214,time);
	}
	
	@Test
	public void test3Stretch1Good1BadWithSignalEdge01(){
		Route route = new Route();
		route.addStretch(new GoodStretch(4.0f));
		route.addStretch(new BadStretch(2.0f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(610,time);
	}
	
	@Test
	public void test3Stretch1Bad1GoodWithSignal(){
		Route route = new Route();
		route.addStretch(new BadStretch(1.0f));
		route.addStretch(new GoodStretch(4.0f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(430,time);
	}
	
	@Test 
	public void testHandleEmptyRoute() {
		Route route = new Route();
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(0,time);
	}
	
	@Test 
	public void testZeroDistance() {
		Route route = new Route();
		route.addStretch(new GoodStretch(0.0f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(0,time);
	}
	@Test 
	public void test2ZeroDistance() {
		Route route = new Route();
		route.addStretch(new GoodStretch(0.0f));
		route.addStretch(new GoodStretch(0.0f));
		Car car = new Car(60.0f / 60);
		long time = route.calculateTimeTaken(car);
		assertEquals(0,time);
	}

}
