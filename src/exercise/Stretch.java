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
	
	abstract public long timeTaken(Car car);
		
}
