package pokemonAr;

public class caterpie extends Pokemon{
	
		private String acao;
		public cachorro() 
		{
			
		}
		public String getAcao() {
			return acao;
		}
		public void setAcao(String acao) {
			this.acao = acao;
		}
		
		
		public String imprimir()
		{
			return "Nome: "+super.getNome()+"\nIdade: "+super.getIdade()
			+"\nEle emito o seguinte som: "+super.getEmitirSom()
			+"\nEle se movimenta: "+this.getAcao();
		}

}
