package exercise;

public abstract class Stretch {

	private float distance;
	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public Stretch(float distance) {
		this.distance = distance;
		
	}

	/**
	 * 
	 * @return Time taken to traverse distnace in seconds
	 */
	public long timeTaken() {
		long t = (long) (this.getDistance() /getSpeed() * 60);
		return t;
	}
	
	abstract public float getSpeed();
}
