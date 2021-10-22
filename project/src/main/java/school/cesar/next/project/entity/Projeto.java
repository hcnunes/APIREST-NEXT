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
@Table (schema = "next_rest_api_schema", name = "projeto", uniqueConstraints = {@UniqueConstraint (name = "uk_nome_projeto", columnNames = { "nome_projeto" }) })

public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_projeto", nullable = false, updatable = false)
    private Long idProjeto;
	
	@Column(name = "nome_projeto", nullable = false, length = 100)
    private String nomeProjeto;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gerente_projeto", nullable = false)
    private Long gerenteProjeto;
	
	@Column(name = "centro_custo_projeto", nullable = false, length = 100)
    private String centroCustoProjeto;
	
	@Column(name = "data_inicio_projeto", nullable = false)
    private Date dataInicioProjeto;
	
	@Column(name = "data_termino_projeto", nullable = false)
    private Date dataTerminoProjeto;
	
	@Column(name = "status_projeto", nullable = false, length = 100)
    private String statusProjeto;
	
	@Column(name = "flag_projeto", nullable = false, length = 100)
    private String flagProjeto;

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Long getGerenteProjeto() {
		return gerenteProjeto;
	}

	public void setGerenteProjeto(Long gerenteProjeto) {
		this.gerenteProjeto = gerenteProjeto;
	}

	public String getCentroCustoProjeto() {
		return centroCustoProjeto;
	}

	public void setCentroCustoProjeto(String centroCustoProjeto) {
		this.centroCustoProjeto = centroCustoProjeto;
	}

	public Date getDataInicioProjeto() {
		return dataInicioProjeto;
	}

	public void setDataInicioProjeto(Date dataInicioProjeto) {
		this.dataInicioProjeto = dataInicioProjeto;
	}

	public Date getDataTerminoProjeto() {
		return dataTerminoProjeto;
	}

	public void setDataTerminoProjeto(Date dataTerminoProjeto) {
		this.dataTerminoProjeto = dataTerminoProjeto;
	}

	public String getStatusProjeto() {
		return statusProjeto;
	}

	public void setStatusProjeto(String statusProjeto) {
		this.statusProjeto = statusProjeto;
	}

	public String getFlagProjeto() {
		return flagProjeto;
	}

	public void setFlagProjeto(String flagProjeto) {
		this.flagProjeto = flagProjeto;
	}

	
	
}
