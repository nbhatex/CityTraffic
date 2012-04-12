package exercise;

import java.util.ArrayList;

public class Route {
	private ArrayList<Stretch> stretches;
	
	public ArrayList<Stretch> getStretches() {
		return stretches;
	}

	public Route() {
		stretches = new ArrayList<Stretch>();
	}
	
	public void addStretch(Stretch stretch) {
		stretches.add(stretch);
		
	}

}
