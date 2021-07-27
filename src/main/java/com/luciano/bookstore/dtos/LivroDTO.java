package com.luciano.bookstore.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.luciano.bookstore.domain.Livro;

@SuppressWarnings("deprecation")
public class LivroDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo TITULO é obrigatorio!")
	@Length(min = 3, max = 50, message="O campo TITULO deve ter entre 3 e 50 caracteres!")
	private String titulo;

	public LivroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
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

}
