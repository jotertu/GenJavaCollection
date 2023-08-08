package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner scanner = new Scanner(System.in);
			
		Queue<String> fila = new LinkedList<String>();
		
		do {			
			System.out.println("******************************************");
			System.out.println("                                          ");
			System.out.println("   1 - Adicionar cliente a fila           ");
			System.out.println("   2 - Listar todos os clientes da fila   ");
			System.out.println("   3 - Retirar cliente da fila            ");
			System.out.println("   0 - Sair                               ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.print("\nDigite a sua opção: ");
			op = scanner.nextInt();
			
			switch (op) {
			case 1:
				scanner.nextLine();
				System.out.print("\nDigite o nome da pessoa para adicionar a fila: ");
				String pessoa = scanner.nextLine();
				fila.add(pessoa);
				break;
			case 2:
				scanner.nextLine();
				System.out.println("\nAs pessoas que estão na fila são: "+fila);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("\nDigite o nome da pessoa para remover da fila: ");
				String pessoar = scanner.nextLine();
				if(fila.contains(pessoar)) {
					fila.remove(pessoar);
				} else {
					System.out.println("\nA pessoa não esta na fila!!!");
				}
			case 0:
				System.out.println("\nMuito obrigado em utilizar o nosso programa, volte sempre!!!");
				break;
				default:
					System.out.println("\n Opção inválida, por favor digite novamente sua opção!");
			}		
		}while(op != 0);
		
	}

}
