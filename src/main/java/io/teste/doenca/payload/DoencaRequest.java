package io.teste.doenca.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DoencaRequest {
	
	@NotBlank(message = "O código deve ser informado!")
	@Size(max = 20, message = "O código deve ter no máximo 20 caracteres!")
	private String codigo;
	
	@NotBlank(message = "A descrição deve ser informada!")
	@Size(max = 100, message = "A descrição deve ter no máximo 100 caracteres!")
	private String descricao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
