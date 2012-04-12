package exercise;

public abstract class Stretch {

	private float distance;
	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		if ( distance < 0) {
			throw new RuntimeException("Invalid input");
		}
		
		this.distance = distance;
	}

	public Stretch(float distance) {
		if ( distance < 0) {
			throw new RuntimeException("Invalid input");
		}
		this.distance = distance;
		
	}

	/**
	 * 
	 * @return Time taken to traverse distance in seconds
	 */
	public long timeTaken() {
		long t = (long) (this.getDistance() /getSpeed() * 60);
		return t;
	}
	
	abstract public float getSpeed();
}
