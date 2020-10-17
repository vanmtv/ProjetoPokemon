package ProjetoPokemon;

public class Fogo extends Pokemon{
	String tipo;

	public Fogo (String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public  int validarTipo(String tipo) {
		if (tipo=="fogo") {
			return 1;
		}else {
			return 0;
		}
	}

}
