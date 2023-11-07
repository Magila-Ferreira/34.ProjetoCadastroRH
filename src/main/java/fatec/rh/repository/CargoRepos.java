package fatec.rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fatec.rh.models.Cargo;

@Repository
public interface CargoRepos extends JpaRepository<Cargo, Integer> {

}
