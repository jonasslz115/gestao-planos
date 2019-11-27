package doenca;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import doenca.payload.DoencaRequest;
import doenca.payload.DoencaResponse;
import doenca.service.DoencaService;

@RestController
@RequestMapping("rest/v1/doenca")
public class DoencaController {
	private DoencaService doencaService;

	public DoencaController(DoencaService doencaService) {
		this.doencaService = doencaService;
	}
	
	@PostMapping
	public Long create(@Valid @RequestBody DoencaRequest doencaRequest) {
		Doenca doenca = doencaService.create(doencaRequest);
		return doenca.getId();
	}
	
	@GetMapping
	public DoencaResponse get(@RequestParam(required = true) Long benefificarioId) {
		Doenca doenca = doencaService.get(benefificarioId);
		
		DoencaResponse doencaResponse = new DoencaResponse();
		doencaResponse.setCodigo(doenca.getCodigo());
		doencaResponse.setDescricao(doenca.getDescricao());
		
		return doencaResponse;
	}
}
