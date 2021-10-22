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

	public Long getId() {
        return this.id_projeto;
    }
	
	public void setName(String name) {
        this.nome_projeto = name;
    }
	
}
