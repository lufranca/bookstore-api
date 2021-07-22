package com.luciano.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciano.bookstore.domain.Categoria;
import com.luciano.bookstore.domain.Livro;
import com.luciano.bookstore.repositories.CategoriaRepository;
import com.luciano.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Designer", "UI e UX");
		Categoria cat3 = new Categoria(null, "Tecnologia", "Empresas 4.0");

		Livro l1 = new Livro(null, "JAVA 8", "Fulano", "Lorem Ipsumn", cat1);
		Livro l2 = new Livro(null, "PHP 7", "Siclano", "PHP moderno", cat1);
		Livro l3 = new Livro(null, "CSS e FLEX-BOX", "UIeUX designer", "Lorem Ipsumn", cat2);
		Livro l4 = new Livro(null, "Automoçao", "Beltrano", "Inovacao das empresas", cat3);
		Livro l5 = new Livro(null, "IOT", "Fulano", "Internet das coisas", cat3);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3));
		cat3.getLivros().addAll(Arrays.asList(l4, l5));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

	}
}
