package doenca.service;

import doenca.Doenca;
import doenca.DoencaRepository;
import doenca.payload.DoencaRequest;

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
