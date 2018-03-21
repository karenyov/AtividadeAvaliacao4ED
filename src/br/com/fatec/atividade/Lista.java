package br.com.fatec.atividade;

/**
 * @author Karen 19 de mar de 2018
 */
public class Lista {
	No inicio;

	public void add(int nro) {

		No no = new No();
		no.conteudo = nro;

		if (inicio == null) {
			no.proximo = no;
			inicio = no;
		} else {
			No current = inicio;
			do {
				if (((current.conteudo <= nro) && (current.proximo.conteudo >= nro)) || current.proximo == inicio) {
					no.proximo = current.proximo;
					current.proximo = no;
					if (nro < inicio.conteudo) {
						inicio = no;
					}
					break;
				}
				current = current.proximo;
			} while (current != inicio);
		}
	}

	public void print() {
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

	public void sum(Lista lista) {
		if (lista.inicio != null) {
			No ultimo = lista.inicio;
			do {
				this.add(ultimo.conteudo);
				ultimo = ultimo.proximo;
			} while (ultimo != lista.inicio);
		}
	}

	/**
	 * Remove o primeiro elemento da lista circular
	 * @return
	 */
	public No remove() {
		if (inicio == null)
			return null;
		
		No temp = inicio;
		No temp2 = inicio;
		
		if (temp.proximo == inicio) {
			inicio = null;
			return temp;
		}
		
		while (temp.proximo != inicio) {
			temp = temp.proximo;
		}
		temp.proximo = inicio.proximo;
		inicio = temp.proximo;

		return temp2;
	}
	
	public Lista split(int nro) {
	
		return new Lista();
	}

	/**
	 * Interrompe a lista no elemento que foi passado como parâmetro
	 * @param nro
	 */
	public void interrupt(int nro) {
		if (inicio != null) {
			No no = inicio;

			while (no.conteudo != nro) {
				no = no.proximo;
			}
			no.proximo = inicio;
			inicio = no.proximo;
		}
	}
}
