package fatec.rh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import java.util.ArrayList;
//import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_Cargo")
@Getter
@Setter
@ToString
public class Cargo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="carg_codigo", nullable = false)
  private int id;

  @Column(name="carg_nome", length = 30, nullable = false)
  private String nome;

  @Column(name="carg_descricao", length = 30, nullable = false)
  private String descricao;

  @Column(name="carg_sal_mes", nullable = false)
  private double salario;

  /* @Column(nullable = false)
  @OneToMany(mappedBy = "cargo")
  private List<Associado> associado = new ArrayList<>(); */
}
