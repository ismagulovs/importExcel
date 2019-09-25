package kz.brk.imports.model;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "stc_tbl_24_balance_prdp")
public class StcTbl24BalancePrdp {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_24_balance_prdp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_24_balance_prdp_id_seq", allocationSize = 1, name = "stc_tbl_24_balance_prdp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld105BlsAktvNchl;
  private BigDecimal fld106BlsAktvKnc;
  private BigDecimal fld107KrtAktvNchl;
  private BigDecimal fld108KrtAktvKnc;
  private BigDecimal fld109DlgAktvNchl;
  private BigDecimal fld110DlgAktvKnc;
  private BigDecimal fld111BlsObzNchl;
  private BigDecimal fld112BlsObzKnc;
  private BigDecimal fld113KrtObzNchl;
  private BigDecimal fld114KrtObzKnc;
  private BigDecimal fld115DlgObzNchl;
  private BigDecimal fld116DlgObzKnc;
  private BigDecimal fld117KptlNchl;
  private BigDecimal fld118KptlKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}