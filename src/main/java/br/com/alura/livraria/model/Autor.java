package br.com.alura.livraria.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String email;
	@NotBlank
	private LocalDate dataNascimento;
	@NotBlank
	private String miniCV;

}
