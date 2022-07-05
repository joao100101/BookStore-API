package me.joao.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.joao.bookstore.domain.Livro;
import me.joao.bookstore.repositories.LivroRepository;
import me.joao.bookstore.services.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository rep;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = rep.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado, ID: " + id + ", Tipo: " + Livro.class.getName()));
	}
}
