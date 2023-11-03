package fatec.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fatec.rh.models.Funcionario;

public interface FuncionarioRepos extends JpaRepository<Funcionario, Long> {
}
