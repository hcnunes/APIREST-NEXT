package school.cesar.next.project.exception;

public class ProjectNotFoundException extends RuntimeException {
	
	public ProjectNotFoundException(final Long id) {
        super(String.format("Não é possível encontrar o projeto ID %d!", id));
    }

}
