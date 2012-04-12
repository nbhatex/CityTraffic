package exercise;

public class BadStretch extends Stretch {

	private static float SPEED = 30.0f / 60;
	
	public BadStretch(float distance) {
		super(distance);
	}

	@Override
	public float getSpeed() {
		return SPEED;
	}

	

}
