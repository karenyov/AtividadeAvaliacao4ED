package br.com.fatec.atividade.exerc3;

import br.com.fatec.atividade.Lista;
import br.com.fatec.atividade.No;

/**
 * @author Karen 19 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 3 � Programar na classe Lista um m�todo de nome remove():No que
	 * retira e retorna o n� que est� no in�cio da lista. Exemplo de teste do
	 * Exerc�cio 3.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No no;
		Lista a = new Lista();
		no = a.remove();
		System.out.println("Remover: " + no);
		a.add(5);
		no = a.remove();
		System.out.print("Remover: " + no.conteudo);
		a.add(2);
		a.add(8);
		a.add(6);
		a.add(7);
		a.print();
		no = a.remove();
		System.out.print("Remover: " + no.conteudo);
		a.print();

	}

}
