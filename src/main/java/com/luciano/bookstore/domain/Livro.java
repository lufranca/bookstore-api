package com.luciano.bookstore.domain;

import java.util.Objects;

public class Livro {

	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texto;

	private Categoria catergoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria catergoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.catergoria = catergoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCatergoria() {
		return catergoria;
	}

	public void setCatergoria(Categoria catergoria) {
		this.catergoria = catergoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
