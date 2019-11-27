package io.teste.beneficiarioDoenca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.teste.beneficiario.Beneficiario;
import io.teste.beneficiario.service.BeneficiarioService;
import io.teste.beneficiarioDoenca.BeneficiarioDoenca;
import io.teste.beneficiarioDoenca.BeneficiarioDoencaRepository;
import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaRequest;
import io.teste.doenca.Doenca;
import io.teste.doenca.service.DoencaService;

@Service
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

	@Override
	public List<BeneficiarioDoenca> getBeneficiarioDoencas(Long beneficiarioId) {
		return beneficiarioDoencaRepository.findByBeneficiarioId(beneficiarioId);
	}

}
