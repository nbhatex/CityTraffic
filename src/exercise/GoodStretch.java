package exercise;

public class GoodStretch extends Stretch {
	
	public GoodStretch(float distance) {
		super(distance);
	}

	/**
	 * 
	 * @return Time taken to traverse distance in seconds
	 */
	public long timeTaken(Car car) {
		long t = (long) (this.getDistance() /car.getSpeed() * 60);
		return t;
	}

}
