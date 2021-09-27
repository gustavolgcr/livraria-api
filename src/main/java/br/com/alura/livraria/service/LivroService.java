package br.com.alura.livraria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.alura.livraria.dto.LivroDto;
import br.com.alura.livraria.dto.LivroFormDto;
import br.com.alura.livraria.model.Livro;

@Service
public class LivroService {

	private List<Livro> livros = new ArrayList<Livro>();
	private ModelMapper modelMapper = new ModelMapper();

	public void cadastrar(LivroFormDto dto) {
		Livro livro = modelMapper.map(dto, Livro.class);
		livros.add(livro);
	}

	public List<LivroDto> listar() {
		return livros.stream().map(l -> modelMapper.map(l, LivroDto.class)).collect(Collectors.toList());
	}

}
