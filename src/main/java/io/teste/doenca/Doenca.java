package io.teste.doenca;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doenca")
public class Doenca implements Serializable {

	private static final long serialVersionUID = -4191803536576676581L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private	Long id;
	
	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private String descricao;
	
	public Doenca() {		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
