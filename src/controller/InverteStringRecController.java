/*
 * 3. Crie uma função recursiva que exiba o 
 * resultado da inversão de uma cadeia de caracteres
 * (Ex.: entrada = teste ; saída = etset):
 * 
 * Deve se utilizar a função SUBSTRING do Java.
 * 
 * O código deve trazer como comentários:
 * 
 * • A condição de parada;
 * • Como escrever a função para o termo 'n' em função do termo anterior.
 * 
 */

package controller;

public class InverteStringRecController {

	public InverteStringRecController() {
		
		super();
	}
	
	public String inverterString(String s) {
		  
		  // Condição de parada
		  if (s.length() == 0) {
		    return s;
		  }
		  // Função para o termo n em função do termo anterior
		  else {
		    return inverterString(s.substring(1)) + s.charAt(0);
		  }
	}
}