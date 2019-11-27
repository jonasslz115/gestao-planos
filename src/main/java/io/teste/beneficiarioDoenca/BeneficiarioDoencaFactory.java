package io.teste.beneficiarioDoenca;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaResponse;

@Component
public class BeneficiarioDoencaFactory {

	public BeneficiarioDoencaFactory() {
		
	}
	
	public BeneficiarioDoencaResponse create(BeneficiarioDoenca beneficiarioDoenca) {		
		
		BeneficiarioDoencaResponse beneficiarioDoencaResponse = new BeneficiarioDoencaResponse();
		
		beneficiarioDoencaResponse.setCodigo(beneficiarioDoenca.getDoenca().getCodigo());	
		beneficiarioDoencaResponse.setDescricao(beneficiarioDoenca.getDoenca().getDescricao());
		
		return beneficiarioDoencaResponse;
	}
	
	public List<BeneficiarioDoencaResponse> createResponse(List<BeneficiarioDoenca> benerficiarioDoencasList){
		return benerficiarioDoencasList.stream()
                .map(this::create)
                .collect(Collectors.toList());
	}
}
