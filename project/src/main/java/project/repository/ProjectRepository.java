package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.Projeto;

public interface ProjectRepository extends JpaRepository<Projeto, Long> {

}
