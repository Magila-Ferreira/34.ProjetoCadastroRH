package fatec.rh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_Associado")
@Getter
@Setter
@ToString
public class Associado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(length = 8, nullable = false)
    private Date aloc_inicio;

    @Column(length = 8, nullable = false)
    private Date aloc_fim;

    @Column(nullable = false)
    private double aloc_horas_mes;

    @ManyToOne 
    @JoinColumn(name = "func_codigo", nullable = false)
    private Funcionario funcionario;

    @ManyToOne 
    @JoinColumn(name = "carg_codigo", nullable = false)
    private Cargo cargo;
}
