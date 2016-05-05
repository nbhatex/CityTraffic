package exercise;

public class BadStretch extends Stretch {

	public static final Float AVERAGE_SPEED_KMPH = 30.0f;
	
	public BadStretch(float distance) {
		super(distance);
	}

	/**
	 * 
	 * @return Time taken to traverse distance in seconds
	 */
	public long timeTakenInSeconds() {
		long t = (long) (this.getDistance() /(AVERAGE_SPEED_KMPH * 60));
		return t;
	}


	

}
