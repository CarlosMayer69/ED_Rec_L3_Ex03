/*
 * 3. Crie uma fun��o recursiva que exiba o 
 * resultado da invers�o de uma cadeia de caracteres
 * (Ex.: entrada = teste ; sa�da = etset):
 * 
 * Deve se utilizar a fun��o SUBSTRING do Java.
 * 
 * O c�digo deve trazer como coment�rios:
 * 
 * � A condi��o de parada;
 * � Como escrever a fun��o para o termo 'n' em fun��o do termo anterior.
 * 
 */

package controller;

public class InverteStringRecController {

	public InverteStringRecController() {
		
		super();
	}
	
	public String inverterString(String s) {
		  
		  // Condi��o de parada
		  if (s.length() == 0) {
		    return s;
		  }
		  // Fun��o para o termo n em fun��o do termo anterior
		  else {
		    return inverterString(s.substring(1)) + s.charAt(0);
		  }
	}
}