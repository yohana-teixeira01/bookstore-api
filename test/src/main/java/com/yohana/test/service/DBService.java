package com.wdyla.test.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wdyla.test.domain.Categoria;
import com.wdyla.test.domain.Livro;
import com.wdyla.test.repositories.CategoriaRepository;
import com.wdyla.test.repositories.LivroRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados(){
	Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
	Categoria cat2 = new Categoria(null, "Ficção", "Científica");
	Categoria cat3 = new Categoria(null, "Biografia", "Livro de Biografia");
	
	Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
	Livro l2 = new Livro(null, "Coraline", "Tim Burton", "Lorem ipsum", cat2);
	Livro l3 = new Livro(null, "Dom Casmurro", "Machado de Assis", "Lorem ipsum", cat2);
	Livro l4 = new Livro(null, "Bíblia", "Jesus Cristo", "Lorem ipsum", cat3);
	
	cat1.getLivros().addAll(Arrays.asList(l1));
	
	this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4));
}
}
