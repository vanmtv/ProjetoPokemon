package Rpg;

import java.util.Scanner;

import java.util.List;

public class Main {
	
	static int rand(int i, int j) {
		return (int) Math.ceil(Math.random() * (i  - j + 1)) - 1 + j;
	}
	
	public static void main(String args[]) {
		String nome;
		int opcao, partida = -1;
		Scanner leia = new Scanner(System.in);
		
		Charmander charmander = new Charmander("");
		Sandshrew  sandshrew = new Sandshrew("");
		Caterpie caterpie = new Caterpie("");
		Diglett diglett = new Diglett ("");
		Eternatus eternatus = new Eternatus ("");
		Abra abra = new Abra ("");
		Squirtle squirtle = new Squirtle ("");
		
		List<Pokemon> pokemons =List.of(charmander,sandshrew,caterpie);
		
		List<Pokemon> inimigos = List.of(sandshrew,diglett,eternatus,abra,squirtle,charmander,caterpie);
		
		System.out.print("Digite o seu nome:");
		nome = leia.nextLine();
		
		do {
			System.out.println("Está "+nome+" preparado para a sua batalha? \n Para começar, escolha o seu Pokemon \n 1- Charmander \n 2- Sandshrew \n 3- Caterpie");
			System.out.print("Escolhe uma opção:");
			opcao =leia.nextInt();
			
			 if(opcao!=1 && opcao!=2 && opcao!=3)
				   System.out.println("\nOpção inválida!\n");
		} while(opcao!=1 && opcao!=2 && opcao!=3 );
		
		List<Pokemon> jogadores = List.of(pokemons.get(opcao-1), inimigos.get(rand(0,6)));
		
        do {
		System.out.println("\n"+nome +", desejar visualizar as informações do Pokemon ou batalhar? "
				+ "\n (1) para ver \n (2) para duelar \n (3) sair do jogo ");
		System.out.print("Escolhe uma opção:");
		opcao = leia.nextInt();
	
		   switch(opcao)
	 	   {
		    case 1:
		    	jogadores.get(1).imprimirInfo();
			break;
		    case 2:
		    	
		    	//batalha
				do {
					partida++;
					
					if(partida%2 == 0) {
					   do{
					  
						 System.out.print("\nO jogador: "+nome+"\n ( 1 ) Ataca \n ( 2 ) Fugi ");
						 System.out.print("\nEscolhe uma opção:");
						 opcao = leia.nextInt();
						 System.out.print("\n");
						 
						 if(opcao!=1 && opcao!=2)
						   System.out.println("\nOpção inválida!\n");
						 
					   }while(opcao!=1 && opcao!=2);
					}
					
					if( opcao == 1) {
						jogadores.get(partida%2).recebeDano(rand(1,100));
						System.out.println( jogadores.get(partida%2).getNome() +" : "+ jogadores.get(partida%2).getVida()+"Hp ");
					}
					
				}while( (jogadores.get(partida%2).getVida() > 0 ) &&  (opcao==1) ); 
				
				
				if(jogadores.get(partida%2).getVida() == 0 ) {
					if(partida%2 == 0) 
						System.out.println("O seu pokémon '"+jogadores.get(partida%2).getNome()+"' morreu!");
					else
						System.out.println("O pokémon inimigo '"+jogadores.get(partida%2).getNome()+"' morreu!");
				}
		    	
			break;
		 }
		 
	    } while( opcao!=3 && !(jogadores.get(partida%2).getVida() == 0 ) );
		
	}
}
