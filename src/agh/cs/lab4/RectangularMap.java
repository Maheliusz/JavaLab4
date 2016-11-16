package agh.cs.lab4;

public class RectangularMap implements IWorldMap {
	
	int width;
	int height;
	
	public RectangularMap(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	public String toString(){
		
		return null;
	}
	

	@Override
	public boolean canMoveTo(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOccupied(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

}
