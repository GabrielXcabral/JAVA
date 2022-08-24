package ex;

public class Retangulo {
	
	public int id;
	public double largura;
	public double comprimento;
	
	/*public Retangulo (int id, double largura, double comprimento) { //contrutor
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}*/
	
	public Retangulo () { }
	
	public Retangulo(int id, double largura, double comprimento) {
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public void enquadrar() {
		double media = (largura + comprimento) / 2;
		largura = media;
		comprimento = media;
	}

	public double calcularArea() {
		return largura * comprimento;
	}
	
	public boolean ehQuadrado(){
		if (largura == comprimento)
			return true;
		else
			return false;
		
	}

	public String toString() {
		return "Retangulo [\n id=" + id +
						 "\n largura = " + largura + 
						 "\n comprimento = " + comprimento + "]";
	}
	
	
	
}