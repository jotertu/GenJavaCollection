package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		do {
			System.out.println("******************************************");
			System.out.println("                                          ");
			System.out.println("   1 - Adicionar livros a pilha           ");
			System.out.println("   2 - Listar todos os livros             ");
			System.out.println("   3 - Retirar Livro da pilha             ");
			System.out.println("   0 - Sair                               ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.print("\nDigite a sua opção: ");
			op = scanner.nextInt();	
			
			switch(op) {
			case 1:
				scanner.nextLine();
				System.out.print("\nInsira o nome do livro que deseja adicionar a pilha: ");
				String livro = scanner.nextLine();
				pilha.add(livro);
				break;
			case 2:
				scanner.nextLine();
				System.out.println("Os livros que estão na pilha são: "+pilha);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("\nDigite o nome do livro para remover da pilha: ");
				String livrosr = scanner.nextLine();
				if(pilha.contains(livrosr)) {
					pilha.remove(livrosr);
				} else {
					System.out.println("\nO livro não esta na fpilha!!!");
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
