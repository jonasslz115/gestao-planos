package io.teste.doenca.service;

import org.springframework.stereotype.Service;

import io.teste.doenca.Doenca;
import io.teste.doenca.DoencaRepository;
import io.teste.doenca.payload.DoencaRequest;

@Service
public class DoencaServiceImpl implements DoencaService {

	private DoencaRepository doencaRepository;
	
	public DoencaServiceImpl(DoencaRepository doencaRepository) {
		this.doencaRepository = doencaRepository;
	}

	@Override
	public Doenca create(DoencaRequest doencaRequest) {
		Doenca doenca = new Doenca();
		
		doenca.setCodigo(doencaRequest.getCodigo());
		doenca.setDescricao(doencaRequest.getDescricao());
		
		return doencaRepository.save(doenca);
	}

	@Override
	public Doenca get(Long doencaId) {
		return doencaRepository.findById(doencaId).orElse(null);	
	}
}
