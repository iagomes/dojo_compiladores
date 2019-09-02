/* DOJO - Compiladores
 * Aluno:
 * Iago Gomes Macedo - 081170024
 */

package ftt.ec;

import java.io.*;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(System.getProperty("user.dir")+"\\compiladores.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  String full = "";
		  
		  
		  while ((st = br.readLine()) != null) {
		  	full += ("\n"+st.trim());
		  	
		  }

		full = Pattern.compile("\\/\\*[\\s\\S]*?\\*\\/|([^:]|^)\\/\\/.*$", Pattern.MULTILINE).matcher(full).replaceAll("");

		full = full.replace('\n',' ').trim();

		FileWriter arquivo = new FileWriter(System.getProperty("user.dir")+"\\resultado.txt");
		PrintWriter salvaResultado = new PrintWriter(arquivo);
		salvaResultado.print(full);

		  System.out.println(full);
	}
}
