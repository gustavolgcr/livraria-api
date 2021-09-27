package br.com.alura.livraria.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro {

	@NotBlank
	@Length(min = 10)
	private String titulo;
	@NotBlank
	@PastOrPresent
	private LocalDate dataLancamento;
	@NotBlank
	@Length(min = 10)
	private int numeroPaginas;
	@NotBlank
	private Autor autor;
}
