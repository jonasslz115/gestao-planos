package beneficiarioDoenca.service;

import beneficiario.Beneficiario;
import beneficiario.service.BeneficiarioService;
import beneficiarioDoenca.BeneficiarioDoenca;
import beneficiarioDoenca.BeneficiarioDoencaRepository;
import beneficiarioDoenca.payload.BeneficiarioDoencaRequest;
import doenca.Doenca;
import doenca.service.DoencaService;

public class BeneficiarioDoencaServiceImpl implements BeneficiarioDoencaService{

	private BeneficiarioDoencaRepository beneficiarioDoencaRepository;
	private BeneficiarioService beneficiarioService;
	private DoencaService doencaService;
	
	public BeneficiarioDoencaServiceImpl(BeneficiarioDoencaRepository beneficiarioDoencaRepository,
										 BeneficiarioService beneficiarioService, 
										 DoencaService doencaService) {
		this.beneficiarioDoencaRepository = beneficiarioDoencaRepository;
		this.beneficiarioService = beneficiarioService;
		this.doencaService = doencaService;
	}
	
	@Override
	public BeneficiarioDoenca create(BeneficiarioDoencaRequest beneficiarioDoencaRequest) {
		
		Beneficiario beneficiario = beneficiarioService.get(beneficiarioDoencaRequest.getBeneficiarioId());
		Doenca doenca = doencaService.get(beneficiarioDoencaRequest.getDoencaId());

		BeneficiarioDoenca beneficiarioDoenca = new BeneficiarioDoenca();
		
		
		beneficiarioDoenca.setBeneficiario(beneficiario);
		beneficiarioDoenca.setDoenca(doenca);
		
		return beneficiarioDoencaRepository.save(beneficiarioDoenca);
	}
	
	
}
