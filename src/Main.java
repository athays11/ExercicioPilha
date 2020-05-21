import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		FileiraTorres torre = new FileiraTorres();
		torre.addTorre('a');
		torre.addTorre('b');
		torre.addTorre('c');
		torre.Inicia();
		char a = ' ';
		char b = ' ';
		
		//Mostra torres no inicio
		System.out.println("\nTransfira os discos entre as \ntorres e devolva-os para a \ntorre A de forma que fiquem \n"
				+ "organizados do menor para o \nmaior. \nLembre-se, você tem " + torre.getTentativas() + " chances \npara movimentar os discos");
		System.out.println("\n______________________________\n");
		System.out.println("Torre A:");
		torre.retornaTorre('a').getDiscos().mostraPilha();
		System.out.println("\n______________________________\n");
		System.out.println("\nTorre B:");
		torre.retornaTorre('b').getDiscos().mostraPilha();
		System.out.println("\n______________________________\n");
		System.out.println("\nTorre C:");
		torre.retornaTorre('c').getDiscos().mostraPilha();
		System.out.println("\n______________________________\n");
		
		while(torre.getTentativas() > 0) {
		
			try {
				System.out.println("\nTirar da torre:");
				char tira = entrada.next().charAt(0);
					if(torre.retornaTorre(tira) != null) {
						a = tira;
					}
				System.out.println("Transferir para a torre:");
				char poe = entrada.next().charAt(0);
					if(torre.retornaTorre(poe) != null) {
						b = poe;
					}
					
					torre.Movimento(torre.retornaTorre(a), torre.retornaTorre(b));
					System.out.println("\n______________________________\n");
					System.out.println("Torre A:");
					torre.retornaTorre('a').getDiscos().mostraPilha();
					System.out.println("\n______________________________\n");
					System.out.println("\nTorre B:");
					torre.retornaTorre('b').getDiscos().mostraPilha();
					System.out.println("\n______________________________\n");
					System.out.println("\nTorre C:");
					torre.retornaTorre('c').getDiscos().mostraPilha();
					System.out.println("\n______________________________\n");
					if(torre.getTentativas() != 0) {
						System.out.println("\ntentativas: " + torre.getTentativas());

					}

			}catch (Exception e) {
				System.out.println("Erro: " + e + "\nPor favor repita a jogada");
			}
		
		}
	
		
	}
}
