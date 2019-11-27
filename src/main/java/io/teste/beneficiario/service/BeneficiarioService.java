package io.teste.beneficiario.service;

import io.teste.beneficiario.Beneficiario;
import io.teste.beneficiario.payload.BeneficiarioRequest;

public interface BeneficiarioService {	
	Beneficiario create(BeneficiarioRequest beneficiarioRequest);
	
	Beneficiario get(Long beneficiarioId);
}
