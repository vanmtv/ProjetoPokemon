package ProjetoPokemon;

import java.util.ArrayList;

public class Charmander extends Fogo{
	int nivel;
	String dono;
	String[] nome = new String[3];
	nome[0]="Charmander";
	nome[1]="Charmeleon";
	nome[2]="Charizard";
	posicao=0;


	public Charmander (int nivel, String dono, String nome, String vida, Double peso, Double altura, Double ataque, Double velocidade,Double defesa, Double xpMin, Double xpMax) {
		super();
		this.nivel=nivel;
		this.dono=dono;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public int recebeXp(int xp) {
		if(xp==xpMax) {
			trocarNivel(int nivel);
		}else {
			xp+=1;
		}
		return xp;
	}
	
	public int trocarNivel(Int nivel) {
		if(nivel=nivelMax) {
			return proximoNome(int posicao, String nome);
		}else {
			nivel+=1;
		}
	}
	
	//trocando o nome na posição do array
	public String proximoNome(int posicao, String nome) {
	for (int i = 0; i < this.nome.length; i++) {
		
			this.posicao += 1;
		
	}
	this.nome[posicao] = nome;
	return nome;
}
	
	
}
