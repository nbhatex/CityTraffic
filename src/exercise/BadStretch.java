package exercise;

public class BadStretch extends Stretch {

	
	public BadStretch(float distance) {
		super(distance);
	}

	/**
	 * 
	 * @return Time taken to traverse distance in seconds
	 */
	public long timeTaken(Car car) {
		long t = (long) (this.getDistance() /(car.getSpeed()/2) * 60);
		return t;
	}


	

}
