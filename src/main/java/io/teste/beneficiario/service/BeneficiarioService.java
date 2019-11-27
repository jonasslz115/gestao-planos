package io.teste.beneficiario.service;

import java.util.List;

import io.teste.beneficiario.Beneficiario;
import io.teste.beneficiario.payload.BeneficiarioRequest;
import io.teste.doenca.Doenca;

public interface BeneficiarioService {	
	Beneficiario create(BeneficiarioRequest beneficiarioRequest);
	
	Beneficiario get(Long beneficiarioId);
	
	List<Doenca> getDoencas(Long beneficiarioId);
}
