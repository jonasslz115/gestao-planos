package doenca.service;

import doenca.Doenca;
import doenca.payload.DoencaRequest;

public interface DoencaService {
	Doenca create(DoencaRequest doencaRequest);
	
	Doenca get(Long doencaId);
}
