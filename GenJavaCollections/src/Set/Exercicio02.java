package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe 
 * Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao
 * usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
 * exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja
 * encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços Condicionais
 * 		Laços de Repetição
 * 		Collection Set
 * 
 */

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			 meuSet.add(i * 10);
		}
		
		System.out.print("Insira o valor que deseja buscar: ");
		int numPesquisado = scanner.nextInt();
		
		if (meuSet.contains(numPesquisado)) {
            System.out.println("Número " + numPesquisado + " Encontrado!");
        } else {
            System.out.println("O número " + numPesquisado + " não foi encontrado!");
        }
		
	}

}
