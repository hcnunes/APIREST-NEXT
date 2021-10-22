package school.cesar.next.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import school.cesar.next.project.entity.Projeto;
import school.cesar.next.project.service.ProjectService;



@RestController
@RequestMapping ("")
public class ProjectController {

@Autowired
private ProjectService projectService;
	

	@GetMapping("")
	@ResponseStatus (HttpStatus.OK)
	public @ResponseBody List<Projeto> list(){
		return this.projectService.list();	
	}
}
	
