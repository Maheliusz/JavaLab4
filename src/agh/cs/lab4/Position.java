package agh.cs.lab4;

public class Position {
	public int x, y;
	public Position(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Position add(Position other){
		return new Position(this.x+other.x, this.y+other.y);
	}
	public boolean smaller(Position other){
		if(this.x<=other.x && this.y<=other.y) return true;
		else return false;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	public boolean larger(Position other){
		if(this.x>=other.x && this.y>=other.y) return true;
		else return false;
	}
	public boolean equals(Object other){
		if (this == other) return true;
		if (!(other instanceof Position)) return false;
		Position pos = (Position) other;
		//Position that = (Position) other;
		if(this.x == pos.x && this.y == pos.y) return true;
		else return false;
	}
}
