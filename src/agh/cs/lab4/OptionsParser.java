package agh.cs.lab4;

public class OptionsParser {
	MoveDirection[] parse(String args[]){
		MoveDirection[] tab = new MoveDirection[args.length];
		String x = new String();
		for(int i=0; i<args.length; i++ ){
			x = args[i];
			if(x.equals("f") || x.equals("forward")){
				tab[i]=MoveDirection.Forward;
			}
			if(x.equals("b") || x.equals("backward")){
				tab[i]=MoveDirection.Backward;
			}
		}
		return tab;
	}
}
