package io.teste.beneficiarioDoenca.service;

import io.teste.beneficiarioDoenca.BeneficiarioDoenca;
import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaRequest;

public interface BeneficiarioDoencaService {
	BeneficiarioDoenca create(BeneficiarioDoencaRequest beneficiarioDoencaRequest);
}
