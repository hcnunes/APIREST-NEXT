package school.cesar.next.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.cesar.next.project.entity.Projeto;
import school.cesar.next.project.repository.ProjetoRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjetoRepository projetoRepository;
	
	    public List<Projeto>list() {
	        return this.projetoRepository.findAll();
	    }
}
