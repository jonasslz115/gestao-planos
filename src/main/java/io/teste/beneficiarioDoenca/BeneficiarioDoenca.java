package io.teste.beneficiarioDoenca;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.teste.beneficiario.Beneficiario;
import io.teste.doenca.Doenca;

@Entity
@Table(name = "beneficiario_doenca")
public class BeneficiarioDoenca implements Serializable {
	
	private static final long serialVersionUID = -7896565438953901516L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private	Beneficiario beneficiario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private	Doenca doenca;

	public BeneficiarioDoenca() {		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Doenca getDoenca() {
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
