import java.util.*;

public class PrintGeneric <x> {

	void printArray(ArrayList <x> i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		ArrayList <Integer> i = new ArrayList<>();
		ArrayList <String> s = new ArrayList<>();
		
		i.add(1);
		i.add(2);
		i.add(3);
		
		s.add("Aryan");
		s.add("pandey");
		s.add("singla");
	
		PrintGeneric g = new PrintGeneric();
		
		g.printArray(i);
		g.printArray(s);
	
	}

}
