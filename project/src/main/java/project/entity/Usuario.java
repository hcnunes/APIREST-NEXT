package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (schema = "next_rest_api_schema", name = "usuario", uniqueConstraints = {@UniqueConstraint (name = "uk_primeiro_nome", columnNames = { "name" }) })

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    public Long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
	
}
