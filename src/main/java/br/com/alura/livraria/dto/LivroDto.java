package br.com.alura.livraria.dto;

import java.time.LocalDate;

import br.com.alura.livraria.model.Autor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDto {
	
	private String titulo;
	private LocalDate dataLancamento;
	private int numeroPaginas;
	private Autor autor;

}
