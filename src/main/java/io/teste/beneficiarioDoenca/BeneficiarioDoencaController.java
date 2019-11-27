package io.teste.beneficiarioDoenca;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaRequest;
import io.teste.beneficiarioDoenca.service.BeneficiarioDoencaService;

@RestController
@RequestMapping("/rest")
public class BeneficiarioDoencaController {
	
	private BeneficiarioDoencaService beneficiarioDoencaService;
	
	public BeneficiarioDoencaController(BeneficiarioDoencaService beneficiarioDoencaService) {
		this.beneficiarioDoencaService = beneficiarioDoencaService;
	}
	
	@PostMapping("/v1/beneficiario/doenca")
	public String create(@Valid @RequestBody BeneficiarioDoencaRequest beneficiarioDoencaRequest) {
		BeneficiarioDoenca beneficiarioDoenca = beneficiarioDoencaService.create(beneficiarioDoencaRequest);
		
		
		return "Beneficiário '"+beneficiarioDoenca.getBeneficiario().getNome()+"' vinculado à doença '"+beneficiarioDoenca.getDoenca().getDescricao()+"' com sucesso.";
	}
}
