package model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String titulo;
	private String resumo;
	private int ano;
	private List<String> generos = new ArrayList<>();
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	
}
