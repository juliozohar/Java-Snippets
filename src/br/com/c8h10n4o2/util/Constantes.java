package br.com.c8h10n4o2.util;

import java.io.Serializable;

public class Constantes implements Serializable{
	
	/**
	 * Número serial da classe. 
	 */
	private static final long serialVersionUID = -2792411224317854987L;

	/**
	 * Versãoo atual da classe. 
	 */
	private final String versao = "0.0.1";
	
	/*
	 * *************************************************************************
	 * Representação de dados no sistema
	 * *************************************************************************
	 */
	
	/**
	 *Define representação de dados em base64. 
	 */
	public static final int ICD_BASE64 = 0;
	 
	/**
	 *Define a representação dos dados binária. 
	 */
	public static final int ICD_BINARIO = 1;
	 
	/*
	 * *************************************************************************
	 * Constatantes de algoritmos de hash
	 * *************************************************************************
	 */
	
	/**
	 *Define o algoritmo de hash como SHA1. 
	 */
	public static final int HASH_SHA1 = 1;
	 
	/**
	 *Define o algoritmo de hash como SHA256. 
	 */
	public static final int HASH_SHA256 = 2;
	
	/**
	 * Define o algoritmo de hash SHA-512
	 */
	public static final int HASH_SHA512 = 3; 
	 
	/**
	 *Define o algoritmo de hash como MD5. 
	 */
	public static final int HASH_MD5 = 4;
	
	/**
	 * Define o algoritmo de hash MD2. 
	 */
	public static final int HASH_MD2 = 5;
	
	/*
	 * ************************************************************************* 
	 * Parsers
	 * ************************************************************************* 
	 */
	/**
	 * Define um parser de certificados digitais.  
	 */
	public static final int PARSER_CERTIFICADO = 1;
	
	/**
	 * Define um parser de Lista de certificados revogados. 
	 */
	public static final int PARSER_LCR = 2;
	
	/**
	 * Define um parser de envelope PKCS#7.  
	 */
	public static final int PARSER_PKCS = 3;
	
	/**
	 * Define um parser de envelope XML. 
	 */
	public static final int PARSER_XML = 4; 
	
	/*
	 * *************************************************************************
	 * Natureza dos certificados digitais. 
	 * *************************************************************************
	 */

	/**
	 * Certificado de pessoa física. 
	 */
	public static final int NAT_PF   = 1;
	
	/**
	 * Certificado de pessoa jurídica. 
	 */
	public static final int NAT_PJ   = 2;
	
	/**
	 * Certificado de Autoridade Certificadora. 
	 */
	public static final int NAT_AC   = 3; 
	
	/**
	 * Certificado de servidor. 
	 */
	public static final int NAT_SERV = 4; 
	 
	
	/*
	 * *************************************************************************
	 * Finalidades de uso dos certificados digitais.
	 * ************************************************************************* 
	 */
	
	/**
	 * Certificado A1. 
	 */
	public static final int FIN_A1 = 1;
	/**
	 * Certificado A2. 
	 */
	public static final int FIN_A2 = 2;
	
	/**
	 * Certificado A3. 
	 */
	public static final int FIN_A3 = 3;
	
	/**
	 * Certificado A4. 
	 */
	public static final int FIN_A4 = 4;
	
	/**
	 * Certificado S1. 
	 */
	public static final int FIN_S1 = 5;
	
	/**
	 * Certificado S2. 
	 */
	public static final int FIN_S2 = 6;
	
	/**
	 * Certificado S3. 
	 */
	public static final int FIN_S3 = 7;
	
	/**
	 * Certificado S4. 
	 */
	public static final int FIN_S4 = 8;
	
	
	/**
	 *  
	 */
	public static final int CK1	 = 1; 
	
	/**
	 * Retorna a representacao legivel do estado da classe. 
	 */
	public String toString(){
		return this.getClass() + " v." + this.getVersao() + 
			"\n Número Serial: " + serialVersionUID;
	}
	
	public String getVersao(){
		return this.versao;
	}
}
