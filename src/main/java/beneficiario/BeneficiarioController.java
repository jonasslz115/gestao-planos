package beneficiario;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import beneficiario.payload.BeneficiarioRequest;
import beneficiario.payload.BeneficiarioResponse;
import beneficiario.service.BeneficiarioService;

@RestController
@RequestMapping("rest/v1/beneficiario")
public class BeneficiarioController {
	
	private BeneficiarioService beneficiarioService;

	public BeneficiarioController(BeneficiarioService beneficiarioService) {
		this.beneficiarioService = beneficiarioService;
	}
	
	@PostMapping
	public Long create(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest) {
		Beneficiario beneficiario = beneficiarioService.create(beneficiarioRequest);
		return beneficiario.getId();
	}
	
	@GetMapping
	public BeneficiarioResponse get(@RequestParam(required = true) Long benefificarioId) {
		Beneficiario beneficiario = beneficiarioService.get(benefificarioId);
		
		BeneficiarioResponse beneficiarioResponse = new BeneficiarioResponse();
		beneficiarioResponse.setNome(beneficiario.getNome());
		beneficiarioResponse.setDataNascimento(beneficiario.getDataNascimento());
		
		return beneficiarioResponse;
	}

}
