package school.cesar.next.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import school.cesar.next.project.entity.Projeto;
import school.cesar.next.project.exception.ProjetoNotFoundException;
import school.cesar.next.project.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;

	@Transactional
	public List<Projeto> list() {
		return this.projetoRepository.findAll();
	}

	@Transactional
	public Projeto get(final Long id_projeto) {
		return this.projetoRepository.findById(id_projeto).orElseThrow(() -> new ProjetoNotFoundException(id_projeto));
	}

	@Transactional
	public Projeto update(final Long id_projeto, final Projeto newProjeto) {
		return this.projetoRepository.findById(id_projeto).map(projeto -> {
			projeto.setNomeProjeto(newProjeto.getNomeProjeto());
			projeto.setCentroCustoProjeto(newProjeto.getCentroCustoProjeto());
			projeto.setDataInicioProjeto(newProjeto.getDataInicioProjeto());
			projeto.setDataTerminoProjeto(newProjeto.getDataTerminoProjeto());
			projeto.setFlagProjeto(newProjeto.getFlagProjeto());
			projeto.setStatusProjeto(newProjeto.getStatusProjeto());
			return this.projetoRepository.save(projeto);
		}).orElseThrow(() -> new ProjetoNotFoundException(id_projeto));
	}

	@Transactional
	public Projeto save(final Projeto projeto) {
		return this.projetoRepository.save(projeto);
	}

}
