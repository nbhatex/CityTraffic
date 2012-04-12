package exercise;

public class GoodStretch extends Stretch {
	
	private static float SPEED =  60.0f / 60;

	public GoodStretch(float distance) {
		super(distance);
	}

	@Override
	public float getSpeed() {
		return SPEED;
	}
}
