package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe
 * Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 
 * 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em
 * seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 * 
 *  	Na construção do Algoritmo, utilize os seguintes conteúdos:
 *		Entrada e Saída de dados
 *		Collection Set
 *		Classe Iterator
 *
 */

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		System.out.println("Digite 10 valores inteiros não repetidos:");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Insira o "+(i+1)+"ª valor do set: ");
			int numeros = scanner.nextInt();
			meuSet.add(numeros);
		}
		
		Iterator<Integer> iterator = meuSet.iterator();
		
		System.out.println("\nElementos na Collection Set:");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
	}

}
