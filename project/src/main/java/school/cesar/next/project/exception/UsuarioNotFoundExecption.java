package school.cesar.next.project.exception;

public class UsuarioNotFoundExecption extends RuntimeException {

	public UsuarioNotFoundExecption(final Long id) {
		super(String.format("Não é possível encontrar o usuario ID %d!", id));
	}
}
