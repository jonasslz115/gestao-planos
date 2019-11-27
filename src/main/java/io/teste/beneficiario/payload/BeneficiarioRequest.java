package io.teste.beneficiario.payload;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BeneficiarioRequest {
	
	@NotBlank(message = "O nome deve ser informado!")
	@Size(max = 70, message = "O nome deve ter no máximo 70 caracteres!")
	private String nome;
	
	private LocalDate dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
