package beneficiario;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiario")
public class Beneficiario implements Serializable {

	private static final long serialVersionUID = 7626660941798020042L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private	Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;

	public Beneficiario() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
