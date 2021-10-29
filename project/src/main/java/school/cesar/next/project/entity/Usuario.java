package school.cesar.next.project.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(schema = "next_rest_api_schema", name = "usuario", uniqueConstraints = {
		@UniqueConstraint(name = "uk_primeiro_nome", columnNames = { "primeiro_nome" }) })

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@NotEmpty
	@Column(name = "primeiro_nome", nullable = false, length = 100)
	private String primeiroNome;

	@NotEmpty
	@Column(name = "ultimo_nome", nullable = false, length = 100)
	private String ultimoNome;

	@NotEmpty
	@Column(name = "matricula", nullable = false, length = 4)
	private Long matricula;

	@NotEmpty
	@Column(name = "data_nascimento", nullable = false)
	private Date dataNascimento;

	@NotEmpty
	@Column(name = "ativo", nullable = false, length = 10)
	private String ativo;

	@NotEmpty
	@Column(name = "centro_custo", nullable = false, length = 50)
	private String centroCusto;
	
	@NotEmpty
	@Column(name = "id_cargo", nullable = false)
	private Long idCargo;

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}

}
