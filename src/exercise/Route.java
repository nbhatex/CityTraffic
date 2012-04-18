package exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Route {
	private ArrayList<Stretch> stretches;
	
	public Route() {
		stretches = new ArrayList<Stretch>();
	}
	
	public void addStretch(Stretch stretch) {
		stretches.add(stretch);
	}
	
	/**
	 * @param route Route object 
	 * @return Time taken to traverse the route in seconds
	 */
	
	public long calculateTimeTaken(Car car) {
		Iterator<Stretch> iter = stretches.iterator();
		
		long time = 0;
		
		while(iter.hasNext()){
			Stretch s = iter.next();
			time += s.timeTaken(car);
			if (iter.hasNext() &&  time % 180 >= 60) {
				double t1 = time / 180.0f;
				long t2 = (long)Math.ceil(t1);
				time =  t2 * 180 + 10;
			}
		}
		return time;
	}


}
