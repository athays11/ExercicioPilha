public class PilhaDiscos {
	private int quantidade;
	private Disco topo;
	
	public PilhaDiscos() {
        this.quantidade = 0;
        this.topo = null;
    }

	public boolean estaVazia() {
        return (this.topo == null);
    }
	
	public void mostraPilha() {
		if(!estaVazia()) {
			Disco mostra = this.topo;
			for(int i = 0; i < this.quantidade; i++) {
				System.out.println("\n --- \n| " + mostra.getTamanho() +" |\n --- ");
				mostra = mostra.getProximo();
	        }
		}else {
			System.out.println("Está vazia");
		}
	}
	
	public void enchePilha(int qtd) {
		this.quantidade = qtd;
		for(int i = 0; i < this.quantidade; i++) {
        	Disco aux = this.topo;
            this.topo = new Disco(i+1);
            this.topo.setProximo(aux);
        }
	}
	
	public void Empilhar(int tamanho) {
        Disco aux = this.topo;
        this.topo = new Disco(tamanho);
        this.topo.setProximo(aux);
        this.quantidade++;
    }

    public int Desempilhar() throws Exception {
    	int valor = 0;
        if (!this.estaVazia()) {
            valor = this.topo.getTamanho();
            this.topo = this.topo.getProximo();
            this.quantidade--;
            return valor;
        } else {
            throw new Exception("A pilha está vazia");
        }
    }
    
    public int[] retornaValores() {
    	int resultado[] = new int[this.quantidade];
    	if(!estaVazia()) {
    		Disco mostra = this.topo;
    		for(int i = 0; i < this.quantidade; i++) {
    			resultado[i] = mostra.getTamanho();
    			mostra = mostra.getProximo();
    	       }
    		return resultado;
    	}else {
    		System.out.println("Vazio");
    		return null;
    	}
    	
    	
    }
	
	
	//getters and setters
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Disco getTopo() {
		return topo;
	}
	public void setTopo(Disco topo) {
		this.topo = topo;
	}
}
