package school.cesar.next.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import school.cesar.next.project.entity.Usuario;
import school.cesar.next.project.service.UsuarioService;

@RestController
@RequestMapping("")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuarios")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Usuario> list() {
		return this.usuarioService.list();
	}

	@GetMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Usuario get(@PathVariable(value = "id") final Long id) {
		return this.usuarioService.get(id);
	}

	@PutMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Usuario update(@PathVariable(value = "id") final Long id, @RequestBody Usuario usuario) {
		return this.usuarioService.update(id, usuario);
	}

	@PostMapping("/novo/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Usuario save(@RequestBody Usuario usuario) {
		return this.usuarioService.save(usuario);
	}

}
