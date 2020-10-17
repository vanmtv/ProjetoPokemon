package Rpg;

public class Pokemon {
	private String nome;
	private double vida;
	private double peso;
	private double altura;
	private double ataque;
	private double velocidade;
	private double defesa;
	private double xpMin;
	private double xpMax;
	
	public Pokemon(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax) {
		this.setNome(nome);
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
		this.setVelocidade(velocidade);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setXpMin(xpMin);
		this.setXpMax(xpMax);
	}
	
	public void imprimirInfo(){
		
		System.out.println(
				"nome:"+this.getNome()+", "
			    +"peso:"+this.getPeso()+"Kg, "
			    +"Altura:"+this.getAltura()+"M, "
			    +"ataque:"+this.getAtaque()+", "
			    +"defesa:"+this.getDefesa()+", "
			    +"Velocidade:"+this.getVelocidade()
		);

	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getXpMin() {
		return xpMin;
	}
	public void setXpMin(double xpMin) {
		this.xpMin = xpMin;
	}
	public double getXpMax() {
		return xpMax;
	}
	public void setXpMax(double xpMax) {
		this.xpMax = xpMax;
	}
	public double getAtaque() {
		return ataque;
	}
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
	public double getDefesa() {
		return defesa;
	}
	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}
}