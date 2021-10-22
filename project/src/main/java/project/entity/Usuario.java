package project.entity;

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
    private String primeiro_nome;
    
    @Column(name = "ultimo_nome", nullable = false, length = 100 )
    private String ultimo_nome;
    
    @Column(name = "matricula", nullable = false, length = 4 )
    private String matricula;
    
    @Column(name = "data_nascimento", nullable = false)
    private Date data_nascimento;
    
    @Column(name = "ativo", nullable = false, length = 10)
    private String ativo;
    
    @Column(name = "centro_custo", nullable = false, length = 50)
    private String centro_custo;
        
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPrimeiroNome() {
        return this.primeiro_nome;
    }
    
    public void setPrimeiroNome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }
    
    public String getUltimoNome() {
        return this.ultimo_nome;
    }
    
    public void setUltimoNome(String ultimo_nome) {
        this.ultimo_nome = ultimo_nome;
    }
	
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Date getDataNascimento() {
        return this.data_nascimento;
    }
    
    public void setDataNascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public String getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    public String getCentroCusto() {
        return this.centro_custo;
    }
    
    public void setCentroCusto(String centro_custo) {
        this.centro_custo = centro_custo;
    }
}
