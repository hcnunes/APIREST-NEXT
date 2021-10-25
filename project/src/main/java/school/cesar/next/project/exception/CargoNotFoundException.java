package school.cesar.next.project.exception;

public class CargoNotFoundException extends RuntimeException {
	
	public CargoNotFoundException(final Long id) {
		super(String.format("Não é possível encontrar o cargo ID %d!", id));
	}

}
