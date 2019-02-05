package model;

import com.google.gson.Gson;

public class GravandoJson {
	public static void main(String[] args) {
		Filme filme = new Filme();
		
		filme.setTitulo("JSON x XML");
		filme.setAno(2012);
		filme.getGeneros().add("Aventura");
		filme.getGeneros().add("A��o");
		filme.getGeneros().add("Fic��o");
		
		Gson gson = new Gson();
		
		/**
		 * @author deivison
		 * @description converte um objeto populado para um formato JSON
		 * */
		String json = gson.toJson(filme);
		System.out.println(json);
		
	}
}
