public class Torre {
	private char torre;
	private PilhaDiscos discos;
	private Torre proximo;
	
	
	public Torre() {
		this.discos = null;
		this.torre = ' ';
		this.proximo = null;
		this.discos = new PilhaDiscos();
	}
	
	public Torre(char torre) {
		this.torre = torre;
		this.proximo = null;
		this.discos = new PilhaDiscos();
	}
	
	
	
	public void addDiscos(int qtd) {
		this.discos.enchePilha(qtd);
//		System.out.println("tem " + qtd);
	}
	
	
	
	//getters and setters

	public char getTorre() {
		return torre;
	}

	public void setTorre(char torre) {
		this.torre = torre;
	}

	public Torre getProximo() {
		return proximo;
	}

	public void setProximo(Torre proximo) {
		this.proximo = proximo;
	}
	
	public PilhaDiscos getDiscos() {
		return discos;
	}

	public void setDiscos(PilhaDiscos discos) {
		this.discos = discos;
	}
}
