package br.com.fatec.atividade.exerc5;

import br.com.fatec.atividade.Lista;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {
	/**
	 * Exercício 5 – Programar na classe Lista o método split(nro:int):Lista.
	 * Ele quebra uma lista em duas no elemento que tiver o conteúdo passado
	 * como parâmetro. Exemplo de teste do Exercício 5
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
	}
}
