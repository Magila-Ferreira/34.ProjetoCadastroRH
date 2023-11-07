package fatec.rh.models;

import java.sql.Date;
//import java.util.ArrayList;
//import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_Funcionario")
@Getter
@Setter
@ToString
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "func_codigo", nullable = false)
    private int id;

    @Column(name = "func_nome", length = 30, nullable = false)
    private String nome;
    
    @Column(name = "func_ctps", length = 30, nullable = false)
    private String ctps;

    @Column(name = "func_dt_admissao", nullable = false)
    private Date admissao;

    @Column(name = "func_dt_rescisao", nullable = false)
    private Date rescisao;
    
    /* 
    @Column(nullable = false)
    @OneToMany(mappedBy = "funcionario")
    private List<Associado>associado=new ArrayList<>(); 
 */
}
