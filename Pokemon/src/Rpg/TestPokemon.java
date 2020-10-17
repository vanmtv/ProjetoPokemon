package Rpg;

public class TestPokemon {
	public static void main(String args[]) {
		System.out.println("Init");
		
		Pokemon pok = new Pokemon("seila", 100, 10, 10, 10, 20, 1.2, 0, 1000);
		
		pok.imprimirInfo();
	}
}
