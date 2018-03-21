package br.com.fatec.atividade.exerc4;

import br.com.fatec.atividade.Lista;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 4 � Programar na classe Lista o m�todo interrupt(nro:int). Ele
	 * interrompe a lista no elemento que tiver o conte�do passado como
	 * par�metro, mas lembrese que a lista ainda dever� ser circular. Exemplo de
	 * teste do Exerc�cio 4.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista();
		a.interrupt(5);
		a.add(5);
		a.interrupt(5);
		a.add(9);
		a.add(11);
		a.add(4);
		a.add(2);
		a.add(3);
		a.add(8);
		a.add(1);
		a.print();
		a.interrupt(4);
		a.print();
	}

}
