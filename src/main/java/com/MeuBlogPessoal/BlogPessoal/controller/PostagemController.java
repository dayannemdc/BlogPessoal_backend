package com.MeuBlogPessoal.BlogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MeuBlogPessoal.BlogPessoal.model.Postagem;
import com.MeuBlogPessoal.BlogPessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/api/vi/postagem")
public class PostagemController {

	private @Autowired PostagemRepository repositorio;
	
	@GetMapping
	public List<Postagem> pegarTodes(){
		return repositorio.findAll();
	}
}