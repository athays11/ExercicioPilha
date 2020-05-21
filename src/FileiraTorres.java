public class FileiraTorres {
	private Torre cabeca;
	private int tentativas;
		
	
	public FileiraTorres() {
		this.cabeca = null;
		this.tentativas = 0;
		
	}
	
	public void addTorre(char torre) {
		Torre nova = new Torre(torre);
		if(this.cabeca == null) {
			this.cabeca = nova;
			this.tentativas = 3;
		}else {
			Torre ultima = cabeca;
			
			while(ultima.getProximo() != null) {
				ultima = ultima.getProximo();
			}
			ultima.setProximo(nova);
			this.tentativas += 2;
		}
	}
	
	public void Inicia() {
		this.cabeca.addDiscos(this.Conta());
	}
	
	public void Mostra() {
		if(this.cabeca != null) {
			Torre anterior = null;
			Torre proximo = this.cabeca;
			System.out.println(proximo.getTorre());
			while(proximo.getProximo() != null) {
				anterior = proximo;
				proximo = proximo.getProximo();
				System.out.println(proximo.getTorre());
			}
		}
		
	}
	
	public int Conta() {
		int qtd = 0;
		if(this.cabeca != null) {
			Torre proximo = this.cabeca;
			while(proximo != null) {
				proximo = proximo.getProximo();
				qtd++;
			}
		}
		return qtd;
	}
	
	public Torre retornaTorre(char nome) {
		Torre torre = this.cabeca;
		while(torre.getTorre() != nome) {
			torre = torre.getProximo();
		}
		return torre;
	}
	
	public void Movimento(Torre a, Torre b) {
			int tamanho = 0;
			if(a != b) {
				if(this.tentativas > 0) {
					try {
						tamanho = a.getDiscos().Desempilhar();
						if(tamanho != 0) {
							b.getDiscos().Empilhar(tamanho);
							this.tentativas--;
							if(this.tentativas == 0) {
								if(this.verificaTopo()) {
									System.out.println("\n\n\n>> Parabéns, você conseguiu!! <<");
								}else {
									System.out.println("\n\n\n>> Suas chances acabaram ;-; <<");
								}
							}
						}
					}catch (Exception e) {
						System.out.println(e);
					}
				}
			}else {
				System.out.println("\n\nVocê está jogando na mesma torre\n");
			}
	}
	
	public boolean verificaTopo() {
		int verificacao[] = this.cabeca.getDiscos().retornaValores();
		if(verificacao != null) {
			if(verificacao.length == this.Conta()) {
				for(int i = 0; i < this.Conta(); i++) {
					if((i+1) != verificacao[i]) {
						return false;
					}
				}
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
	public Torre getCabeca() {
		return cabeca;
	}

	public void setCabeca(Torre cabeca) {
		this.cabeca = cabeca;
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

}
