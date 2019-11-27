package beneficiario.service;

import org.springframework.stereotype.Service;

import beneficiario.Beneficiario;
import beneficiario.BeneficiarioRepository;
import beneficiario.payload.BeneficiarioRequest;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {
	
	private BeneficiarioRepository beneficiarioRepository;
	
	public BeneficiarioServiceImpl(BeneficiarioRepository beneficiarioRepository) {
		this.beneficiarioRepository = beneficiarioRepository;
	}

	@Override
	public Beneficiario create(BeneficiarioRequest beneficiarioRequest) {
		Beneficiario beneficiario = new Beneficiario();
		
		beneficiario.setNome(beneficiarioRequest.getNome());
		beneficiario.setDataNascimento(beneficiarioRequest.getDataNascimento());
		
		return beneficiarioRepository.save(beneficiario);
	}

	@Override
	public Beneficiario get(Long beneficiarioId) {
		return beneficiarioRepository.findById(beneficiarioId).orElse(null);		
	}
}
