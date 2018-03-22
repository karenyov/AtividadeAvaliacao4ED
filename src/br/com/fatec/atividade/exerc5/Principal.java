package br.com.fatec.atividade.exerc5;

import br.com.fatec.atividade.Lista;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {
	/**
	 * Exerc�cio 5 � Programar na classe Lista o m�todo split(nro:int):Lista.
	 * Ele quebra uma lista em duas no elemento que tiver o conte�do passado
	 * como par�metro. Exemplo de teste do Exerc�cio 5
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista();
		Lista b = a.split(5);
		b.print();
		a.add(5);
		b = b.split(5);
		b.print();
		a.add(9);
		a.add(11);
		a.add(4);
		a.add(2);
		a.add(3);
		a.add(8);
		a.add(1);
		System.out.print("\nLista: ");
		a.print();
		b = a.split(4);		
		a.print();
		b.print();
	}
}
