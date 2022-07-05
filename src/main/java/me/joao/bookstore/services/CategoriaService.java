package me.joao.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.joao.bookstore.domain.Categoria;
import me.joao.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository rep;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElse(null);
	}
}
