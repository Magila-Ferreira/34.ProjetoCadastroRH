package fatec.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fatec.rh.models.Cargo;

public interface CargoRepos extends JpaRepository<Cargo,Long> {
    
}
