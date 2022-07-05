package me.joao.bookstore.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.joao.bookstore.domain.Livro;
import me.joao.bookstore.dtos.LivroDTO;
import me.joao.bookstore.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroResource {
	@Autowired
	private LivroService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Integer id){
		Livro l = service.findById(id);
		return ResponseEntity.ok().body(l);
	}
	
	@GetMapping
	public ResponseEntity<List<LivroDTO>> findAll(@RequestParam(value = "categoria", defaultValue = "-1") Integer id_cat){
		List<Livro> list = service.findAll(id_cat);
		
		List<LivroDTO> dto = list.stream().map(obj -> new LivroDTO(obj)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(dto);
		//localhost:8081/livros?categoria=1
	}

	
}
