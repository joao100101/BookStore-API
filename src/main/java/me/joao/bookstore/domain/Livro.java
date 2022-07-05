package me.joao.bookstore.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@EnableAutoConfiguration
@Data
@RequiredArgsConstructor
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NonNull
	private String titulo;
	@NonNull
	private String autor;
	@NonNull
	private String texto;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	@NonNull
	private Categoria categoria;

	public Livro() {
		super();
	}

}
