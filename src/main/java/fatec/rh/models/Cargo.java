package fatec.rh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Cargo")
@Getter
@Setter
public class Cargo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private long carg_codigo;

  @Column(nullable = false)
  private String carg_nome;

  @Column(nullable = false)
  private double carg_sal_mes;

  @Column(nullable = false)
  private String carg_descricao;

  @Column(nullable = false)
  @OneToMany(mappedBy = "cargo")
  private List<Associado> associado = new ArrayList<>();
}
