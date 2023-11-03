package fatec.rh.services;

import org.springframework.stereotype.Service;
import fatec.rh.models.Associado;
import fatec.rh.repositories.AssociadoRepos;

@Service
public class AssociadoService {
    private final AssociadoRepos repositorio;

    public AssociadoService(AssociadoRepos repositorio) {
        this.repositorio = repositorio;
    }

    public void salvar(Associado a) {
        repositorio.save(a);
    }
}
