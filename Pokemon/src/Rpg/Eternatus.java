package Rpg;

public class Eternatus extends PokemonVenenoso{
	private int nivel1;

	private String dono;
	private String [] nomes = {"Eternatus", "Eternamax Eternatus"};
	
	public Eternatus(String dono) 
	{
		super("Eternatus",
				140, // vida
				85, // ataque
				95,  // defesa
				130, // velocidade
				950, // peso
				20, // altura
				0, // xpMIn - escluir
				300
			);
		this.dono=dono;
		
	}
	public int getNivel1() {
		return nivel1;
	}
	public void setNivel1(int nivel) {
		this.nivel1 = nivel;
	}
	public String getTipo1() {
		return dono;
	}
	public void setTipo1(String dono) {
		this.dono = dono;
	}

	
	public void recebeXp(int xp){ //atualizar nivel
		this.setXpMin( this.getXpMin() + xp );
		
		if( this.getXpMin() >= this.getXpMax() && (this.nomes.length-1)>this.nivel1) {
			this.setXpMin(0);
			this.nivel1++;
			involuir(nivel1);
		}
	}
	
	public void involuir(int nivel) {
		this.setNome(nomes[nivel]);
		switch(nivel) {
		case 1:
			this.setVida(300);
			this.setAtaque(250);
			this.setDefesa(200);
			this.setAltura(100);
			this.setPeso(1000);
		break;
		}
	}
	
	public double ataque(){
		return this.rand(this.getAtaque(), this.getAtaque() );
	}
	
	public double defesa(){
		return this.rand(this.getDefesa(), this.getDefesa() );
	}
	
	public void recebeDano(double dano) {
		double newDano = this.defesa() - dano; 
		if( newDano>0 ) {
			this.setVida( this.getVida()  - ( newDano ) );
		}
		else {
			System.out.println("O pokémon "+this.getNome()+" não recebeu nenhum dano!");
		}
	}
	
	
	private double rand(double i, double j) {
		return  (i) - ( Math.random() * (j) );
	}
	public int getNivel() {
		return nivel1;
	}
	public void setNivel(int nivel) {
		this.nivel1 = nivel;
	}

}
