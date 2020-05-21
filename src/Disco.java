public class Disco {
	private int tamanho;
	private Disco proximo;

	public Disco() {
		
    }

    public Disco(int tamanho) {
        this.tamanho = tamanho;
        this.proximo = null;
    }

	
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Disco getProximo() {
		return proximo;
	}

	public void setProximo(Disco proximo) {
		this.proximo = proximo;
	}
}
