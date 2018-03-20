package br.com.fatec.atividade;

/**
 * @author Karen 19 de mar de 2018
 */
public class Lista {
	No inicio;
	
	public void split(int nro) {
		
		
	}

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
					return;
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

	public No remove() {
		if (inicio != null) {

			No n = inicio.proximo;
            n.proximo = n.proximo;
            if (n == inicio) { // removal of head
            	inicio = n;
            }
			 
			
			return inicio;
		}
		return null;

	}

	public void interrupt() {

	}
}
