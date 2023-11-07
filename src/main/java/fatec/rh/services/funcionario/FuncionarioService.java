package fatec.rh.services.funcionario;

import java.util.List;
import org.springframework.stereotype.Service;
import fatec.rh.models.Funcionario;
import fatec.rh.repository.FuncionarioRepos;

@Service
public class FuncionarioService {
    private FuncionarioRepos repositorio;
    
    public FuncionarioService(FuncionarioRepos repositorio) {
        this.repositorio = repositorio;
    }

    public void inserir(Funcionario funcionario) {
        repositorio.save(funcionario);
    }

    public List<Funcionario> listarFuncionario() {
        return repositorio.findAll();
    }

    public Funcionario listarFuncionario(int id) {
        return repositorio.findById(id).orElse(null);
    }  
}
