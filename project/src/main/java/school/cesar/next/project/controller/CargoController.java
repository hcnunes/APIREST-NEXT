package school.cesar.next.project.controller;

import java.util.List;

import javax.validation.Valid;

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

import school.cesar.next.project.entity.Cargo;
import school.cesar.next.project.exception.CargoNotFoundException;
import school.cesar.next.project.exception.UsuarioNotFoundExecption;
import school.cesar.next.project.service.CargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping({ "", "/" })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Cargo> list() {
		return this.cargoService.list();
	}

	@GetMapping({ "/{id}", "/{id}/" })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Cargo get(@PathVariable(value = "id") final Long id) throws CargoNotFoundException {
		return this.cargoService.get(id);
	}

	@PutMapping({ "/{id}", "/{id}/" })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Cargo update(@PathVariable(value = "id") final Long id, @Valid @RequestBody Cargo cargo)
			throws UsuarioNotFoundExecption {
		return this.cargoService.update(id, cargo);
	}

	@PostMapping({ "", "/" })
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Cargo save(@Valid @RequestBody Cargo cargo) {
		return this.cargoService.save(cargo);
	}

	@DeleteMapping({ "/{id}", "/{id}/" })
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable(value = "id") final Long id) throws CargoNotFoundException {
		this.cargoService.delete(id);
	}

}
