package school.cesar.next.project.exception;

public class ProjetoNotFoundException extends Exception {

	public ProjetoNotFoundException(final Long id_projeto) {
		super(String.format("Não é possível encontrar o projeto ID %d!", id_projeto));
	}

	public ProjetoNotFoundException(String nome_projeto) {
		
	}

}
