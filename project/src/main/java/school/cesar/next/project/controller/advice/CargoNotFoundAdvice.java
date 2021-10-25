package school.cesar.next.project.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import school.cesar.next.project.exception.CargoNotFoundException;

@ControllerAdvice
public class CargoNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(CargoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String cargotNotFoundHandler(final CargoNotFoundException exception) {
		return exception.getMessage();
	}

}
