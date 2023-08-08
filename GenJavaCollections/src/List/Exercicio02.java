package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da 
 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá 
 * solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja 
 * encontrado no ArrayList, exiba na tela a posição deste número na Collection. Caso o 
 * número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não 
 * foi encontrado!
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços Condicionais
 * 		Laços de Repetição
 * 		Collection ArrayList
 * 
 */

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicao = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);// Adiciona um elemento na minha ArrayList
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(9);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(6);		
		
		System.out.print("Digite o número que deseja buscar: ");
		int numPesquisado = scanner.nextInt();
		
		for (int i = 0; i < minhaLista.size(); i++) {
			if(minhaLista.get(i) == numPesquisado) {
				posicao = i;
				break;
			}
			
		}
		
		if (posicao != -1) {
			System.out.print("O número está localizado na posição: "+posicao);
		} else {
			System.out.print("O número "+numPesquisado+" não foi encontrado!");
		}
		
	}

}
