package project.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import project.entity.Projeto;
import project.repository.*;

@Service
public class ProjectService {

	private final ProjectRepository projectrepository;
	
	@Autowired
	public ProjectService(final ProjectRepository projectrepository) {
		this.projectrepository = projectrepository;
	}
	
	 @Transactional
	    public List<Projeto>list() {
	        return this.projectrepository.findAll();
	    }

}
