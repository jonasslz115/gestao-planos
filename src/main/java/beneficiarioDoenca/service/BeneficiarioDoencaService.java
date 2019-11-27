package beneficiarioDoenca.service;

import beneficiarioDoenca.BeneficiarioDoenca;
import beneficiarioDoenca.payload.BeneficiarioDoencaRequest;

public interface BeneficiarioDoencaService {
	BeneficiarioDoenca create(BeneficiarioDoencaRequest beneficiarioDoencaRequest);
}
