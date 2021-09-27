package br.com.alura.livraria.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.livraria.dto.AutorDto;
import br.com.alura.livraria.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	public AutorService service;

	@PostMapping
	public void cadastrar(@RequestBody @Valid AutorDto dto) {
		service.cadastrar(dto);
	}

	@GetMapping
	public List<AutorDto> listar() {
		return service.listar();
	}

}
