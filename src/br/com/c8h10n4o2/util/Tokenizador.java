package br.com.c8h10n4o2.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Classe utilizada para separar elementos de uma lista separada por caracteres fixos, 
 * e retornar uma instancia de uma lista de strings. 
 * @author Julio Cesar Torres - juliozohar
 *
 */
public class Tokenizador implements Serializable{
	
	/**
	 * Numero serial da classe. 
	 */
	private static final long serialVersionUID = 8545975315807006944L;

	/**
	 * Versao atual da classe. 
	 */
	private final String versao = "0.0.1";
	
	/**
	 * Construtor privado. Nao eh permitido criar instancias desta classe. 
	 */
	private Tokenizador(){}	
	
	/**
	 * Tokeniza a string linhaDados em itens da lista de strings retornada.  
	 * @param linhaDados String original, dividida pelo 'separador'. 
	 * @param separador Caractere utilizado para separar os itens de uma lista dentro da string
	 * @return Lista de strings
	 */
	public static List<String> tokeniza(String linhaDados, Character separador){
		StringTokenizer tokenizador = new StringTokenizer(linhaDados, separador.toString()); 
		List<String> itens = new ArrayList<String>(); 
		while (tokenizador.hasMoreElements()) {
			String item = (String) tokenizador.nextElement();
			itens.add(item); 
		}
        return itens;
	}

	/**
	 * Exibe os itens de uma lista de strings.
	 * @param itens Lista de strings
	 */
	public static void exibeItens(List<String>itens){
    	for (Iterator<String> iterator = itens.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println("Item : " + item.trim());
		}
    }
	
	/**
	 * Retorna representacao legivel do estado da classe.
	 */
	public String toString(){
		return this.getClass() + " v." + this.getVersao() + "\n " +
				"Numero serial: " + serialVersionUID;
	}

	public String getVersao() {
		return versao;
	}
}
