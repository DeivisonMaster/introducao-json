package model;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;

public class EscreveArquivoDisco {
	
	public static void escreveNoArquivoNoFormatoJson(String json) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\deivison\\Desktop\\dados-filmes-populado.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write(json);
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		Filme filme = new Filme();

		filme.setTitulo("JSON x XML");
		filme.setAno(2012);
		filme.getGeneros().add("Aventura");
		filme.getGeneros().add("Ação");
		filme.getGeneros().add("Ficção");
		filme.getGeneros().add("Suspense");

		Gson gson = new Gson();
		String json = gson.toJson(filme);
		
		escreveNoArquivoNoFormatoJson(json);
		
		//System.out.println(json);
		
	}
}
