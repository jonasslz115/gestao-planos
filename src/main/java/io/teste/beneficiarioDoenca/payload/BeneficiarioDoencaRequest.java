package io.teste.beneficiarioDoenca.payload;

public class BeneficiarioDoencaRequest {
	
	// @Size(min = 1, message = "O beneficiario deve ser informado!")
	private Long beneficiarioId;
	
	// @Size(min = 1, message = "A doença deve ser informada!")
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
