package fatec.rh.services.cargo;

import java.util.List;
import org.springframework.stereotype.Service;
import fatec.rh.models.Cargo;
import fatec.rh.repository.CargoRepos;

@Service
public class CargoService {
    private CargoRepos repositorio;

    public CargoService(CargoRepos repositorio) {
        this.repositorio = repositorio;
    }

    public void inserir(Cargo cargo) {
        repositorio.save(cargo);
    }

    public List<Cargo> listarCargo() {
        return repositorio.findAll();
    }

    public Cargo listarCargo(int id) {
        return repositorio.findById(id).orElse(null);
    }
}
