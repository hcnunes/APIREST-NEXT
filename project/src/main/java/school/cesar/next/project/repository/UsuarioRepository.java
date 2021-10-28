package school.cesar.next.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import school.cesar.next.project.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
