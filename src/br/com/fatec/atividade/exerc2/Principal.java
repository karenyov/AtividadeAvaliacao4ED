package br.com.fatec.atividade.exerc2;

import br.com.fatec.atividade.Lista;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 2 � Programar na classe Lista um m�todo de nome
	 * sum(lista:Lista) que recebe outra lista e adiciona os elementos dela na
	 * lista atual mantendo a regra do Exerc�cio 1, isto �, a lista final
	 * precisar estar ordenada
	 * 
	 * Observa��o: utilize o m�todo add(nro:int) programado no Exerc�cio 1 para
	 * adicionar os novos elementos mantendo a ordem.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista a = new Lista();
		a.add(5);
		a.add(2);
		a.add(8);
		a.add(6);
		a.add(7);
		a.print();
		Lista b = new Lista();
		b.add(4);
		b.add(3);
		b.add(11);
		b.add(9);
		b.print();
		a.sum(b);
		a.print();
		Lista c = new Lista();
		a.sum(c);
		a.print();
		c.add(10);
		a.sum(c);
		a.print();

	}

}
