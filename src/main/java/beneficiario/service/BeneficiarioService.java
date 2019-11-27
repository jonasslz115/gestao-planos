package beneficiario.service;

import beneficiario.Beneficiario;
import beneficiario.payload.BeneficiarioRequest;

public interface BeneficiarioService {	
	Beneficiario create(BeneficiarioRequest beneficiarioRequest);
	
	Beneficiario get(Long beneficiarioId);
}
