package me.joao.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class Categoria {
	@NonNull
	private Integer id;
	@NonNull
	private String nome;
	@NonNull
	private String descricao;

	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
	}
}
