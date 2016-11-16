package agh.cs.lab4;

import java.util.List;
import java.util.LinkedList;

public class UnboundedMap implements IWorldMap {
	
	List<HayStack> hayStacks = new LinkedList<>();
	List<Car> cars = new LinkedList<>();
	
	public UnboundedMap(List<HayStack> hayStacks){
		this.hayStacks.addAll(hayStacks);
	}
	
	public String toString(){
		Position lowerLeft, upperRight;
		lowerLeft=cars.get(1).getPosition();
		upperRight=cars.get(1).getPosition();
		for(HayStack hay: hayStacks){
			if(hay.getPosition().smaller(lowerLeft)) lowerLeft=hay.getPosition();
			if(hay.getPosition().larger(upperRight)) upperRight=hay.getPosition();
		}
		for(Car car: cars){
			if(car.getPosition().smaller(lowerLeft)) lowerLeft=car.getPosition();
			if(car.getPosition().larger(upperRight)) upperRight=car.getPosition();
		}
		return null;
		
	}

	@Override
	public boolean canMoveTo(Position position) {
		for(HayStack hay: hayStacks){
			if(position.equals(hay.getPosition())) return false;
		}
		for(Car car: cars){
			if(position.equals(car.getPosition())) return false;
		}
		return true;
	}

	@Override
	public boolean add(Car car) {
		if(this.canMoveTo(car.getPosition())){
			cars.add(car);
			return true;
		}
		else return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		int i=0;
		for(Car car: cars){
			car.move(directions[i%cars.size()]);
		}
	}

	@Override
	public boolean isOccupied(Position position) {
		for(HayStack hay: hayStacks){
			if(position.equals(hay.getPosition())) return true;
		}
		for(Car car: cars){
			if(position.equals(car.getPosition())) return true;
		}
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		for(HayStack hay: hayStacks){
			if(position.equals(hay.getPosition())) return hay;
		}
		for(Car car: cars){
			if(position.equals(car.getPosition())) return car;
		}
		return null;
	}

}
