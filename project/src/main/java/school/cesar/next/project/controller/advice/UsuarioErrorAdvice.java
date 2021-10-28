package school.cesar.next.project.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import school.cesar.next.project.exception.UsuarioEmptyNameExecption;
import school.cesar.next.project.exception.UsuarioNotFoundExecption;

@ControllerAdvice
public class UsuarioErrorAdvice {

	@ResponseBody
	@ExceptionHandler(UsuarioNotFoundExecption.class)
	public String usuariotNotFoundHandler(final UsuarioNotFoundExecption exception) {
		return exception.getMessage();
	}

	@ResponseBody
	@ExceptionHandler(UsuarioEmptyNameExecption.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String usuarioEmptyNameHandler(final UsuarioEmptyNameExecption exception) {
		return exception.getMessage();
	}

}
