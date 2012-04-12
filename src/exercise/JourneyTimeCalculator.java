package exercise;

import java.util.ArrayList;

public class JourneyTimeCalculator {
	
	/**
	 * @param route Route object 
	 * @return Time taken to traverse the route in seconds
	 */
	
	public long calculateTimeTaken(Route route) {
		ArrayList<Stretch> stretches = route.getStretches();
		long time = 0;
		for(int i =0; i < stretches.size();i++){
			Stretch s = stretches.get(i);
			time += s.timeTaken();
			if (i+1 < stretches.size() &&  time % 180 >= 60) {
				double t1 = time / 180.0f;
				long t2 = (long)Math.ceil(t1);
				time =  t2 * 180 + 10;
			}
		}
		return time;
	}

}
