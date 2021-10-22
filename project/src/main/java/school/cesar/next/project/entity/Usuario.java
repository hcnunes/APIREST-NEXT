package school.cesar.next.project.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (schema = "next_rest_api_schema", name = "usuario", uniqueConstraints = {@UniqueConstraint (name = "uk_primeiro_nome", columnNames = { "primeiro_nome" }) })

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "primeiro_nome", nullable = false, length = 100)
    private String primeiroNome;
    
    @Column(name = "ultimo_nome", nullable = false, length = 100 )
    private String ultimoNome;
    
    @Column(name = "matricula", nullable = false, length = 4 )
    private String matricula;
    
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    
    @Column(name = "ativo", nullable = false, length = 10)
    private String ativo;
    
    @Column(name = "centro_custo", nullable = false, length = 50)
    private String centroCusto;

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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
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
        
    
    