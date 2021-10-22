package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import project.entity.Projeto;

import antlr.collections.List;
import project.service.ProjectService;

@Controller
@SpringBootApplication
public class ProjectController {

	private final ProjectService projectservice;
	
	@Autowired
	public ProjectController(final ProjectService projectservice) {
		this.projectservice = projectservice;
	}
	
	@GetMapping({"", "/"})
	@ResponseStatus (HttpStatus.OK)
	public @ResponseBody List<Projeto> list(){
		return this.projectservice.list();
	}
	
}
