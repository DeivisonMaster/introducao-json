package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivoDisco {
	
	public static void leArquivo(String arquivo) throws IOException {
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String dados = br.readLine();
		while(dados != null) {
			System.out.println(dados);
			dados = br.readLine();
		}
		
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		leArquivo("C:\\Users\\deivison\\Desktop\\dados-filmes.txt");
	}
}
