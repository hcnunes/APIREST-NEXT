package school.cesar.next.project.exception;

public class UsuarioEmptyNameExecption extends Exception {
	private static final long serialVersionUID = 1L;

	public UsuarioEmptyNameExecption() {
		super(String.format("Não é possível atualizar um usuário sem o primeiro e último nome"));
	}

}
