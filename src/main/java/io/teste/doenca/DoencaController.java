package io.teste.doenca;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.teste.doenca.payload.DoencaRequest;
import io.teste.doenca.payload.DoencaResponse;
import io.teste.doenca.service.DoencaService;

@RestController
@RequestMapping("/rest")
public class DoencaController {
	private DoencaService doencaService;

	public DoencaController(DoencaService doencaService) {
		this.doencaService = doencaService;
	}
	
	@PostMapping ("/v1/doenca")
	public Long create(@Valid @RequestBody DoencaRequest doencaRequest) {
		Doenca doenca = doencaService.create(doencaRequest);
		return doenca.getId();
	}
	
	@GetMapping ("/v1/doenca/{benefificarioId}")
	public DoencaResponse get(@RequestParam(required = true) Long benefificarioId) {
		Doenca doenca = doencaService.get(benefificarioId);
		
		DoencaResponse doencaResponse = new DoencaResponse();
		doencaResponse.setCodigo(doenca.getCodigo());
		doencaResponse.setDescricao(doenca.getDescricao());
		
		return doencaResponse;
	}
}
