package io.teste.beneficiario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.teste.beneficiario.Beneficiario;
import io.teste.beneficiario.BeneficiarioRepository;
import io.teste.beneficiario.payload.BeneficiarioRequest;
import io.teste.doenca.Doenca;

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

	@Override
	public List<Doenca> getDoencas(Long beneficiarioId) {
		// TODO Auto-generated method stub
		return null;
	}
}
