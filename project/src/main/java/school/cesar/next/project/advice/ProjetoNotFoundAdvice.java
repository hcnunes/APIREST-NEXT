package school.cesar.next.project.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import school.cesar.next.project.exception.ProjetoNotFoundException;

@ControllerAdvice
public class ProjetoNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ProjetoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String projectNotFoundHandler(final ProjetoNotFoundException exception) {
		return exception.getMessage();
	}

}
