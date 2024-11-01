package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Cria um conjunto de números inteiros
		Set<Integer> numerosInteiros = new HashSet<>();

		for (int i = 0; i < 10; i++) {

			// lê a linha de entrada digitada pelo usuário
			int numero = scanner.nextInt();

			// Adiciona o numero lido no conjunto numerosInteiros
			numerosInteiros.add(numero);
		}

		// Cria um Iterator para o conjunto de números inteiros
		Iterator<Integer> iterator = numerosInteiros.iterator();

		System.out.println("Listar dados do Set:");

		// Percorre o conjunto enquanto houver elementos
		while (iterator.hasNext()) {

			// Imprime o próximo elemento e avança o iterador
			System.out.println(iterator.next());
		}

		scanner.close();

	}

}
