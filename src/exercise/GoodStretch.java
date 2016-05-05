package exercise;

public class GoodStretch extends Stretch {
	
	private static final Float AVERAGE_SPEED_KMPH = 60.0f;
	private static final float MIN_IN_HOUR = 60;
	
	public GoodStretch(float distance) {
		super(distance);
	}

	/**
	 * 
	 * @return Time taken to traverse distance in seconds
	 */
	public long timeTakenInSeconds() {
		long t = (long) ( (this.getDistance() / AVERAGE_SPEED_KMPH) * MIN_IN_HOUR);
		return t;
	}

}
