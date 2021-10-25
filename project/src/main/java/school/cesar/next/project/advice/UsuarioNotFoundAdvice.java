package school.cesar.next.project.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import school.cesar.next.project.exception.UsuarioNotFoundExecption;

@ControllerAdvice
public class UsuarioNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(UsuarioNotFoundExecption.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String usuariotNotFoundHandler(final UsuarioNotFoundExecption exception) {
		return exception.getMessage();
	}

}
