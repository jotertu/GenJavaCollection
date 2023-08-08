package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da 
 * Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5
 * cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se
 * pede:
 * 		Mostre na tela todas as cores que foram adicionadas.
 * 		Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Laços de Repetição
 * 		Collection ArrayList
 * 
 */
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		List<String> minhaLista = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite a "+(i+1)+"ª cor que deseja inserir: ");
			String cores = scanner.nextLine();
			minhaLista.add(cores);
		}
		
		for(String cores:minhaLista) {
		System.out.println("Minha lista: "+cores);
		}
		
		Collections.sort(minhaLista);
		System.out.println("Cores em ordem crescente: "+minhaLista);
			
	}

}
