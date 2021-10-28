package school.cesar.next.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import school.cesar.next.project.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
