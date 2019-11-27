package io.teste.beneficiarioDoenca.service;

import java.util.List;

import io.teste.beneficiarioDoenca.BeneficiarioDoenca;
import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaRequest;

public interface BeneficiarioDoencaService {
	BeneficiarioDoenca create(BeneficiarioDoencaRequest beneficiarioDoencaRequest);
	
	List<BeneficiarioDoenca> getBeneficiarioDoencas(Long beneficiarioId);
}
