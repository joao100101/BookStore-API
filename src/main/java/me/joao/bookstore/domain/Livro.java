package me.joao.bookstore.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@EnableAutoConfiguration
@Data
@AllArgsConstructor
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message = "Campo TITULO é requerido.")
	@Length(min = 3, max = 50, message = "O campo TITULO deve ter entre 3 e 50 caracteres.")
	private String titulo;
	private String urlCapa;
	@NotEmpty(message = "Campo AUTOR é requerido.")
	@Length(min = 3, max = 50, message = "O campo AUTOR deve ter entre 3 e 50 caracteres.")
	private String autor;
	@NotEmpty(message = "Campo TEXTO é requerido.")
	@Length(min = 10, message = "O campo TEXTO deve ter no mínimo 10 caracteres.")
	@Column(columnDefinition="LONGTEXT")
	private String texto;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	public Livro() {
		super();
	}

}
