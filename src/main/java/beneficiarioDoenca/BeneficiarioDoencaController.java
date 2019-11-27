package beneficiarioDoenca;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import beneficiario.Beneficiario;
import beneficiarioDoenca.payload.BeneficiarioDoencaRequest;
import beneficiarioDoenca.service.BeneficiarioDoencaService;

public class BeneficiarioDoencaController {
	
	private BeneficiarioDoencaService beneficiarioDoencaService;
	
	public BeneficiarioDoencaController(BeneficiarioDoencaService beneficiarioDoencaService) {
		this.beneficiarioDoencaService = beneficiarioDoencaService;
	}
	
	@PostMapping
	public String create(@Valid @RequestBody BeneficiarioDoencaRequest beneficiarioDoencaRequest) {
		BeneficiarioDoenca beneficiarioDoenca = beneficiarioDoencaService.create(beneficiarioDoencaRequest);
		
		
		return "Beneficiário '"+beneficiarioDoenca.getBeneficiario().getNome()+"' vinculado à doença '"+beneficiarioDoenca.getDoenca().getDescricao()+"' com sucesso.";
	}
}
