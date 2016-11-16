package agh.cs.lab4;

import agh.cs.lab4.MapDirection;

public enum MapDirection {
	North,
	East,
	South,
	West;
	public String toString(){
	   switch(this){
	      case North: return "N";
	      case South: return "S";
	      case West: return "W";
	      case East: return "E";
	      default: return "null";
	    }
	}
	/*public MapDirection next(){
		switch(this){
			case North: return East;
			case South: return West;
			case West: return North;
			case East: return South;
			default: return North;
		}
	}*/
	public MapDirection next(){
		return MapDirection.values()[(this.ordinal()+1)%4];
	}
	public MapDirection previous(){
		return MapDirection.values()[(this.ordinal()+3)%4];
	}
	/*public MapDirection previous(){
		switch(this){
			case North: return West;
			case South: return East;
			case West: return South;
			case East: return North;
			default: return North;
		}
	}*/
}
