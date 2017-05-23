package com.teste.socialbooks.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.socialbooks.domain.Livro;
import com.teste.socialbooks.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosResources {

	@Autowired
	private LivrosRepository livrosRepository;

	@GetMapping
	public List<Livro> listar() {

		return livrosRepository.findAll();
	}

	@PostMapping
	public void salvar(@RequestBody Livro livro) {
		livrosRepository.save(livro);

	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Livro livro, @PathVariable Long id){
		livro.setId(id);
		livrosRepository.save(livro);
	}

	@GetMapping("/{id}")
	public Livro buscar(@PathVariable("id") Long id) {
		return livrosRepository.findOne(id);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		livrosRepository.delete(id);
	}

}
