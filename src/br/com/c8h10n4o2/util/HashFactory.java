package br.com.c8h10n4o2.util;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFactory implements Serializable{

	/**
	 * Numero serial da classe.  
	 */
	private static final long serialVersionUID = -1741650942896199577L;
	 
	
	/**
	 * Versao atual da classe. 
	 */
	private final String versao = "0.0.1"; 
	
	

	/**
	 * Recupera o hash de uma input binaria, dado o algoritmo de hashing.   
	 * @param dados Dados que serao resumidos. 
	 * @param algoritmo Algoritmo utilizado para a geracao do resumo
	 * @return Resumo criptografico dos dados, reprensentados em forma binaria. 
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] getHash(byte[] dados, int algoritmo)throws IOException, 
															 NoSuchAlgorithmException{
		return gerarHash(dados, algoritmo);
	}

	/**
	 * 
	 * @param caminhoArquivo
	 * @param algoritmo
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] getHash(String caminhoArquivo, int algoritmo) throws IOException, 
																		NoSuchAlgorithmException{
		return gerarHash(caminhoArquivo, algoritmo);
	}

	/**
	 * Gera hash de input String, com o algoritmo especificado. 
	 * @param dados
	 * @param algoritmo
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	private static byte[] gerarHash(String dados, int algoritmo) throws IOException, 
																NoSuchAlgorithmException{
		return gerarHash(dados.getBytes(), algoritmo);
	}
	
	/**
	 * Este metodo calcula o hash de uma input baseado no algoritmo a ser 
	 * utilizado. Algoritmos de hash ja implementados sao SHA1, SHA256, SHA512, MD2 e
	 * MD5. Implementacao futura: SHA384.  
	 * @param dados
	 * @param algoritmo
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static byte[] gerarHash(byte[] dados, int algoritmo) throws NoSuchAlgorithmException{
		
		String strAlg = ""; 
		System.out.println(algoritmo);
		/*
		 * Decide qual o tipo de algoritmo utilizar, baseado no par�metro recebido.  
		 */
		switch (algoritmo) {
		case Constantes.HASH_SHA1:
			strAlg = "SHA1";
			break;
			
		case Constantes.HASH_SHA256: 
			strAlg = "SHA-256";
			break; 
			
		case Constantes.HASH_SHA512: 
			strAlg = "SHA-512"; 
			break;
			
		case Constantes.HASH_MD5: 
			strAlg = "MD5";
			break; 
 
		case Constantes.HASH_MD2: 
			strAlg = "MD2";
			break;
		
		default:
			strAlg = "SHA-256";
			break;
		}
		/*
		 * Gera o hash.
		 */
		MessageDigest md = MessageDigest.getInstance(strAlg);
		md.update(dados);
		byte[] digest = md.digest();
		return digest;
	}
	
	/**
	 * Retorna representacao legivel do estado da classe.
	 */
	public String toString(){
		return this.getClass() + " v." + this.getVersao() + "\n " +
				"Numero serial: " + serialVersionUID;
	}
	
	private String getVersao(){
		return versao;		
	}
}
