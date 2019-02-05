package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;

public class LendoJson {
	public static void main(String[] args) {
		/**
		 * @author deivison
		 * @description obtem um arquivo JSON de algum lugar
		 * 
		 */
		String arquivoJson = "{\"titulo\":\"JSON x XML\",\"ano\":2012,\"generos\":[\"Aventura\", \"Ação\"]}";

		Gson gson = new Gson();

		/**
		 * @author deivison
		 * @description converte/tranfere os dados do arquivo JSON para um objeto
		 * 
		 */
		Filme filme = gson.fromJson(arquivoJson, Filme.class);

		System.out.println(filme.getTitulo());
		System.out.println(filme.getAno());
		System.out.println(filme.getGeneros().toString());
	}
}
