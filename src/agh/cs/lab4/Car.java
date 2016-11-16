package agh.cs.lab4;

public class Car{
	private static MapDirection mapdirection = MapDirection.North;
	
	IWorldMap map;
	
	private Position position = new Position(2,2);
	//private Position step = new Position(0,0);
	
	public String toString(){
		return mapdirection.toString();
	}
	
	public Car(IWorldMap map){
		this.map=map;
	}
	
	public Car(IWorldMap map, int x, int y){
		position=new Position(x,y);
		map.add(this);
	}
	
	public void move (MoveDirection direction){
		if(direction.equals(MoveDirection.Left)){
			mapdirection = mapdirection.previous();
		}
		if(direction.equals(MoveDirection.Right)){
			mapdirection = mapdirection.next();
		}
		if(direction.equals(MoveDirection.Forward)){
				
				switch(mapdirection){
					case West:
						if(map.canMoveTo(new Position(position.x-1, position.y)))
						position.x--;
						return;
					case East:
						if(map.canMoveTo(new Position(position.x+1, position.y)))
						position.x++;
						return;
					case North:
						if(map.canMoveTo(new Position(position.x, position.y+1)))
						position.y++;
						return;
					case South:
						if(map.canMoveTo(new Position(position.x, position.y-1)))
						position.y--;
				}
			
			
		}
		if(direction.equals(MoveDirection.Backward)){
			
				switch(mapdirection){
				case West:
					if(map.canMoveTo(new Position(position.x+1, position.y)))
					position.x++;
					return;
				case East:
					if(map.canMoveTo(new Position(position.x-1, position.y)))
					position.x--;
					return;
				case North:
					if(map.canMoveTo(new Position(position.x, position.y-1)))
					position.y--;
					return;
				case South:
					if(map.canMoveTo(new Position(position.x, position.y+1)))
					position.y++;
				}
			
		}
	}
	
	
	Position getPosition(){
		return position;
	}
	

	public static void main(String[] args) {
		MoveDirection[] directions = new OptionsParser().parse(args);
		IWorldMap map = new RectangularMap(10, 5);
		Car car = new Car(map); 
		map.add(car);
		map.add(new Car(map,3,4));
		map.run(directions);
		System.out.println(car.toString());
		/*MoveDirection direction = MoveDirection.Left;
		System.out.println(car.toString());	
		car.move(direction);
		System.out.println(car.toString());*/
		/*for(String x: args){
			move(x);
		}*/
	}
}
