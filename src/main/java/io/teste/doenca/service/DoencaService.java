package io.teste.doenca.service;

import io.teste.doenca.Doenca;
import io.teste.doenca.payload.DoencaRequest;

public interface DoencaService {
	Doenca create(DoencaRequest doencaRequest);
	
	Doenca get(Long doencaId);
}
