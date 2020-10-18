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
		
		/* 
		int escolha;
        do {
		System.out.println(nome +"Desejar visualizar as informações do Pokemon ou batalhar? "
				+ "1 para ver 2 para duelar");
		escolha = leia.nextInt();
	
		   switch(escolha)
	 	   {
		    case 1:
			//Dados do Poke;
			break;
		    case 2:
			//batalha;
			break;
		 }
	    } while(opcao!=1 && opcao!=2 && opcao!=3 );
		*/
		
		//batalha
		do {
			
			/* usuario escolhe entre ataque ou fugi
			if(partida%2 == 0) {
			   do{
			  
				 System.out.print("O jogador: "+nome+" (1)ataca \n (2)fugi");
				 System.out.print("Escolhe uma opção:");
				 opcao = leia.nextInt();
				 
				 if(opcao!=1 && opcao!=2)
				   System.out.println("\nOpção inválida!\n");
				 
			   }while(opcao!=1 && opcao!=2);
			}
			else{
				
			}
			*/
			partida++;
			jogadores.get(partida%2).recebeDano(10);
			System.out.println(jogadores.get(partida%2).getVida());
			
			
		}while( (jogadores.get(partida%2).getVida() > 0 ));
		
		

		//System.out.println(pokemons.get(opcao-1).getNome());
		//System.out.println(inimigos.get(rand(0,6)).getNome());
				
		
		
	}
}
