package project.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import project.exception.ProjectNotFoundException;


@ControllerAdvice
public class ProjectNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(ProjectNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String projectNotFoundHandler(final ProjectNotFoundException exception) {
        return exception.getMessage();
    }

}
