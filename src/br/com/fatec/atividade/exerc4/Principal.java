package br.com.fatec.atividade.exerc4;

import br.com.fatec.atividade.Lista;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 4 – Programar na classe Lista o método interrupt(nro:int). Ele
	 * interrompe a lista no elemento que tiver o conteúdo passado como
	 * parâmetro, mas lembrese que a lista ainda deverá ser circular. Exemplo de
	 * teste do Exercício 4.
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
