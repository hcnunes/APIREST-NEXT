package school.cesar.next.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import school.cesar.next.project.entity.Projeto;
import school.cesar.next.project.service.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoService projetoService;

	@GetMapping("")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Projeto> list() {
		return this.projetoService.list();
	}

	@GetMapping("/{id_projeto}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Projeto get(@PathVariable(value = "id_projeto") final Long id_projeto) {
		return this.projetoService.get(id_projeto);
	}

	@PutMapping("/{id_projeto}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Projeto update(@PathVariable(value = "id_projeto") final Long id_projeto,
			@RequestBody Projeto projeto) {
		return this.projetoService.update(id_projeto, projeto);
	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Projeto save(@RequestBody Projeto projeto) {
		return this.projetoService.save(projeto);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable(value = "id") final Long id) {
		this.projetoService.delete(id);
	}
}
