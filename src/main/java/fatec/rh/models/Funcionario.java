package fatec.rh.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Funcionario")
@Getter
@Setter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long func_codigo;

    @Column(length = 30, nullable = false)
    private String nome;
    
    @Column(name = "carteira_trab", length = 30, nullable = false)
    private String ctps;

    @Column(nullable = false)
    private Date dt_admissao;

    @Column(nullable = false)
    private Date dt_rescisao;
    
    @Column(nullable = false)
    @OneToMany(mappedBy = "funcionario")
    private List<Associado>associado=new ArrayList<>(); 
}
