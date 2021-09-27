package br.com.alura.livraria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.alura.livraria.dto.AutorDto;
import br.com.alura.livraria.model.Autor;

@Service
public class AutorService {

	private List<Autor> autores = new ArrayList<Autor>();
	private ModelMapper modelMapper = new ModelMapper();

	public void cadastrar(AutorDto dto) {

		Autor autor = modelMapper.map(dto, Autor.class);
		autores.add(autor);

	}

	public List<AutorDto> listar() {
		return autores.stream().map(a -> modelMapper.map(a, AutorDto.class)).collect(Collectors.toList());
	}

}
