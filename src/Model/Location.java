package Model;

public class Location {

	private int x;
	private int y;
	
	public double getDistance(Location target) {
		
		int xDiffer = target.x -x;
		int yDiffer = target.y -x;
		return Math.sqrt(
				Math.pow(xDiffer,  2) +
				Math.pow(yDiffer,  2)
				);
		
				
		
	}
	
	public int getX() {
		return x;
		
	}
	
}
