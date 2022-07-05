package me.joao.bookstore.dtos;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.joao.bookstore.domain.Categoria;

@Data
@NoArgsConstructor
public class CategoriaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String descricao;

	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
}
