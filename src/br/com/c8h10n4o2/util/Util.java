package br.com.c8h10n4o2.util;

import java.io.Serializable;

/**
 * Colecao de metodos utilitarios, para uso como auxiliares nas classes 
 * de negocio, de persistencia e de apresentacao. 
 * @author Julio Cesar Torres - juliozohar
 *
 */
public class Util implements Serializable{
	
	/**
	 * Numero serial da classe. 
	 */
	private static final long serialVersionUID = -8245053606760906414L;

	/**
	 * Versao atual da classe. 
	 */
	private final String versao = "0.0.1"; 
	
	/**
	 * Converte um conjunto de dados binarios para a sua representacao em
	 * codificacao hexadecimal.
	 * @param b conjunto de bytes original
	 * @return representacao hexadecimal do conjunto de bytes.
	 */
	public static String bytesParaHexa(byte[] b) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; ++i) {
			sb.append((Integer.toHexString((b[i] & 0xFF) | 0x100)).substring(1,
					3));
		}
		return sb.toString();
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
