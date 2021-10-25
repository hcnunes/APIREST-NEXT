package school.cesar.next.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import school.cesar.next.project.entity.Usuario;
import school.cesar.next.project.exception.UsuarioNotFoundExecption;
import school.cesar.next.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Transactional
	public List<Usuario> list() {
		return this.usuarioRepository.findAll();
	}

	@Transactional
	public Usuario get(final Long id) {
		return this.usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNotFoundExecption(id));
	}

	@Transactional
	public Usuario update(final Long id, final Usuario newUsuario) {
		return this.usuarioRepository.findById(id).map(usuario -> {
			usuario.setPrimeiroNome(newUsuario.getPrimeiroNome());
			usuario.setUltimoNome(newUsuario.getUltimoNome());
			usuario.setMatricula(newUsuario.getMatricula());
			usuario.setDataNascimento(newUsuario.getDataNascimento());
			usuario.setAtivo(newUsuario.getAtivo());
			usuario.setCentroCusto(newUsuario.getCentroCusto());
			return this.usuarioRepository.save(usuario);
		}).orElseThrow(() -> new UsuarioNotFoundExecption(id));

	}

	@Transactional
	public Usuario save(final Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Transactional
	public void delete(final Long id) {
		this.usuarioRepository
				.delete(this.usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNotFoundExecption(id)));
	}
}
