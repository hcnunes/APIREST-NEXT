package school.cesar.next.project.exception;

public class UsuarioNotFoundExecption extends Exception {
	private static final long serialVersionUID = 1L;

	public UsuarioNotFoundExecption(final Long id) {
		super(String.format("Não é possível encontrar o usuario ID %d!", id));
	}
	
	
	
}
