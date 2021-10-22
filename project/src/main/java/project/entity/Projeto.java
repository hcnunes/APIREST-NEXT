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
@Table (schema = "next_rest_api_schema", name = "projeto", uniqueConstraints = {@UniqueConstraint (name = "uk_nome_projeto", columnNames = { "nome_projeto" }) })

public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_projeto", nullable = false, updatable = false)
    private Long id_projeto;
	
	@Column(name = "nome_projeto", nullable = false, length = 100)
    private String nome_projeto;
	
	@Column(name = "gerente_projeto", nullable = false)
    private Long gerente_projeto;
	
	@Column(name = "centro_custo_projeto", nullable = false, length = 100)
    private String centro_custo_projeto;
	
	@Column(name = "data_inicio_projeto", nullable = false)
    private Date data_inicio_projeto;
	
	@Column(name = "data_termino_projeto", nullable = false)
    private Date data_termino_projeto;
	
	@Column(name = "status_projeto", nullable = false, length = 100)
    private String status_projeto;
	
	@Column(name = "flag_projeto", nullable = false, length = 100)
    private String flag_projeto;

	public Long getIdProjeto() {
        return this.id_projeto;
    }
	
	public void setIdProjeto(Long id_projeto) {
        this.id_projeto = id_projeto;
    }
	
	public String getNomeProjeto() {
        return this.nome_projeto;
    }
	
	public void setNomeProjeto(String nome_projeto) {
        this.nome_projeto = nome_projeto;
    }
	
	public Long getGerenteProjeto() {
        return this.gerente_projeto;
    }
	
	public void setGerenteProjeto(Long gerente_projeto) {
        this.gerente_projeto = gerente_projeto;
    }
	
	public String getCentroCustoProjeto() {
        return this.centro_custo_projeto;
    }
	
	public void setCentroCustoProjeto(String centro_custo_projeto) {
        this.centro_custo_projeto = centro_custo_projeto;
    }
	
	public Date getDataInicioProjeto() {
        return this.data_inicio_projeto;
    }
	
	public void setDataInicioProjeto(Date data_inicio_projeto) {
        this.data_inicio_projeto = data_inicio_projeto;
    }
	
	public Date getDataTerminoProjeto() {
        return this.data_termino_projeto;
    }
	
	public void setDataTerminoProjeto(Date data_termino_projeto) {
        this.data_termino_projeto = data_termino_projeto;
    }
	
	public String getStatusProjeto() {
        return this.status_projeto;
    }
	
	public void setStatusProjeto(String status_projeto) {
        this.status_projeto = status_projeto;
    }
	
	public String getFlagProjeto() {
        return this.flag_projeto;
    }
	
	public void setFlagProjeto(String flag_projeto) {
        this.flag_projeto = flag_projeto;
    }
	
	
}
