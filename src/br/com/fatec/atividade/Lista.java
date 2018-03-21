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
		if (lista.inicio != null) { // tem itens na lista
			No ultimo = lista.inicio; // No temporario para adicionar os itens
			do {
				this.add(ultimo.conteudo); // add o item
				ultimo = ultimo.proximo;
			} while (ultimo != lista.inicio);
		}
	}

	/**
	 * Remove o primeiro elemento da lista circular
	 * 
	 * @return
	 */
	public No remove() {
		if (inicio == null) // lista vazia
			return null;

		No temp = inicio; // no temporário para adicionar os itens

		/**
		 * esse No é apenas para armazenar/retornar o No que será removido, pois
		 * ao adicionar um novo No ele será removido
		 */
		No temp2 = inicio;

		/**
		 * caso o No tenha apenas uma posicao e essa seja igual ao inicio, não
		 * haverá mais lista e o inicio apontara para null
		 */
		if (temp.proximo == inicio) {
			inicio = null;
			return temp;
		}

		/**
		 * percorre e adiciona todos os itens apartir do segundo(afinal o
		 * primeiro será removido rsrs :))
		 */

		while (temp.proximo != inicio) {
			temp = temp.proximo;
		}
		temp.proximo = inicio.proximo;
		inicio = temp.proximo;

		return temp2; // retorna o No que foi removido
	}

	public Lista split(int nro) {

		Lista lista = new Lista();
		No ultimo = inicio;

		if (inicio == null)
			return lista;

		do {
			lista.add(ultimo.conteudo);
			ultimo = ultimo.proximo;
		} while (ultimo != inicio);

		return lista;
	}

	/**
	 * Interrompe a lista no elemento que foi passado como parâmetro
	 * 
	 * @param nro
	 */
	public void interrupt(int nro) {
		if (inicio != null) {
			No no = inicio;

			/**
			 * percorre todo o No se(IF) o seu conteudo for diferente do
			 * enviado, pois os diferente até o numero do item enviado, serão
			 * armazenados na lista
			 */
			while (no.conteudo != nro) {
				no = no.proximo;
			}
			no.proximo = inicio;
			inicio = no.proximo;
		}
	}
}
