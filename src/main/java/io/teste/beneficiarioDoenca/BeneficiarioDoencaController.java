package io.teste.beneficiarioDoenca;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaRequest;
import io.teste.beneficiarioDoenca.payload.BeneficiarioDoencaResponse;
import io.teste.beneficiarioDoenca.service.BeneficiarioDoencaService;

@RestController
@RequestMapping("/rest")
public class BeneficiarioDoencaController {
	
	private BeneficiarioDoencaService beneficiarioDoencaService;
	private BeneficiarioDoencaFactory beneficiarioDoencaFactory;
	
	public BeneficiarioDoencaController(BeneficiarioDoencaService beneficiarioDoencaService, 
										BeneficiarioDoencaFactory beneficiarioDoencaFactory) {
		this.beneficiarioDoencaService = beneficiarioDoencaService;
		this.beneficiarioDoencaFactory = beneficiarioDoencaFactory;
	}
	
	@PostMapping("/v1/beneficiario/doenca")
	public String create(@Valid @RequestBody BeneficiarioDoencaRequest beneficiarioDoencaRequest) {
		BeneficiarioDoenca beneficiarioDoenca = beneficiarioDoencaService.create(beneficiarioDoencaRequest);
				
		return "Beneficiário '"+beneficiarioDoenca.getBeneficiario().getNome()+"' vinculado à doença '"+beneficiarioDoenca.getDoenca().getDescricao()+"' com sucesso.";
	}
	
	@GetMapping("/v1/beneficiario/{beneficiarioId}/doencas")
	public List<BeneficiarioDoencaResponse> getBeneficiarioDoencas(@PathVariable(value = "beneficiarioId") Long beneficiarioId) {
		
		List<BeneficiarioDoenca> beneficiarioDoencasList = this.beneficiarioDoencaService.getBeneficiarioDoencas(beneficiarioId);		
				
		return beneficiarioDoencaFactory.createResponse(beneficiarioDoencasList);
	}
}
