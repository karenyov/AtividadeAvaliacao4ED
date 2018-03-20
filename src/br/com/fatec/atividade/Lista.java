package br.com.fatec.atividade;

/**
 * @author Karen 19 de mar de 2018
 */
public class Lista {
	No inicio;

	void add(int nro) {
		No no = new No();
		no.conteudo = nro;
		if (inicio == null) {
			no.proximo = no;
			inicio = no;
		} else {
			No ultimo = inicio;
			while (ultimo.proximo != inicio) {
				ultimo = ultimo.proximo;
			}
			no.proximo = ultimo.proximo;
			ultimo.proximo = no;
		}
	}

	void print() {
		if (inicio == null) {
			System.out.println("\nLista vazia");
		} else {
			System.out.println();
			No ultimo = inicio;
			do {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			} while (ultimo != inicio);
		}

	}
}
