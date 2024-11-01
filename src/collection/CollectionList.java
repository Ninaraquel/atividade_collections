package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// cria uma lista chamada cores
		List<String> cores = new ArrayList<>();

		System.out.println("Digite 5  cores:");
		for (int i = 0; i < 5; i++) {

			// lê a linha de entrada digitada pelo usuário
			// e armazena o valor em uma variável cor
			String cor = ler.nextLine();
			// Adiciona a cor lida na lista cores
			cores.add(cor);
		}

		System.out.println("Listar todas as cores:");

		// percorre cada item da lista cores
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);
		System.out.println("Ordenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		ler.close();
	}

}
