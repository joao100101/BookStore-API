package me.joao.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Livro {
	private Integer id;
	private String titulo;
	private String autor;
	private String texto;

	private Categoria categoria;

	public Livro() {
		super();
	}



}
