package io.teste.beneficiarioDoenca.payload;

import javax.validation.constraints.NotBlank;

public class BeneficiarioDoencaRequest {
	
	@NotBlank(message = "O beneficiario deve ser informado!")
	private Long beneficiarioId;
	
	@NotBlank(message = "A Doenca deve ser informada!")
	private Long doencaId;

	public Long getBeneficiarioId() {
		return beneficiarioId;
	}

	public void setBeneficiarioId(Long beneficiarioId) {
		this.beneficiarioId = beneficiarioId;
	}

	public Long getDoencaId() {
		return doencaId;
	}

	public void setDoencaId(Long doencaId) {
		this.doencaId = doencaId;
	}
}
