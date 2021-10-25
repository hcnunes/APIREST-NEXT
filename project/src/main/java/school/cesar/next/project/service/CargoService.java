package school.cesar.next.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import school.cesar.next.project.entity.Cargo;
import school.cesar.next.project.exception.CargoNotFoundException;
import school.cesar.next.project.exception.UsuarioNotFoundExecption;
import school.cesar.next.project.repository.CargoRepository;

@Service
public class CargoService {

	@Autowired
	private CargoRepository cargoRepository;

	@Transactional
	public List<Cargo> list() {
		return this.cargoRepository.findAll();
	}

	@Transactional
	public Cargo get(final Long id) {
		return this.cargoRepository.findById(id).orElseThrow(() -> new CargoNotFoundException(id));
	}

	@Transactional
	public Cargo update(final Long id, final Cargo newCargo) {
		return this.cargoRepository.findById(id).map(cargo -> {
			cargo.setNome(newCargo.getNome());
			return this.cargoRepository.save(cargo);
		}).orElseThrow(() -> new UsuarioNotFoundExecption(id));
	}

	@Transactional
	public Cargo save(final Cargo cargo) {
		return this.cargoRepository.save(cargo);
	}

	@Transactional
	public void delete(final Long id) {
		this.cargoRepository
				.delete(this.cargoRepository.findById(id).orElseThrow(() -> new CargoNotFoundException(id)));
	}

}
